package View;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;

import javax.swing.*;

public class ViewCadastro {

	public JFrame CadastroFrame;
	public JPanel CadastroPanel;
	
	public JTextField txtLogin;
	public JLabel imgLogin;
	
	public JPasswordField txtSenha;
	public JLabel imgSenha;
	
	public JTextField txtNomeCompleto;
	public JLabel imgNomeCompleto;
	
	public JTextField txtCEP;
	public JLabel imgCEP;
	
	public JTextField txtNumCasa;
	public JLabel imgNumCasa;
	
	public JTextField txtRGI;
	public JLabel imgRGI;
	
	public JTextField txtCPF;
	public JLabel imgCPF;
	
	public JLabel btnSelectImage;
	public JLabel imgSelectedImage;
	
	public JLabel Cadastrar;
	
	public ImageIcon ILogin = new ImageIcon(getClass().getResource("/Imagens/imgLoginCadastro.png"));
	public ImageIcon IPassword = new ImageIcon(getClass().getResource("/Imagens/imgPasswordCadastro.png"));
	public ImageIcon INomeCompleto = new ImageIcon(getClass().getResource("/Imagens/imgNomeComp.png"));
	public ImageIcon ICEP = new ImageIcon(getClass().getResource("/Imagens/imgCEP.png"));
	public ImageIcon INumCasa = new ImageIcon(getClass().getResource("/Imagens/imgNCasa.png"));
	public ImageIcon IRGI = new ImageIcon(getClass().getResource("/Imagens/imgRGI.png"));
	public ImageIcon ICPF = new ImageIcon(getClass().getResource("/Imagens/imgCPF.png"));
	public ImageIcon ISelectImage = new ImageIcon(getClass().getResource("/Imagens/imgSelecionarCadastro.png"));
	public ImageIcon ISelectImage2 = new ImageIcon(getClass().getResource("/Imagens/imgSelecionarCadastro2.png"));
	public ImageIcon ICadastrar = new ImageIcon(getClass().getResource("/Imagens/imgCadastrar.png"));
	public ImageIcon ICadastrar2 = new ImageIcon(getClass().getResource("/Imagens/imgCadastrar2.png"));
	
	public ViewCadastro() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
	    Dimension dS = toolkit.getScreenSize();
		
	    CadastroFrame = new JFrame("Cadastro");
	    CadastroFrame.setLayout(null);
	    CadastroFrame.setSize(600,801);
	    CadastroFrame.setBounds(((dS.width/2)-(CadastroFrame.getWidth()/2)), ((dS.height/2)-(CadastroFrame.getHeight()/2)),CadastroFrame.getWidth(),CadastroFrame.getHeight());
		CadastroFrame.setUndecorated(true);
		CadastroFrame.setVisible(true);
		CadastroFrame.setBackground(new Color(1.0f,1.0f,1.0f,0f));

		CadastroFrame.addComponentListener(new ComponentAdapter() { 
			public void componentResized(ComponentEvent e) { 
				CadastroFrame.setShape(new RoundRectangle2D.Double(0, 0, CadastroFrame.getWidth(), CadastroFrame.getHeight(), 25, 25)); 
			}
		});
		
		CadastroPanel = new JPanel();
		CadastroPanel.setBounds(0,0,600,800);
		CadastroPanel.setBackground(Color.decode("#000000"));
		CadastroPanel.setLayout(null);
		
		
		//Labels - Buttons - TextFields
		
		imgLogin = new JLabel();
		imgLogin.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,30,208,32);
		SetScaleImage(ILogin, imgLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,70,208,32);
		txtLogin.setFont(new Font("Calibri", Font.BOLD, 24));
		txtLogin.setForeground(Color.decode("#FFFFFF"));
		txtLogin.setBackground(Color.decode("#084B8A"));
		txtLogin.setBorder(null);
		txtLogin.setCaretColor(Color.decode("#FFFFFF"));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgSenha = new JLabel();
		imgSenha.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,120,208,32);
		SetScaleImage(IPassword, imgSenha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,160,208,32);
		txtSenha.setFont(new Font("Calibri", Font.BOLD, 24));
		txtSenha.setForeground(Color.decode("#FFFFFF"));
		txtSenha.setBackground(Color.decode("#084B8A"));
		txtSenha.setBorder(null);
		txtSenha.setCaretColor(Color.decode("#FFFFFF"));
		txtSenha.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgNomeCompleto = new JLabel();
		imgNomeCompleto.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,210,208,32);
		SetScaleImage(INomeCompleto, imgNomeCompleto);
		
		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,250,208,32);
		txtNomeCompleto.setFont(new Font("Calibri", Font.BOLD, 24));
		txtNomeCompleto.setForeground(Color.decode("#FFFFFF"));
		txtNomeCompleto.setBackground(Color.decode("#084B8A"));
		txtNomeCompleto.setBorder(null);
		txtNomeCompleto.setCaretColor(Color.decode("#FFFFFF"));
		txtNomeCompleto.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgCEP = new JLabel();
		imgCEP.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,300,208,32);
		SetScaleImage(ICEP, imgCEP);
		
		txtCEP = Limitar(0);
		txtCEP.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,340,208,32);
		txtCEP.setFont(new Font("Calibri", Font.BOLD, 24));
		txtCEP.setForeground(Color.decode("#FFFFFF"));
		txtCEP.setBackground(Color.decode("#084B8A"));
		txtCEP.setBorder(null);
		txtCEP.setCaretColor(Color.decode("#FFFFFF"));
		txtCEP.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgNumCasa = new JLabel();
		imgNumCasa.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,390,208,32);
		SetScaleImage(INumCasa, imgNumCasa);
		
		txtNumCasa = Limitar(2);
		txtNumCasa.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,430,208,32);
		txtNumCasa.setFont(new Font("Calibri", Font.BOLD, 24));
		txtNumCasa.setForeground(Color.decode("#FFFFFF"));
		txtNumCasa.setBackground(Color.decode("#084B8A"));
		txtNumCasa.setBorder(null);
		txtNumCasa.setCaretColor(Color.decode("#FFFFFF"));
		txtNumCasa.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgRGI = new JLabel();
		imgRGI.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,480,208,32);
		SetScaleImage(IRGI, imgRGI);
		
		txtRGI = Limitar(-1);
		txtRGI.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,520,208,32);
		txtRGI.setFont(new Font("Calibri", Font.BOLD, 24));
		txtRGI.setForeground(Color.decode("#FFFFFF"));
		txtRGI.setBackground(Color.decode("#084B8A"));
		txtRGI.setBorder(null);
		txtRGI.setCaretColor(Color.decode("#FFFFFF"));
		txtRGI.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgRGI = new JLabel();
		imgRGI.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,480,208,32);
		SetScaleImage(IRGI, imgRGI);
		
		txtRGI = Limitar(-1);
		txtRGI.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,520,208,32);
		txtRGI.setFont(new Font("Calibri", Font.BOLD, 24));
		txtRGI.setForeground(Color.decode("#FFFFFF"));
		txtRGI.setBackground(Color.decode("#084B8A"));
		txtRGI.setBorder(null);
		txtRGI.setCaretColor(Color.decode("#FFFFFF"));
		txtRGI.setHorizontalAlignment(SwingConstants.CENTER);
		
		imgCPF = new JLabel();
		imgCPF.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,570,208,32);
		SetScaleImage(ICPF, imgCPF);
		
		txtCPF = Limitar(1);
		txtCPF.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,610,208,32);
		txtCPF.setFont(new Font("Calibri", Font.BOLD, 24));
		txtCPF.setForeground(Color.decode("#FFFFFF"));
		txtCPF.setBackground(Color.decode("#084B8A"));
		txtCPF.setBorder(null);
		txtCPF.setCaretColor(Color.decode("#FFFFFF"));
		txtCPF.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnSelectImage = new JLabel();
		btnSelectImage.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,660,208,32);
		SetScaleImage(ISelectImage, btnSelectImage);
		
		imgSelectedImage = new JLabel();
		imgSelectedImage.setBounds(370,600,208,128);
		imgSelectedImage.setBackground(Color.red);
		imgSelectedImage.setBorder(BorderFactory.createLineBorder(Color.white, 1));
		
		Cadastrar = new JLabel();
		Cadastrar.setBounds(((CadastroPanel.getWidth()/2)-(208/2))-50,720,208,32);
		SetScaleImage(ICadastrar, Cadastrar);
		
		//Fim Labels - Buttons - TextFields
		
		CadastroPanel.add(imgLogin);
		CadastroPanel.add(txtLogin);
		CadastroPanel.add(imgSenha);
		CadastroPanel.add(txtSenha);
		CadastroPanel.add(imgNomeCompleto);
		CadastroPanel.add(txtNomeCompleto);
		CadastroPanel.add(imgCEP);
		CadastroPanel.add(txtCEP);
		CadastroPanel.add(imgNumCasa);
		CadastroPanel.add(txtNumCasa);
		CadastroPanel.add(imgRGI);
		CadastroPanel.add(txtRGI);
		CadastroPanel.add(imgCPF);
		CadastroPanel.add(txtCPF);
		CadastroPanel.add(btnSelectImage);
		CadastroPanel.add(imgSelectedImage);
		CadastroPanel.add(Cadastrar);
		
		CadastroFrame.add(CadastroPanel);
		CadastroFrame.setSize(600,800);
	}
	
	
	
	public void SetScaleImage(ImageIcon icon, JLabel lblButton) {
		ImageIcon scaledImageIcon = new ImageIcon(icon.getImage().getScaledInstance(lblButton.getWidth(), lblButton.getHeight(), java.awt.Image.SCALE_SMOOTH));
		lblButton.setIcon(scaledImageIcon);
	}
	
	public JTextField Limitar(int Tipo) {
		try
	    {
			if(Tipo == 0) {
		        javax.swing.text.MaskFormatter CEP = new javax.swing.text.MaskFormatter("*****-***");
		 
		        CEP.setValidCharacters("0123456789");
		 
		        return new javax.swing.JFormattedTextField(CEP);
			}
			else if (Tipo == 1) {
				javax.swing.text.MaskFormatter CPF = new javax.swing.text.MaskFormatter("***.***.***-**");
				 
		        CPF.setValidCharacters("0123456789");
		 
		        return new javax.swing.JFormattedTextField(CPF);
			}
			else if (Tipo == 2) {
				javax.swing.text.MaskFormatter NCasa = new javax.swing.text.MaskFormatter("*******");

		        return new javax.swing.JFormattedTextField(NCasa);
			}
			else {
		        return new JTextField();
			}
	    }
	    catch (Exception e)
	    {      
	        //mensagem se acontecer erro
	        JOptionPane.showMessageDialog(null,"Ocorreu um erro");
	        //retorno um campo de texto comum  
	        return new JTextField();
	    }
	}
	
}
