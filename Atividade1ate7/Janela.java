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
	private JTextField txtnome;
	private JTextField txtsobrenome;

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
		
		JLabel titulo = new JLabel("Conversão");
		titulo.setBounds(171, 26, 78, 14);
		contentPane.add(titulo);
		
		JLabel lblIn = new JLabel("nome:");
		lblIn.setBounds(36, 93, 56, 14);
		contentPane.add(lblIn);
		
		txtnome = new JTextField();
		txtnome.setBounds(95, 90, 86, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(110, 198, 78, 14);
		contentPane.add(lblResultado);
		
		JLabel resultadof = new JLabel("");
		resultadof.setBounds(186, 198, 219, 14);
		contentPane.add(resultadof);
		
		JButton btnNewButton = new JButton("enviar");
		btnNewButton.setBounds(87, 164, 102, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSobrenome = new JLabel("sobrenome:");
		lblSobrenome.setBounds(10, 121, 102, 14);
		contentPane.add(lblSobrenome);
		
		txtsobrenome = new JTextField();
		txtsobrenome.setColumns(10);
		txtsobrenome.setBounds(95, 118, 86, 20);
		contentPane.add(txtsobrenome);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtnome.getText();
				
				String sobrenome = txtsobrenome.getText();
				
				
				
				

				resultadof.setText(nome + " "+ sobrenome);
				}
			});

			
		
		
}	
}
