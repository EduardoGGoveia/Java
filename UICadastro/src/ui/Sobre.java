package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.JList;
import java.awt.Color;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre frame = new Sobre();
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
	public Sobre() {
		setBackground(Color.BLACK);
		setBounds(100, 100, 345, 433);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Curso: Inform\u00E1tica 2\u00BA ano");
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblDiscenteEduardoGuilherme = new JLabel("Discente: Bruno Gabriel Palmeira da Costa Paniago");
		lblDiscenteEduardoGuilherme.setForeground(Color.WHITE);
		
		JLabel lblDocenteCleber = new JLabel("Docente: Cleber Alves Feitosa");
		lblDocenteCleber.setForeground(Color.WHITE);
		lblDocenteCleber.setBackground(Color.BLACK);
		
		JTextPane txtpnPf = new JTextPane();
		txtpnPf.setBackground(Color.DARK_GRAY);
		txtpnPf.setForeground(Color.WHITE);
		txtpnPf.setText("Atividade desenvolvida como Prova Final na disciplina de LInguagem de Programa\u00E7\u00E3o I no 2\u00BA ano de EMI em Inform\u00E1tica - 2021");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblDiscenteEduardoGuilherme)
								.addComponent(lblDocenteCleber)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(txtpnPf, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)))
					.addGap(45))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(43)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(lblDiscenteEduardoGuilherme)
					.addGap(18)
					.addComponent(lblDocenteCleber)
					.addGap(50)
					.addComponent(txtpnPf, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
					.addGap(87))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
