package model;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EditoraTableModel extends AbstractTableModel{
	ArrayList<Editora> lista;
	String colunas[] = new String[] { "Nome", "CNPJ","Telefone","Email","Tipo"};

	
	public EditoraTableModel() {
		this.lista = new ArrayList();
		
	}
	public EditoraTableModel(ArrayList<Editora> lista) {
		this.lista = lista;
	}
	public String getColumnName(int indice) {
		return colunas[indice]; 
		
	}
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.lista.size();
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return this.colunas.length;
	}

	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		Editora editora = lista.get(rowIndex);
		if(columnIndex == 0) {
			return editora.getNome();
		} 
		if(columnIndex ==1) {
			return editora.getCnpj();
		}
		if(columnIndex ==2) {
			return editora.getTelefone();
		}
		if(columnIndex ==3) {
			return editora.getEmail();
		}
		if(columnIndex ==4) {
			return editora.getTipo();
		}
		
		return null;
	}
	public void remover(int linhaSelecionada) {
		lista.remove(linhaSelecionada);
		fireTableDataChanged();
		
	}

	public void adicionarEditora(Editora e) {
		lista.add(e);
		fireTableDataChanged();
		
	}
	
	public Editora getEditora(int linha) {
	    return lista.get(linha);
	}

	public void atualizarEditora(int linha, Editora editora) {
	    lista.set(linha, editora);
	    fireTableRowsUpdated(linha, linha);
	}
	

}
