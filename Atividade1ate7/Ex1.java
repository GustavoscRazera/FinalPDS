package ex1;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ex1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtfarenheit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ex1 frame = new Ex1();
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
	public Ex1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titulo = new JLabel("Conversão");
		titulo.setBounds(171, 26, 78, 14);
		contentPane.add(titulo);
		
		JLabel lblIn = new JLabel("Farenheit:");
		lblIn.setBounds(32, 93, 56, 14);
		contentPane.add(lblIn);
		
		txtfarenheit = new JTextField();
		txtfarenheit.setBounds(110, 90, 86, 20);
		contentPane.add(txtfarenheit);
		txtfarenheit.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(110, 198, 78, 14);
		contentPane.add(lblResultado);
		
		JLabel resultado = new JLabel(txtfarenheit.getText());
		resultado.setBounds(186, 198, 46, 14);
		contentPane.add(resultado);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.setBounds(104, 131, 102, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = txtfarenheit.getText();
				
				double tempD = Double.parseDouble(temp);
				
				double C = (tempD - 32 ) * 5.0/9.0;
				
				String Resultado = String.valueOf(C);
				Resultado = String.format("%.2f", C);
				resultado.setText(Resultado + " ºC");
				}
			});

			
		
		
}}
