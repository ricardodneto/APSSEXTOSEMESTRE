package Controller;

import java.awt.Cursor;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Model.ModelCadastro;
import View.ViewCadastro;

public class ControllerCadastro extends ViewCadastro {

	ModelCadastro ML = new ModelCadastro();
	
	public ControllerCadastro() {
		txtCPF.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent arg0) {}

			public void focusGained(FocusEvent arg0) {
				txtCPF.setCaretPosition(0);			
			}
		});
		
		txtCEP.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent arg0) {}

			public void focusGained(FocusEvent arg0) {
				txtCEP.setCaretPosition(0);			
			}
		});
		
		txtNumCasa.addFocusListener(new FocusListener() {
			
			public void focusLost(FocusEvent arg0) {}

			public void focusGained(FocusEvent arg0) {
				txtNumCasa.setCaretPosition(0);			
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
				SetScaleImage(ISelectImage, btnSelectImage);
				btnSelectImage.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				SetScaleImage(ISelectImage2, btnSelectImage);
				btnSelectImage.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ML.SelecionarImagem(imgSelectedImage);
			}
		});
		
		Cadastrar.addMouseListener(new MouseListener() {
			
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
				SetScaleImage(ICadastrar, Cadastrar);
				Cadastrar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				SetScaleImage(ICadastrar2, Cadastrar);
				Cadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) {
				ML.CadastroUsuário(txtLogin.getText(),txtSenha.getText(),txtNomeCompleto.getText(),txtCEP.getText(),txtNumCasa.getText(),txtRGI.getText(),txtCPF.getText(),0);
			}
		});
	}
	
}
