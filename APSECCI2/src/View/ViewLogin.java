package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import Controller.ControllerLogin;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.DropMode;

public class ViewLogin extends JFrame {

	public JPanel LoginPanel;
	public JFrame LoginFrame;
	
	//Labels and Buttons
		public JButton btnExit = new JButton("");
		public JLabel lblLogin = new JLabel("Login");
		public JButton btnSelectImage = new JButton("");
		public JLabel lblImageSelect = new JLabel("");
		public JLabel lblPassword = new JLabel("Senha");
		public JButton btnEntrar = new JButton("");
		public JTextField txtLogin = new JTextField();
		
		public JTextField txtPass = new JTextField();
		
		public JLabel lblCadastrese = new JLabel("");
	
		
		
		//Fim Labels and Buttons


	
	//Icones
	public ImageIcon IExit1 = new ImageIcon(getClass().getResource("/Imagens/BtnExit1.png"));
	public ImageIcon IExit2 = new ImageIcon(getClass().getResource("/Imagens/BtnExit2.png"));
	public ImageIcon ILogin = new ImageIcon(getClass().getResource("/Imagens/ImgLogin.png"));
	public ImageIcon IPassword = new ImageIcon(getClass().getResource("/Imagens/ImgPassword.png"));
	public ImageIcon ISelectImage = new ImageIcon(getClass().getResource("/Imagens/imgSelecionar.png"));
	public ImageIcon ISelectImage2 = new ImageIcon(getClass().getResource("/Imagens/imgSelecionar2.png"));
	public ImageIcon IEntrar = new ImageIcon(getClass().getResource("/Imagens/imgEntrar.png"));
	public ImageIcon IEntrar2 = new ImageIcon(getClass().getResource("/Imagens/imgEntrar2.png"));
	private final JLabel lblImgFundo = new JLabel("");
	

	//Fim Icones
	/**
	 * Create the frame.
	 */
	public ViewLogin() {
	
		LoginFrame = new JFrame("Login");
		setBounds(100, 100, 504, 401);
		LoginPanel = new JPanel();
		LoginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(LoginPanel);
		LoginPanel.setLayout(null);
		this.setUndecorated(true);
		this.setVisible(true);
		lblLogin.setForeground(Color.LIGHT_GRAY);
		lblLogin.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		
		
		
		lblLogin.setIcon(null);
		lblLogin.setBounds(30, 72, 63, 42);
		
		
		

	
		btnExit.setIcon(new ImageIcon(ViewLogin.class.getResource("/Imagens/BtnExit3.png")));
		btnExit.setBounds(471, 0, 33, 32);
		txtLogin.setToolTipText("");
		txtLogin.setBackground(Color.LIGHT_GRAY);
		
		
	
		txtLogin.setBounds(103, 76, 138, 32);
		txtLogin.setColumns(10);
		
		
		lblPassword.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblPassword.setForeground(Color.LIGHT_GRAY);
		lblPassword.setBounds(30, 130, 75, 32);
		txtPass.setToolTipText("");
		txtPass.setBackground(Color.LIGHT_GRAY);
		
		
		
		txtPass.setColumns(10);
		txtPass.setBounds(103, 129, 138, 32);
		btnSelectImage.setIcon(new ImageIcon(ViewLogin.class.getResource("/Imagens/Selecioneumaimagem2.jpg")));
		btnSelectImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSelectImage.setBounds(30, 200, 181, 32);
		
		
		
		lblImageSelect.setForeground(Color.BLACK);
		lblImageSelect.setBounds(115, 243, 266, 158);
		lblImageSelect.setBackground(Color.DARK_GRAY);
		
		
		
		btnEntrar.setIcon(new ImageIcon(ViewLogin.class.getResource("/Imagens/imgEntrar3.png")));
		btnEntrar.setBounds(279, 98, 102, 32);
	

		LoginPanel.add(txtLogin);
		LoginPanel.add(btnExit);
		LoginPanel.add(lblLogin);
		LoginPanel.add(lblPassword);
		LoginPanel.add(txtPass);
		LoginPanel.add(btnSelectImage);
		LoginPanel.add(lblImageSelect);
		LoginPanel.add(btnEntrar);
		lblCadastrese.setIcon(new ImageIcon(ViewLogin.class.getResource("/Imagens/button_cadastre-se.png")));
		lblCadastrese.setForeground(Color.LIGHT_GRAY);
		lblCadastrese.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblCadastrese.setBounds(247, 200, 176, 32);
		
		LoginPanel.add(lblCadastrese);
		lblImgFundo.setIcon(new ImageIcon(ViewLogin.class.getResource("/Imagens/Possiveltela.jpg")));
		lblImgFundo.setBounds(0, 0, 504, 401);
		
		LoginPanel.add(lblImgFundo);

		
		
		
	}
	
	


}
