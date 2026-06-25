package main;

import controller.EditoraController;
import model.EditoraTableModel;
import view.TelaCadastro;
import view.TelaTabela;

public class Main {

	public static void main(String[] args) {

	    EditoraTableModel modelo =
	            new EditoraTableModel();

	    TelaCadastro cadastro =
	            new TelaCadastro();

	    new EditoraController(modelo, cadastro);

	    cadastro.setVisible(true);

}}