package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class ViewCadastro2 {

	private JFrame frame;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField txtNomeCompleto;
	private JTextField textField;
	private JTextField txtNumCasa;
	private JTextField textField_1;
	private JTextField txtCPF;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public ViewCadastro2() {
		frame = new JFrame();
		frame.setBounds(100, 100, 411, 546);
		frame.getContentPane().setLayout(null);
		frame.setUndecorated(true);
		
		
		JLabel lblEscolhaUmLogin = new JLabel("Login\r\n");
		lblEscolhaUmLogin.setForeground(new Color(0, 153, 255));
		lblEscolhaUmLogin.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblEscolhaUmLogin.setBounds(10, 41, 82, 42);
		frame.getContentPane().add(lblEscolhaUmLogin);
		
		JLabel lblCadastreSE = new JLabel("Cadastro ");
		lblCadastreSE.setForeground(Color.LIGHT_GRAY);
		lblCadastreSE.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblCadastreSE.setBounds(138, 6, 105, 42);
		frame.getContentPane().add(lblCadastreSE);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("");
		txtLogin.setColumns(10);
		txtLogin.setBackground(Color.LIGHT_GRAY);
		txtLogin.setBounds(10, 74, 138, 32);
		frame.getContentPane().add(txtLogin);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(0, 153, 255));
		lblSenha.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblSenha.setBounds(10, 127, 82, 42);
		frame.getContentPane().add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setToolTipText("");
		txtSenha.setColumns(10);
		txtSenha.setBackground(Color.LIGHT_GRAY);
		txtSenha.setBounds(10, 162, 138, 32);
		frame.getContentPane().add(txtSenha);
		
		JLabel lblNomeCompleto = new JLabel("Nome Completo\r\n");
		lblNomeCompleto.setForeground(new Color(0, 153, 255));
		lblNomeCompleto.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblNomeCompleto.setBounds(10, 221, 185, 42);
		frame.getContentPane().add(lblNomeCompleto);
		
		txtNomeCompleto = new JTextField();
		txtNomeCompleto.setToolTipText("");
		txtNomeCompleto.setColumns(10);
		txtNomeCompleto.setBackground(Color.LIGHT_GRAY);
		txtNomeCompleto.setBounds(10, 257, 138, 32);
		frame.getContentPane().add(txtNomeCompleto);
		
		JLabel lblCep = new JLabel("CEP\r\n");
		lblCep.setForeground(Color.LIGHT_GRAY);
		lblCep.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblCep.setBounds(10, 312, 185, 42);
		frame.getContentPane().add(lblCep);
		
		textField = new JTextField();
		textField.setToolTipText("");
		textField.setColumns(10);
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(10, 347, 138, 32);
		frame.getContentPane().add(textField);
		
		JLabel lblNumcasa = new JLabel("Numero da Casa");
		lblNumcasa.setForeground(Color.LIGHT_GRAY);
		lblNumcasa.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblNumcasa.setBounds(222, 41, 179, 42);
		frame.getContentPane().add(lblNumcasa);
		
		txtNumCasa = new JTextField();
		txtNumCasa.setToolTipText("");
		txtNumCasa.setColumns(10);
		txtNumCasa.setBackground(Color.LIGHT_GRAY);
		txtNumCasa.setBounds(222, 80, 138, 32);
		frame.getContentPane().add(txtNumCasa);
		
		JLabel lblRgi = new JLabel("RGI");
		lblRgi.setForeground(new Color(0, 153, 255));
		lblRgi.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblRgi.setBounds(222, 127, 82, 42);
		frame.getContentPane().add(lblRgi);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("");
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(222, 168, 138, 32);
		frame.getContentPane().add(textField_1);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setForeground(new Color(255, 255, 255));
		lblCpf.setFont(new Font("Cooper Black", Font.PLAIN, 22));
		lblCpf.setBounds(222, 221, 82, 42);
		frame.getContentPane().add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setToolTipText("");
		txtCPF.setColumns(10);
		txtCPF.setBackground(Color.LIGHT_GRAY);
		txtCPF.setBounds(222, 263, 138, 32);
		frame.getContentPane().add(txtCPF);
		
		JLabel lblImg = new JLabel("");
		lblImg.setIcon(new ImageIcon(ViewCadastro2.class.getResource("/Imagens/BackgroundCADASTRO.png")));
		lblImg.setBounds(-273, -77, 1102, 545);
		frame.getContentPane().add(lblImg);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	}
}
