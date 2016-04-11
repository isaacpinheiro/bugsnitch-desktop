package bugSnitch;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TelaNovoProjeto extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public TelaNovoProjeto() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Titulo");
		lblNewLabel.setBounds(10, 31, 46, 14);
		add(lblNewLabel);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o");
		lblDescrio.setBounds(10, 66, 46, 14);
		add(lblDescrio);
		
		JLabel lblSeveridade = new JLabel("Severidade");
		lblSeveridade.setBounds(10, 165, 64, 14);
		add(lblSeveridade);
		
		JLabel lblPrioridade = new JLabel("Prioridade de Solu\u00E7\u00E3o");
		lblPrioridade.setBounds(10, 201, 103, 14);
		add(lblPrioridade);
		
		textField = new JTextField();
		textField.setBounds(130, 28, 190, 20);
		add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(130, 66, 190, 69);
		add(textArea);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(130, 162, 190, 20);
		add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(130, 198, 190, 20);
		add(comboBox_1);
		
		JButton btnNewButton = new JButton("Catalogar");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(124, 322, 103, 37);
		add(btnNewButton);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(130, 242, 190, 59);
		add(textArea_1);
		
		JLabel lblUsuarios = new JLabel("Usuarios Responsaveis");
		lblUsuarios.setBounds(10, 247, 110, 14);
		add(lblUsuarios);

	}
}
