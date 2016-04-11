package br.ufabc.bugsnitch.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;

public class TelaCadastroUsuario extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Create the panel.
	 */
	public TelaCadastroUsuario() {
		setLayout(null);
		
		JLabel lblNome = new JLabel("Usuario");
		lblNome.setBounds(21, 50, 46, 14);
		add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(119, 47, 171, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(21, 92, 46, 14);
		add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 89, 171, 20);
		add(textField_1);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(21, 145, 46, 14);
		add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(119, 142, 171, 20);
		add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(119, 187, 171, 20);
		add(passwordField_1);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setBounds(21, 180, 94, 35);
		add(lblConfirmarSenha);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(119, 230, 116, 41);
		add(btnNewButton);

	}
}
