package Ajuda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Sobre extends ClaculadoraInvestimentosGrid3 {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public void MostrarSobre() {
		JOptionPane.showMessageDialog(null,
				"Calculadora de Investimentos\n\n" +
				"Versão 1.0\n\n" +
				"Calcula o total investido com juros compostos.\n" +
				"Desenvolvido por Gustavo",
				"Sobre",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
