package Model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import Controller.Conexao;


public class ModelLogin {

	public BufferedImage buffImg;
	public Conexao con = new Conexao();
	public String sql;
	public Statement st;
	public ResultSet rs;
	public int Count;
	public int IDUsuario;
	public int TipoUsuario;
	
	
	public void SelecionarImagem(JLabel lblImage) {
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, PNG Images", "jpg", "png");
		chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
        	File imagemFile = chooser.getSelectedFile();
			try {
				buffImg = ImageIO.read(imagemFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	ImageIcon selectImage = new ImageIcon(imagemFile.getAbsolutePath());
        	ImageIcon scaledImageIcon = new ImageIcon(selectImage.getImage().getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), java.awt.Image.SCALE_SMOOTH));
        	lblImage.setIcon(scaledImageIcon);
        }
        else {
        	JOptionPane.showMessageDialog(null, "Você não selecionou uma imagem!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
	}
		
	public void LoginUsuário(String Login, String Senha, BufferedImage Image) {
		Count = Connect("Select * From Usuarios");
		int R1, R2, R3, G1, G2, G3, B1, B2, B3;
		try {
			for(int i = 0; i < Count; i++) {
				Color RGBsImage = new Color(Image.getRGB(rs.getInt("PontoX1"), rs.getInt("PontoY1")));
				R1 = RGBsImage.getRed();
				G1 = RGBsImage.getGreen();
				B1 = RGBsImage.getBlue();
				
				RGBsImage = new Color(Image.getRGB(rs.getInt("PontoX2"), rs.getInt("PontoY2")));
				R2 = RGBsImage.getRed();
				G2 = RGBsImage.getGreen();
				B2 = RGBsImage.getBlue();
				
				RGBsImage = new Color(Image.getRGB(rs.getInt("PontoX3"), rs.getInt("PontoY3")));
				R3 = RGBsImage.getRed();
				G3 = RGBsImage.getGreen();
				B3 = RGBsImage.getBlue();
				
				if(Login.equals(rs.getString("Login")) && Senha.equals(rs.getString("Senha"))) {
					if(R1 == rs.getInt("RPXY1") && G1 == rs.getInt("GPXY1") && B1 == rs.getInt("BPXY1")) {
						if(R2 == rs.getInt("RPXY2") && G2 == rs.getInt("GPXY2") && B2 == rs.getInt("BPXY2")) {
							if(R3 == rs.getInt("RPXY3") && G3 == rs.getInt("GPXY3") && B3 == rs.getInt("BPXY3")) {
								JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!", "Logon", JOptionPane.OK_OPTION);
								IDUsuario = rs.getInt("ID");
								TipoUsuario = rs.getInt("TipoUsuario");
								System.out.println(IDUsuario);
								System.out.println(TipoUsuario);
							}
							else {
								JOptionPane.showMessageDialog(null, "Falha na Autenticação 3", "Erro", JOptionPane.WARNING_MESSAGE);
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Falha na Autenticação 2", "Erro", JOptionPane.WARNING_MESSAGE);
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Falha na Autenticação 1", "Erro", JOptionPane.WARNING_MESSAGE);
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos", "Erro", JOptionPane.WARNING_MESSAGE);
				}
			
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int Connect(String CommandSql) {
		try {
			sql = CommandSql;
			st = con.getConexao().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = st.executeQuery(sql);
			rs.last();
			int count = rs.getRow();
			rs.first();
			return count;
		}
		catch(Exception e){
			e.printStackTrace();
			return 0;
		}
	}
	
}
