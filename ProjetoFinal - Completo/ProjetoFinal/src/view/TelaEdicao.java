package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JButton; // Importação do botão

public class TelaEdicao extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtNovoNome;
    private JTextField txtNovoCnpj;
    private JTextField txtNovoTelefone;
    private JTextField txtNovoEmail;
    private JComboBox<String> comboBoxNovo; // Adicionado como atributo da classe
    private JButton btnSalvar; // Adicionado o botão de salvar

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TelaEdicao frame = new TelaEdicao();
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
    public TelaEdicao() {
        // ALTERADO: DISPOSE_ON_CLOSE para não fechar o app inteiro ao fechar a edição
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setSize(500, 450);
        setLocationRelativeTo(null); // centraliza a janela
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(175, 244, 198));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[grow]", "[][][][][][][][][][][][]")); // Adicionei uma linha no layout
        
        JLabel lblNewLabel_5 = new JLabel("Editar Registro:");
        lblNewLabel_5.setForeground(new Color(0, 128, 0));
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
        contentPane.add(lblNewLabel_5, "cell 0 0,alignx center");
        
        JLabel lblNewLabel = new JLabel("Nome:");
        lblNewLabel.setForeground(new Color(0, 128, 0));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblNewLabel, "cell 0 1");
        
        txtNovoNome = new JTextField();
        contentPane.add(txtNovoNome, "cell 0 2,growx");
        txtNovoNome.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("CNPJ:");
        lblNewLabel_1.setForeground(new Color(0, 128, 0));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblNewLabel_1, "cell 0 3");
        
        txtNovoCnpj = new JTextField();
        contentPane.add(txtNovoCnpj, "cell 0 4,growx");
        txtNovoCnpj.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Telefone:");
        lblNewLabel_2.setForeground(new Color(0, 128, 0));
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblNewLabel_2, "cell 0 5");
        
        txtNovoTelefone = new JTextField();
        contentPane.add(txtNovoTelefone, "cell 0 6,growx");
        txtNovoTelefone.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Email:");
        lblNewLabel_3.setForeground(new Color(0, 128, 0));
        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblNewLabel_3, "cell 0 7");
        
        txtNovoEmail = new JTextField();
        contentPane.add(txtNovoEmail, "cell 0 8,growx");
        txtNovoEmail.setColumns(10);
        
        JLabel lblNewLabel_4 = new JLabel("Tipo:");
        lblNewLabel_4.setForeground(new Color(0, 128, 0));
        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        contentPane.add(lblNewLabel_4, "cell 0 9");
        
        comboBoxNovo = new JComboBox<String>();
        comboBoxNovo.setModel(new DefaultComboBoxModel<String>(new String[] {"Tradicional", "Independente"}));
        contentPane.add(comboBoxNovo, "cell 0 10,growx");

        // ADICIONADO: Botão de Salvar
        btnSalvar = new JButton("Salvar Alterações");
        btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
        contentPane.add(btnSalvar, "cell 0 11,alignx center");
        
    }

    // --- GETTERS PADRONIZADOS PARA O CONTROLLER ---

    public JTextField getTxtEditora() {
        return txtNovoNome;
    }

    public JTextField getTxtCnpj() {
        return txtNovoCnpj;
    }

    public JTextField getTxtTelefone() {
        return txtNovoTelefone;
    }

	public JTextField getTxtEmail() {
		
		return txtNovoEmail;
	}

	public JComboBox<String> getComboBox() {
	        return comboBoxNovo;
	    }

	public JButton getBtnSalvar() {
		
		// TODO Auto-generated method stub
		return btnSalvar;
	}

}