package br.ufabc.bugsnitch.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

import java.util.List;

import br.ufabc.bugsnitch.dao.UsuarioDAO;
import br.ufabc.bugsnitch.model.Usuario;

public class Teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "Teste");
				
				UsuarioDAO uDAO = new UsuarioDAO();
				List<Usuario> usuarios = uDAO.findAll();
				
				for(Usuario u : usuarios){
					lblNomes.setText(lblNomes.getText() + "\n" + u.getNome());
				}
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		lblNomes = new JLabel("Nomes:");
		contentPane.add(lblNomes, BorderLayout.NORTH);
	}
	
	JLabel lblNomes;

}
