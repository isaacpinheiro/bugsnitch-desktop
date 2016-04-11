package br.ufabc.bugsnitch.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class TelaNovoUsuarioProjeto extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public TelaNovoUsuarioProjeto() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(10, 11, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(53, 8, 177, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblFuno = new JLabel("Fun\u00E7\u00E3o");
		lblFuno.setBounds(10, 62, 46, 14);
		add(lblFuno);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(53, 59, 177, 20);
		add(textField_1);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(53, 99, 137, 40);
		add(btnNewButton);

	}

}
