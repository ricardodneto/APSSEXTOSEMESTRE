package Controller;

import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import Model.ModelLogin;
import View.ViewLogin;

public class ControllerLogin extends ViewLogin{

	ModelLogin ML = new ModelLogin();
	
	public ControllerLogin() {
		AddEventsLabelsAndButtons();
	}
	
	public void AddEventsLabelsAndButtons() {
		btnExit.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
		
				btnExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				btnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				switch (e.getButton()) {
	                case MouseEvent.BUTTON1:
	                	if(JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "SABESP", 0) == JOptionPane.YES_OPTION) {
	                		System.exit(0);
	                	}
	                    break;
	                default:
	                	break;
				}
			}
		});
	
		btnSelectImage.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			
				btnSelectImage.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			
				btnSelectImage.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ML.SelecionarImagem(lblImageSelect);
			}
		});
		
		btnEntrar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				btnEntrar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
			
				btnEntrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ML.LoginUsuário(txtLogin.getText(), txtPass.getText(), ML.buffImg);
				System.out.println(txtLogin.getText() + " " + txtPass.getText());
			//	new ControllerCadastro();
			//	JOptionPane.showInputDialog("Voce entrou no sistema");
				LoginFrame.dispose();
			}
		});
		
		lblCadastrese.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				new ControllerCadastro();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				lblCadastrese.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
				lblCadastrese.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				
			}
			
		});
	}
}
