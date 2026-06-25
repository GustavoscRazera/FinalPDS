package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TelaCadastro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEditora;
	private JTextField txtCnpj;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	
	private JButton btnEntrar;
	private JComboBox<String> comboBox;
	

	private JButton btnMostrarTabela;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
	    setBackground(new Color(128, 255, 0));
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    setSize(1920, 1080);
	    setLocationRelativeTo(null);

	    contentPane = new JPanel();
	    contentPane.setBackground(new Color(175, 244, 198));
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(new MigLayout("", "[247.00][12.00][150.00,grow][150.00][118.00]", "[][][][][693.00,grow][][][][]"));

	    JLabel lblNewLabel = new JLabel("");

	    ImageIcon logoOriginal = new ImageIcon(
	            TelaCadastro.class.getResource("/imagens/Logo.png"));

	    Image logoRedimensionada = logoOriginal.getImage().getScaledInstance(
	            300,   // largura
	            150,   // altura
	            Image.SCALE_SMOOTH);

	    lblNewLabel.setIcon(new ImageIcon(logoRedimensionada));

	    contentPane.add(lblNewLabel, "cell 0 0 1 2");
	    
	    JLabel lblNewLabel_2 = new JLabel("Cadastro de Editora:");
	    lblNewLabel_2.setForeground(new Color(10, 86, 27));
	    lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 48));
	    contentPane.add(lblNewLabel_2, "cell 2 1,alignx center,aligny bottom");
	    
	    JPanel panel = new ImagePanel();
	    panel.setOpaque(false);
	    contentPane.add(panel, "cell 2 4,grow");
	    panel.setLayout(new MigLayout("", "[234.00][733.00,grow,center][83.00][165.00]", "[23.00][][][28.00][][][][24.00][][][][][27.00][][][][][][65.00][][][]"));
	    
	    JLabel lblNewLabel_1 = new JLabel("Nome da Editora");
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	    panel.add(lblNewLabel_1, "cell 0 1 4 1,alignx center");
	    
	    txtEditora = new JTextField();
	    panel.add(txtEditora, "cell 1 2,growx");
	    txtEditora.setColumns(10);
	    
	    JLabel lblNewLabel_1_1_1 = new JLabel("CNPJ");
	    lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	    panel.add(lblNewLabel_1_1_1, "cell 0 4 4 1,growx");
	    
	    txtCnpj = new JTextField();
	    txtCnpj.setColumns(10);
	    panel.add(txtCnpj, "cell 1 6,growx");
	    
	    JLabel lblNewLabel_1_1_1_1 = new JLabel("Telefone");
	    lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	    panel.add(lblNewLabel_1_1_1_1, "cell 0 9 4 1,alignx center");
	    
	    txtTelefone = new JTextField();
	    txtTelefone.setColumns(10);
	    panel.add(txtTelefone, "cell 1 11,growx");
	    
	    JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Email");
	    lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	    panel.add(lblNewLabel_1_1_1_1_1, "cell 0 13 4 1,growx");
	    
	    txtEmail = new JTextField();
	    txtEmail.setColumns(10);
	    panel.add(txtEmail, "cell 1 15,growx");
	    
	    JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Tipo");
	    lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 30));
	    panel.add(lblNewLabel_1_1_1_1_1_1, "cell 0 17 4 1,alignx center,aligny center");
	    
	    comboBox = new JComboBox<>();
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tradicional", "Independente"}));
	    panel.add(comboBox, "cell 1 18,growx");
	    
	    btnEntrar = new JButton("");
	    btnEntrar.setContentAreaFilled(false);
	    btnEntrar.setBorderPainted(false);
	    btnEntrar.setIcon(new ImageIcon(TelaCadastro.class.getResource("/imagens/Group 11.png")));
	    panel.add(btnEntrar, "flowx,cell 1 20");
	    
	    JPanel panel_1 = new JPanel();
	    panel.add(panel_1, "cell 1 20");
	    
	    JPanel panel_2 = new JPanel();
	    panel.add(panel_2, "cell 1 20");
	    
	    btnMostrarTabela = new JButton("");
	    btnMostrarTabela.setContentAreaFilled(false);
	    btnMostrarTabela.setBorderPainted(false);
	    btnMostrarTabela.setIcon(new ImageIcon(
	            TelaCadastro.class.getResource("/imagens/mostrar-tabelas2.png")));

	    contentPane.add(btnMostrarTabela, "cell 4 4");
	}
	    
	    public JTextField getTxtEditora() {
	        return txtEditora;
	    }

	    public JTextField getTxtCnpj() {
	        return txtCnpj;
	    }

	    public JTextField getTxtTelefone() {
	        return txtTelefone;
	    }

	    public JTextField getTxtEmail() {
	        return txtEmail;
	    }

	    public JComboBox<String> getComboBox() {
	        return comboBox;
	    }

	    public JButton getBtnEntrar() {
	        return btnEntrar;
	    }
	    public JButton getBtnMostrarTabela() {
	        return btnMostrarTabela;
	    }
	

	}