package Model;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import Controller.Conexao;

public class ModelCadastro {

	public String sql;
	public BufferedImage buffImg;
	public Conexao con = new Conexao();
	public Statement st;
	public ResultSet rs;
	
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
	
	public void CadastroUsuário(String Login, String Senha, String Nome, String CEP, String NCasa, String RGI, String CPF, int TipoUsuario) 
	{
		Random rd = new Random();
		Color color;
		int PX1 = rd.nextInt(buffImg.getWidth());
		int PX2 = rd.nextInt(buffImg.getWidth());
		int PX3 = rd.nextInt(buffImg.getWidth());
		int PY1 = rd.nextInt(buffImg.getHeight());
		int PY2 = rd.nextInt(buffImg.getHeight());
		int PY3 = rd.nextInt(buffImg.getHeight());
		color = new Color(buffImg.getRGB(PX1, PY1));
		int RPXY1 = color.getRed();
		int GPXY1 = color.getGreen();
		int BPXY1 = color.getBlue();
		color = new Color(buffImg.getRGB(PX2, PY2));
		int RPXY2 = color.getRed();
		int GPXY2 = color.getGreen();
		int BPXY2 = color.getBlue();
		color = new Color(buffImg.getRGB(PX3, PY3));
		int RPXY3 = color.getRed();
		int GPXY3 = color.getGreen();
		int BPXY3 = color.getBlue();
		
		
		sql = "exec IncUsuarios '" + Login + "', '" + Senha + "', '" + Nome + "', '" + CEP + "', '" + NCasa + "', " + RGI + ", '" + CPF + "', " +
			  PX1 + ", " + PX2 + ", " + PX3 + ", " + PY1 + ", " + PY2 + ", " + PY3 + ", " +
			  RPXY1 + ", " + GPXY1 + ", " + BPXY1 + ", " +
			  RPXY2 + ", " + GPXY2 + ", " + BPXY2 + ", " +
			  RPXY3 + ", " + GPXY3 + ", " + BPXY3 + ", " +
			  TipoUsuario;
		
		try {
			st = con.getConexao().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
