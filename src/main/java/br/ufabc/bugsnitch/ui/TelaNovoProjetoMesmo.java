package br.ufabc.bugsnitch.ui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;

public class TelaNovoProjetoMesmo extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TelaNovoProjetoMesmo() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setBounds(10, 29, 26, 14);
		add(lblNewLabel);
		
		JLabel lblUsuarios = new JLabel("Usuarios");
		lblUsuarios.setBounds(10, 72, 46, 14);
		add(lblUsuarios);
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(70, 72, 307, 90);
		add(table);
		
		JButton btnNewButton = new JButton("Adicionar Usuario");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(132, 173, 166, 42);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(70, 26, 307, 20);
		add(textField);
		textField.setColumns(10);
		
		JButton btnCriarProjeto = new JButton("Criar Projeto");
		btnCriarProjeto.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCriarProjeto.setBounds(132, 353, 166, 42);
		add(btnCriarProjeto);
		
		JLabel lblreas = new JLabel("\u00C1reas");
		lblreas.setBounds(10, 253, 46, 14);
		add(lblreas);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(70, 253, 307, 84);
		add(textArea);

	}
}
