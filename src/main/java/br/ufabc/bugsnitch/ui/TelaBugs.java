package bugSnitch;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class TelaBugs extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public TelaBugs() {
		
		table = new JTable();
		table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		table.setBounds(10, 11, 471, 270);
		
		JButton btnNewButton = new JButton("Adicionar Bug");
		btnNewButton.setBounds(332, 305, 149, 42);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnAdicionarMembro = new JButton("Adicionar \u00C1rea");
		btnAdicionarMembro.setFont(new Font("Arial", Font.PLAIN, 16));
		btnAdicionarMembro.setBounds(10, 305, 149, 42);
		btnAdicionarMembro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setLayout(null);
		add(btnAdicionarMembro);
		add(table);
		add(btnNewButton);

	}
}
