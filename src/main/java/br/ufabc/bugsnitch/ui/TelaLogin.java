package bugSnitch;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.border.TitledBorder;

public class TelaLogin extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 16));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		
		JLabel lblSenha = new JLabel("Senha");
		
		JLabel lblBugsnitch = new JLabel("BugSnitch");
		lblBugsnitch.setFont(new Font("Arial", Font.PLAIN, 30));
		
		passwordField = new JPasswordField();
		
		JButton btnNewButton = new JButton("Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(96)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addComponent(textField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
							.addComponent(passwordField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(124)
							.addComponent(lblSenha)
							.addPreferredGap(ComponentPlacement.RELATED, 132, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(122)
							.addComponent(lblUsuario)
							.addPreferredGap(ComponentPlacement.RELATED, 128, GroupLayout.PREFERRED_SIZE)))
					.addGap(93))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(168)
					.addComponent(lblBugsnitch)
					.addContainerGap(169, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(lblBugsnitch)
					.addGap(31)
					.addComponent(lblUsuario)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSenha)
					.addGap(11)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
					.addGap(106))
		);
		setLayout(groupLayout);

	}
}
