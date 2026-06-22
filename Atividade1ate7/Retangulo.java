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
	private JTextField txtbase;
	private JTextField txtaltura;

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
		
		JLabel lblIn = new JLabel("base:");
		lblIn.setBounds(36, 93, 56, 14);
		contentPane.add(lblIn);
		
		txtbase = new JTextField();
		txtbase.setBounds(95, 90, 86, 20);
		contentPane.add(txtbase);
		txtbase.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(36, 198, 78, 14);
		contentPane.add(lblResultado);
		
		JLabel resultadoarea = new JLabel("");
		resultadoarea.setBounds(243, 218, 147, 14);
		contentPane.add(resultadoarea);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(87, 164, 102, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSobrenome = new JLabel("altura:");
		lblSobrenome.setBounds(36, 118, 56, 14);
		contentPane.add(lblSobrenome);
		
		txtaltura = new JTextField();
		txtaltura.setColumns(10);
		txtaltura.setBounds(95, 118, 86, 20);
		contentPane.add(txtaltura);
		
		JLabel resultadoperimetro = new JLabel("");
		resultadoperimetro.setBounds(243, 198, 157, 14);
		contentPane.add(resultadoperimetro);
		
		JLabel lblNewLabel = new JLabel("Area:");
		lblNewLabel.setBounds(171, 218, 52, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Perimetro:");
		lblNewLabel_1.setBounds(171, 198, 78, 14);
		contentPane.add(lblNewLabel_1);
		btnNewButton.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String base = txtbase.getText();
				
				String altura = txtaltura.getText();
				
				double base1 = Double.parseDouble(base);
				double altura1 = Double.parseDouble(altura);
				
				
				double result = 2 * (base1 + altura1);
				
				double result1 = base1 * altura1;
				
				String re1 = String.valueOf(result);
				
				String re2 = String.valueOf(result1);
				
				

				resultadoarea.setText(re2);
				resultadoperimetro.setText(re1);
				}
			});

			
		
		
}	
}
