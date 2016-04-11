package bugSnitch;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JButton;

public class TelaBug extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public TelaBug() {
		setLayout(null);
		
		JLabel label = new JLabel("Titulo");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 22));
		label.setBounds(82, 23, 227, 31);
		add(label);
		
		JLabel label_1 = new JLabel("Descri\u00E7\u00E3o");
		label_1.setBounds(10, 83, 46, 14);
		add(label_1);
		
		JLabel label_2 = new JLabel("Severidade");
		label_2.setBounds(10, 182, 64, 14);
		add(label_2);
		
		JLabel label_3 = new JLabel("Prioridade de Solu\u00E7\u00E3o");
		label_3.setBounds(10, 218, 103, 14);
		add(label_3);
		
		JLabel label_4 = new JLabel("Usuarios Responsaveis");
		label_4.setBounds(10, 264, 110, 14);
		add(label_4);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(130, 83, 190, 69);
		add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(130, 259, 190, 59);
		add(textArea_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(130, 179, 190, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(130, 215, 190, 20);
		add(textField_2);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(32, 360, 326, 59);
		add(editorPane);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(167, 335, 110, 14);
		add(lblComentarios);
		
		JButton btnNewButton = new JButton("Submeter");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.setBounds(119, 437, 170, 31);
		add(btnNewButton);

	}
}
