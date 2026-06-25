package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

public class TelaTabela extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JButton btnRemover;
    private JButton btnEditar;
    public TelaTabela() {

        setTitle("Tabela de Editoras");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 800, 500);

        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 128, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new MigLayout("", "[grow]", "[][grow]"));

        btnRemover = new JButton("Remover");
        contentPane.add(btnRemover, "cell 0 0");

        table = new JTable();

        JScrollPane scroll = new JScrollPane(table);
        scroll.setBackground(new Color(175, 244, 198));

        contentPane.add(scroll, "cell 0 1,grow");
        
        btnEditar = new JButton("Editar");
        contentPane.add(btnEditar, "flowx,cell 0 0");

    
    }

    public JTable getTable() {
        return table;
    }

    public JButton getBtnRemover() {
        return btnRemover;
    }
    public JButton getBtnEditar() {
        return btnEditar;
    }
}