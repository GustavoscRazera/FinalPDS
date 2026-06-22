package telaa;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtpeso;
	private JTextField txtvalor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("calculo");
		titulo.setBounds(171, 26, 78, 14);
		contentPane.add(titulo);
		
		JLabel lblIn = new JLabel("peso:");
		lblIn.setBounds(36, 93, 56, 14);
		contentPane.add(lblIn);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(95, 90, 86, 20);
		contentPane.add(txtpeso);
		txtpeso.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(36, 198, 78, 14);
		contentPane.add(lblResultado);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(87, 164, 102, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSobrenome = new JLabel("valor(kg):");
		lblSobrenome.setBounds(36, 118, 56, 14);
		contentPane.add(lblSobrenome);
		
		txtvalor = new JTextField();
		txtvalor.setColumns(10);
		txtvalor.setBounds(95, 118, 86, 20);
		contentPane.add(txtvalor);
		
		JLabel resultado = new JLabel("");
		resultado.setBounds(108, 198, 157, 14);
		contentPane.add(resultado);
		btnNewButton.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String peso = txtpeso.getText();
				
				String valor = txtvalor.getText();
				
				double peso1 = Double.parseDouble(peso);
				double valor1 = Double.parseDouble(valor);
				
				
				double result = peso1 * valor1;
				
				
				String re1 = String.valueOf(result);
				
				
				
				

				resultado.setText("R$ "+re1);
				}
			});

			
		
		
}	
}
