package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.Insets;
import javax.swing.JMenu;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class CadastroPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPrincipal frame = new CadastroPrincipal();
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
	public CadastroPrincipal() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("Sistema de Vendas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 446);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuSistema = new JMenu("Sistema");
		menuSistema.setForeground(SystemColor.desktop);
		menuSistema.setFont(new Font("Arial", Font.PLAIN, 10));
		menuSistema.setMnemonic('s');
		menuBar.add(menuSistema);
		
		JMenuItem itemMenuSistema = new JMenuItem("Sair");
		itemMenuSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		itemMenuSistema.setSelected(true);
		itemMenuSistema.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		menuSistema.add(itemMenuSistema);
		
		JMenu menuCadastro = new JMenu("Cadastro");
		menuCadastro.setForeground(SystemColor.desktop);
		menuCadastro.setFont(new Font("Arial", Font.PLAIN, 10));
		menuCadastro.setMnemonic('c');
		menuBar.add(menuCadastro);
		
		JMenuItem itemMenuCliente = new JMenuItem("Cliente");
		itemMenuCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClienteSecundario clientesecundario = new ClienteSecundario();
				clientesecundario.setVisible(true);
			}
		});
		itemMenuCliente.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_MASK));
		menuCadastro.add(itemMenuCliente);
		
		JMenuItem itemMenuFornecedor = new JMenuItem("Fornecedor");
		itemMenuFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProdutoSecundario produtosecundario = new ProdutoSecundario();
				produtosecundario.setVisible(true);
			}
		});
		itemMenuFornecedor.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_MASK));
		menuCadastro.add(itemMenuFornecedor);
		
		JMenuItem itemMenuProdutos = new JMenuItem("Produtos");
		itemMenuProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProdutoSecundario produtosecundario = new ProdutoSecundario();
				produtosecundario.setVisible(true);
			}
		});
		itemMenuProdutos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_MASK));
		menuCadastro.add(itemMenuProdutos);
		
		JMenuItem itemMenuUsuario = new JMenuItem("Usu\u00E1rio");
		itemMenuUsuario.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U, InputEvent.CTRL_MASK));
		menuCadastro.add(itemMenuUsuario);
		
		JMenu menuVendas = new JMenu("Vendas");
		menuVendas.setForeground(SystemColor.desktop);
		menuVendas.setFont(new Font("Arial", Font.PLAIN, 10));
		menuVendas.setMnemonic('v');
		menuBar.add(menuVendas);
		
		JMenu menuRelatórios = new JMenu("Relat\u00F3rios");
		menuRelatórios.setForeground(SystemColor.desktop);
		menuRelatórios.setFont(new Font("Arial", Font.PLAIN, 10));
		menuRelatórios.setMnemonic('r');
		menuBar.add(menuRelatórios);
		
		JMenu menuSobre = new JMenu("Sobre");
		menuSobre.setForeground(SystemColor.desktop);
		menuSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		menuSobre.setFont(new Font("Arial", Font.PLAIN, 10));
		menuSobre.setMnemonic('b');
		menuBar.add(menuSobre);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sobre");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sobre sobre = new Sobre();
				sobre.setVisible(true);
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		menuSobre.add(mntmNewMenuItem);
	}

}
