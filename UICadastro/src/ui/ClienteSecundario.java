package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.SystemColor;
import java.awt.Color;

public class ClienteSecundario extends JFrame {

	private JPanel contentPane;
	private JTextField txtJksdfksdhasjkdfhakjsd;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public ClienteSecundario() {
		setBackground(SystemColor.textHighlight);
		setTitle("Cliente");
		setBounds(100, 100, 739, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_5 = new JButton("Pesquisar");
		btnNewButton_5.setMnemonic('p');
		btnNewButton_5.setFont(new Font("Arial", Font.PLAIN, 11));
		
		txtJksdfksdhasjkdfhakjsd = new JTextField();
		txtJksdfksdhasjkdfhakjsd.setFont(new Font("Arial", Font.PLAIN, 11));
		txtJksdfksdhasjkdfhakjsd.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Filtrar por nome");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JLabel lblNewLabel_2 = new JLabel("Endere\u00E7o");
		
		JLabel lblNewLabel_3 = new JLabel("Bairro");
		
		JLabel lblNewLabel_4 = new JLabel("UF");
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Cidade");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial", Font.PLAIN, 11));
		comboBox.setToolTipText("MT");
		comboBox.setMaximumRowCount(100);
		
		JLabel lblNewLabel_4_1 = new JLabel("CEP");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Telefone");
		
		JButton btnNewButton_5_1 = new JButton("Cancelar");
		btnNewButton_5_1.setMnemonic('c');
		btnNewButton_5_1.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_5_2 = new JButton("Salvar");
		btnNewButton_5_2.setMnemonic('s');
		btnNewButton_5_2.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_5_3 = new JButton("Excluir");
		btnNewButton_5_3.setMnemonic('e');
		btnNewButton_5_3.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_5_4 = new JButton("Alterar");
		btnNewButton_5_4.setMnemonic('a');
		btnNewButton_5_4.setFont(new Font("Arial", Font.PLAIN, 11));
		
		JButton btnNewButton_5_5 = new JButton("Novo");
		btnNewButton_5_5.setMnemonic('n');
		btnNewButton_5_5.setFont(new Font("Arial", Font.PLAIN, 11));
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setFillsViewportHeight(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"ID", "Nome"},
				{new Integer(2), "Bruno"},
				{new Integer(3), "Gabriel"},
				{new Integer(4), null},
			},
			new String[] {
				"ID", "Nome"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(205);
		table.getColumnModel().getColumn(1).setPreferredWidth(223);
		table.setFont(new Font("Arial", Font.PLAIN, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtJksdfksdhasjkdfhakjsd, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(105)
							.addComponent(btnNewButton_5_5, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5_4, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5_2, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
											.addGap(47)
											.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
									.addGap(15)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel_3_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_4_1_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(textField_4, Alignment.LEADING)
									.addComponent(textField, Alignment.LEADING)
									.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE))))
						.addComponent(table, GroupLayout.PREFERRED_SIZE, 545, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(143, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtJksdfksdhasjkdfhakjsd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(btnNewButton_5))
					.addGap(29)
					.addComponent(table, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3_1)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4_1_1))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(75)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_5_5, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5_4, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5_3, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5_2, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_5_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
