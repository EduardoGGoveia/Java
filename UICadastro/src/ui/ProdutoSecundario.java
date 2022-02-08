package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;

public class ProdutoSecundario extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProdutoSecundario frame = new ProdutoSecundario();
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
	public ProdutoSecundario() {
		setTitle("Produto");
		setBounds(100, 100, 714, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Filtrar Pelo Nome");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		table = new JTable();
		table.setBorder(new EmptyBorder(0, 0, 0, 0));
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSurrendersFocusOnKeystroke(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), "HD"},
				{new Integer(2), null},
			},
			new String[] {
				"ID", "Nome"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		
		JLabel lblNewLabel_2 = new JLabel("Fornecedor");
		
		JLabel lblNewLabel_3 = new JLabel("Estoque");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Valor");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Cancelar");
		
		JButton btnSalvar = new JButton("Salvar");
		
		JButton btnNewButton_1_1 = new JButton("Excluir");
		
		JButton btnNewButton_1_2 = new JButton("Alterar");
		
		JButton btnNewButton_2 = new JButton("Novo");
		
		JButton btnNewButton_3 = new JButton("Selecionar Produto");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(table, GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_2)
												.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
											.addPreferredGap(ComponentPlacement.RELATED))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addGap(54)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(28)
											.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
										.addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))))
							.addContainerGap())
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton_3)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_2)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(19)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(92)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnSalvar)
						.addComponent(btnNewButton_1_1)
						.addComponent(btnNewButton_1_2)
						.addComponent(btnNewButton_2)
						.addComponent(btnNewButton_3)))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
