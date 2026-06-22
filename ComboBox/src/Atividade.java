import java.awt.EventQueue;
	import javax.swing.*;
	import javax.swing.border.EmptyBorder;
	import net.miginfocom.swing.MigLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class Atividade extends JFrame {
		

	    private JPanel contentPane;
	    private JTextField txtNome;
	    private JTextField txtTelefone;
	    private JLabel lblResultado;

	    private ButtonGroup grupoPlano = new ButtonGroup();
	    private ButtonGroup grupoDuracao = new ButtonGroup();
	    private ButtonGroup grupoFreq = new ButtonGroup();
	    private JComboBox comboBox;
	    private JComboBox comboBox_1;
	    private JComboBox comboBox_2;

	    public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            try {
	            	Atividade frame = new Atividade();
	                frame.setVisible(true);
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        });
	    }

	    public Atividade() {
	        setTitle("Plano de Academia");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setBounds(100, 100, 600, 280);

	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
	        setContentPane(contentPane);

	        contentPane.setLayout(new MigLayout("", "[right][grow][grow][grow]", "[][][][][][][]"));

	     
	        JLabel titulo = new JLabel("Cadastro de Cliente - Academia TREINO FIT");
	        titulo.setHorizontalAlignment(SwingConstants.CENTER);
	        contentPane.add(titulo, "cell 0 0 4 1,alignx center");

	     
	        contentPane.add(new JLabel("Nome"), "cell 0 1");
	        txtNome = new JTextField();
	        contentPane.add(txtNome, "cell 1 1 3 1,growx");

	      
	        contentPane.add(new JLabel("Telefone"), "cell 0 2");
	        txtTelefone = new JTextField();
	        contentPane.add(txtTelefone, "cell 1 2 3 1,growx");

	       
	        contentPane.add(new JLabel("Tipo de Plano:"), "cell 0 3,alignx trailing");
	        
	        comboBox = new JComboBox();
	        comboBox.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 String plano = (String) comboBox.getSelectedItem();

					    if (plano.equals("Basico")) {
					        System.out.println("Plano Básico selecionado");
					    } else if (plano.equals("Intermediario")) {
					        System.out.println("Plano Intermediário selecionado");
					    } else if (plano.equals("Avancado")) {
					        System.out.println("Plano Avançado selecionado");
					    }
					
				}
	        	
	        });
	        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Basico", "Intermediario", "Avançado"}));
	        
	        contentPane.add(comboBox, "cell 1 3,growx");

	     
	        contentPane.add(new JLabel("Duração:"), "cell 0 4,alignx trailing");
	        
	        comboBox_1 = new JComboBox();
	        comboBox_1.setModel(new DefaultComboBoxModel(Duracao.values()));
	        contentPane.add(comboBox_1, "cell 1 4,growx");

	      
	        contentPane.add(new JLabel("Frequência semanal:"), "cell 0 5,alignx trailing");
	        
	        comboBox_2 = new JComboBox();
	        comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2x na semana", "3x na semana", "5x na semana"}));
	       
	        contentPane.add(comboBox_2, "cell 1 5,growx");

	       
	        JButton btnCalcular = new JButton("Calcular");
	        contentPane.add(btnCalcular, "cell 1 6, align right");

	        contentPane.add(new JLabel("Valor final:"), "cell 2 6,alignx center");
	        lblResultado = new JLabel("");
	        contentPane.add(lblResultado, "cell 3 6");

	       
	        btnCalcular.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	                double valor = 0;
	              
	               

	                lblResultado.setText("R$ " + String.format("%.2f / Mês", valor ));
	            }
	        });
	    }
	}