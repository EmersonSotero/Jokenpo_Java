package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame{



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TelaInicial tela = new TelaInicial();
	}
	/**
	 * Create the application.
	 */
	public TelaInicial() {
		getContentPane().setBackground(new Color(135, 206, 250));
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("JOKENPO");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("JOKENPO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(125, 30, 150, 33);
		getContentPane().add(lblTitulo);
		lblTitulo.setFont(new Font("Arial",Font.PLAIN, 25));
		
		JButton btnJogar = new JButton("Jogar");
		btnJogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TelaJogo.main(null);
				
			}
		});
		btnJogar.setBackground(new Color(100, 149, 237));
		btnJogar.setBounds(155, 160, 90, 25);
		getContentPane().add(btnJogar);
	}
}
