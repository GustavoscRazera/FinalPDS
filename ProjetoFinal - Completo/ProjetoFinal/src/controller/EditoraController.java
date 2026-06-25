package controller;

import javax.swing.JOptionPane;

import model.Editora;
import model.EditoraTableModel;
import view.TelaCadastro;
import view.TelaEdicao; // Certifique-se de importar a nova tela
import view.TelaTabela;

public class EditoraController {

    private EditoraTableModel modelo;
    private TelaCadastro view;
    private TelaTabela viewTabela;

    public EditoraController(EditoraTableModel modelo, TelaCadastro view) {

        this.modelo = modelo;
        this.view = view;

        // Botão cadastrar
        this.view.getBtnEntrar().addActionListener(e -> eventoBotaoAdicionar());

        // Botão mostrar tabela
        this.view.getBtnMostrarTabela().addActionListener(e -> abrirTabela());
    }

    private void abrirTabela() {

        // Cria a tela apenas uma vez
        if (viewTabela == null) {

            viewTabela = new TelaTabela();

            // Define o modelo da tabela
            viewTabela.getTable().setModel(modelo);

            // Evento remover
            viewTabela.getBtnRemover().addActionListener(e -> eventoBotaoRemover());

            // Evento editar
            viewTabela.getBtnEditar().addActionListener(e -> eventoBotaoEditar());
        }

        viewTabela.setLocationRelativeTo(view);
        viewTabela.setVisible(true);
    }

    private void eventoBotaoAdicionar() {

        String nome = view.getTxtEditora().getText();
        String cnpj = view.getTxtCnpj().getText();
        String telefone = view.getTxtTelefone().getText();
        String email = view.getTxtEmail().getText();
        String tipo = view.getComboBox().getSelectedItem().toString();

        if (nome.isEmpty() || cnpj.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Preencha Nome e CNPJ!");
            return;
        }

        try {
            Editora editora = new Editora(
                    nome,
                    Integer.parseInt(cnpj),
                    telefone,
                    email,
                    tipo
            );

            modelo.adicionarEditora(editora);

            JOptionPane.showMessageDialog(view, "Editora cadastrada com sucesso!");

            // Limpa os campos
            view.getTxtEditora().setText("");
            view.getTxtCnpj().setText("");
            view.getTxtTelefone().setText("");
            view.getTxtEmail().setText("");
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "O CNPJ deve ser um número válido!");
        }
    }

    private void eventoBotaoRemover() {

        int linhaSelecionada = viewTabela.getTable().getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(viewTabela, "Selecione uma linha!");
            return;
        }

        modelo.remover(linhaSelecionada);
    }

 // --- MÉTODO EDITAR CORRIGIDO ---
    private void eventoBotaoEditar() {

        int linhaSelecionada = viewTabela.getTable().getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(viewTabela, "Selecione uma linha!");
            return;
        }

        // Obtém a editora selecionada
        Editora editoraAtual = modelo.getEditora(linhaSelecionada);

        // Instancia a nova tela de edição
        TelaEdicao telaEdicao = new TelaEdicao();

        // Preenche os campos da TelaEdicao com os dados da tabela
        telaEdicao.getTxtEditora().setText(editoraAtual.getNome());
        
        // CORREÇÃO AQUI: Converter o CNPJ (int) para String para poder usar no setText
        telaEdicao.getTxtCnpj().setText(String.valueOf(editoraAtual.getCnpj()));
        
        telaEdicao.getTxtTelefone().setText(editoraAtual.getTelefone());
        telaEdicao.getTxtEmail().setText(editoraAtual.getEmail());
        telaEdicao.getComboBox().setSelectedItem(editoraAtual.getTipo());

        // Adiciona a ação do botão Salvar da TelaEdicao
        telaEdicao.getBtnSalvar().addActionListener(e -> {
            try {
                String nome = telaEdicao.getTxtEditora().getText();
                String cnpj = telaEdicao.getTxtCnpj().getText();
                String telefone = telaEdicao.getTxtTelefone().getText();
                String email = telaEdicao.getTxtEmail().getText();
                String tipo = telaEdicao.getComboBox().getSelectedItem().toString();

                if (nome.isEmpty() || cnpj.isEmpty()) {
                    JOptionPane.showMessageDialog(telaEdicao, "Preencha Nome e CNPJ!");
                    return;
                }

                // Cria o objeto atualizado
                Editora editoraAtualizada = new Editora(
                        nome,
                        Integer.parseInt(cnpj),
                        telefone,
                        email,
                        tipo
                );

                // Atualiza o modelo
                modelo.atualizarEditora(linhaSelecionada, editoraAtualizada);

                JOptionPane.showMessageDialog(telaEdicao, "Editora atualizada com sucesso!");
                
                // Fecha a tela de edição
                telaEdicao.dispose();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(telaEdicao, "CNPJ deve ser um número válido!");
            }
        });

        // Mostra a janela de edição
        telaEdicao.setLocationRelativeTo(viewTabela);
        telaEdicao.setVisible(true);
    }
}
