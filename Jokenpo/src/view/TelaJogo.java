package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Jokenpo;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;



public class TelaJogo extends JFrame{

	private JPanel contentPane;
	Random gerador = new Random();
	int V,E,D;
	String v,e,d;
	JLabel lblV = new JLabel("0");
	JLabel lblD = new JLabel("0");
	JLabel lblE = new JLabel("0");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TelaJogo();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaJogo() {
		setTitle("JOKENPO");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDerrotas = new JLabel("Derrotas:");
		lblDerrotas.setBounds(12, 132, 70, 14);
		contentPane.add(lblDerrotas);
		
		JLabel lblTitulo = new JLabel("JOKENPO");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(125, 30, 150, 33);
		getContentPane().add(lblTitulo);
		lblTitulo.setFont(new Font("Arial",Font.PLAIN, 25));
		
		JButton btnPedra = new JButton("Pedra");
		
		btnPedra.setBackground(new Color(135, 206, 235));
		btnPedra.setBounds(86, 267, 70, 70);
		btnPedra.setFocusPainted(false);
		btnPedra.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("Papel");
		
		btnPapel.setBackground(new Color(255, 255, 240));
		btnPapel.setBounds(166, 267, 70, 70);
		btnPapel.setFocusPainted(false);
		btnPapel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("Tesoura");
		
		btnTesoura.setBackground(new Color(240, 248, 255));
		btnTesoura.setBounds(246, 267, 70, 70);
		btnTesoura.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
		btnTesoura.setFocusPainted(false);
		contentPane.add(btnTesoura);
		
		JLabel lblPlayer = new JLabel("-");
		lblPlayer.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer.setBounds(166, 207, 70, 26);
		contentPane.add(lblPlayer);
		
		JLabel lblCpu = new JLabel("-");
		lblCpu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpu.setBounds(166, 103, 70, 26);
		contentPane.add(lblCpu);
		
		JLabel lblNewLabel = new JLabel("x");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(166, 151, 70, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPU");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(166, 88, 70, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Player");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(166, 194, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(263, 151, 70, 14);
		contentPane.add(lblResultado);
		
		JLabel lblWin = new JLabel("Vitorias:");
		lblWin.setBounds(12, 88, 70, 14);
		contentPane.add(lblWin);
		
		JLabel lblEmpate = new JLabel("Empates:");
		lblEmpate.setBounds(12, 109, 70, 14);
		contentPane.add(lblEmpate);
		
		
		lblV.setBounds(81, 88, 46, 14);
		contentPane.add(lblV);
		
		
		lblE.setBounds(81, 109, 46, 14);
		contentPane.add(lblE);
		
		
		lblD.setBounds(81, 132, 46, 14);
		contentPane.add(lblD);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 85, 110, 65);
		contentPane.add(panel);
		
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = gerador.nextInt(1,4);
				String res = Jokenpo.JKP(1, num);
				lblResultado.setText(res);
				lblPlayer.setText("Pedra");
				lblCpu.setText(Jokenpo.Ppt(num));
				Resultado(res);
				
			}
		});
		
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = gerador.nextInt(1,4);
				String res = Jokenpo.JKP(2, num);
				lblResultado.setText(res);
				lblPlayer.setText("Papel");
				lblCpu.setText(Jokenpo.Ppt(num));
				Resultado(res);
			}
		});

		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = gerador.nextInt(1,4);
				String res = Jokenpo.JKP(3, num);
				lblResultado.setText(res);
				lblPlayer.setText("Tesoura");
				lblCpu.setText(Jokenpo.Ppt(num));
				Resultado(res);
			}
		});
	}
	
	public void Resultado(String res) {
		switch(res) {
		case "vencedor" -> V++;
		case "Empate" -> E++;
		case "Perdedor" -> D++;
		}
		v = Integer.toString(V);
		e = Integer.toString(E);
		d = Integer.toString(D);
		
		lblV.setText(v);
		lblE.setText(e);
		lblD.setText(d);
		
	}
}
