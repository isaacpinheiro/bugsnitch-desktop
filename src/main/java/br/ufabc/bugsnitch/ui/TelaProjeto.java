package br.ufabc.bugsnitch.ui;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.border.TitledBorder;

public class TelaProjeto extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaProjeto() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(86, 98, 157, 20);
		add(comboBox);
		
		JButton btnCriarProjeto = new JButton("Criar \r\nProjeto");
		btnCriarProjeto.setBounds(86, 213, 157, 43);
		btnCriarProjeto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCriarProjeto.setFont(new Font("Arial", Font.PLAIN, 16));
		add(btnCriarProjeto);
		
		JLabel label = new JLabel("Selecione o Projeto:");
		label.setBounds(115, 73, 102, 14);
		add(label);
		
		JLabel lblSelecioneArea = new JLabel("Selecione a \u00C1rea:");
		lblSelecioneArea.setEnabled(false);
		lblSelecioneArea.setBounds(126, 149, 102, 14);
		add(lblSelecioneArea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setBounds(86, 174, 157, 20);
		add(comboBox_1);
		
		JList list = new JList();
		list.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		list.setBounds(40, 267, 253, 77);
		add(list);
		
		JLabel lblNewLabel = new JLabel("Bem Vindos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(40, 11, 261, 32);
		add(lblNewLabel);
		
		
	}
}
