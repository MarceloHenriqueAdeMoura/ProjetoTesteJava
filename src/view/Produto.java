/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.*;
import controller.ListaP;
import model.Produtos;
import data.ConexaoBD;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import model.Tabela;

/**
 *
 * @author 31615386
 */
public class Produto extends javax.swing.JFrame {

    ListaP l = new ListaP();
    Produtos prod;
    ConexaoBD conex;

    /**
     * Creates new form Interface
     */
    public Produto() {
        initComponents();
        try {
            conex = new ConexaoBD();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        prod = new Produtos();
        preencherTabela("select * from Produtos order by cod_produto");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelFundoOutfit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();
        jButtonPrimeiro = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonUltimo = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundoCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Produtos");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 360, 90);

        jLabelFundoOutfit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelFundoOutfit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFundoOutfit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/outfit.png"))); // NOI18N
        getContentPane().add(jLabelFundoOutfit);
        jLabelFundoOutfit.setBounds(480, 10, 180, 85);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 90, 670, 10);

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNome.setText("Nome: ");
        getContentPane().add(jLabelNome);
        jLabelNome.setBounds(0, 160, 60, 25);

        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldNome.setEnabled(false);
        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(50, 160, 130, 25);

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPreco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPreco.setText("Preço: ");
        getContentPane().add(jLabelPreco);
        jLabelPreco.setBounds(0, 190, 60, 25);

        jTextFieldPreco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldPreco.setEnabled(false);
        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldPreco);
        jTextFieldPreco.setBounds(50, 190, 130, 25);

        jButtonNovo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo);
        jButtonNovo.setBounds(20, 500, 82, 25);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir);
        jButtonExcluir.setBounds(200, 500, 82, 25);

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar);
        jButtonSalvar.setBounds(110, 500, 82, 25);

        jButtonEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar);
        jButtonEditar.setBounds(290, 500, 82, 25);

        jButtonPesquisar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.setEnabled(false);
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPesquisar);
        jButtonPesquisar.setBounds(380, 500, 82, 25);

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCodigo.setText("    ID:");
        getContentPane().add(jLabelCodigo);
        jLabelCodigo.setBounds(0, 130, 60, 25);

        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(50, 130, 130, 25);

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableProduto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(190, 130, 452, 320);

        jButtonPrimeiro.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        jButtonPrimeiro.setText("<<");
        jButtonPrimeiro.setToolTipText("Primeiro");
        jButtonPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrimeiroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPrimeiro);
        jButtonPrimeiro.setBounds(190, 460, 70, 25);

        jButtonAnterior.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        jButtonAnterior.setText("<");
        jButtonAnterior.setToolTipText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAnterior);
        jButtonAnterior.setBounds(320, 460, 70, 25);

        jButtonProximo.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        jButtonProximo.setText(">");
        jButtonProximo.setToolTipText("Próximo");
        jButtonProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProximoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonProximo);
        jButtonProximo.setBounds(440, 460, 70, 25);

        jButtonUltimo.setFont(new java.awt.Font("Harlow Solid Italic", 0, 14)); // NOI18N
        jButtonUltimo.setText(">>");
        jButtonUltimo.setToolTipText("Último");
        jButtonUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonUltimo);
        jButtonUltimo.setBounds(570, 460, 70, 25);

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setEnabled(false);
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVoltar);
        jButtonVoltar.setBounds(470, 500, 82, 25);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(560, 500, 82, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 100, 130, 30);

        jLabelFundoCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        getContentPane().add(jLabelFundoCadastro);
        jLabelFundoCadastro.setBounds(0, 0, 670, 570);

        setSize(new java.awt.Dimension(671, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        // TODO add your handling code here: 
        /*String nome = jTextFieldNome.getText();
        double preco = Double.parseDouble(jTextFieldPreco.getText());
        int codigo = l.inserirNoFinal(nome, preco);
        jTextFieldCodigo.setText(Integer.toString(codigo));*/
        limparTela();
        jTextFieldNome.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonVoltar.setEnabled(true);
        jButtonNovo.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecoActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        /*if (jTextFieldCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um código válido");
            return;
        }
        if (l.excluir(Integer.parseInt(jTextFieldCodigo.getText())) == null) {
            JOptionPane.showMessageDialog(this, "Produto não encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso ");
            if (l.Vazia() == true) {
                JOptionPane.showMessageDialog(this, "Lista vazia");
                limparTela();
            } else {
                exibirProduto(l.atual());
            }
        }*/
        if (jTextFieldCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe um id válido");
            return;
        }
        try {
            int resp = 0;
            resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir?");
            if (resp == JOptionPane.YES_OPTION) {
                PreparedStatement pst = conex.getConexaoBD().prepareStatement("delete from Produtos where cod_produto=?");
                pst.setInt(1, Integer.parseInt(jTextFieldCodigo.getText()));
                pst.execute();
                JOptionPane.showMessageDialog(this, "Produto excluído com sucesso");
                jButtonNovoActionPerformed(evt);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Produto não encontrado");
            limparTela();
        }
        preencherTabela("select * from Produtos order by cod_produto");
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        /*if (l.localizar(Integer.parseInt(jTextFieldCodigo.getText())) == null) {
            JOptionPane.showMessageDialog(this, "Produto não encontrado");
        } else {
            JOptionPane.showMessageDialog(this, "Produto encontrado");
            exibirProduto(l.localizar(Integer.parseInt(jTextFieldCodigo.getText())));
        }*/
        prod.setPesquisa(jTextFieldCodigo.getText());
        conex.getConexaoBD();
        conex.executaSQL("select * from Produtos where cod_produto like '%" + prod.getPesquisa() + "%'");
        try {
            conex.getRs().first();
            prod.setCodigo(conex.getRs().getInt("cod_produto"));
            prod.setNome(conex.getRs().getString("nome_produto"));
            prod.setPreco(conex.getRs().getDouble("preco_produto"));
            exibirProduto();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro 'Pesquisa':\n" + ex.getMessage());
            limparTela();
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        //exibirProduto(l.anterior());        
        jTextFieldNome.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonVoltar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        try {
            conex.getRs().previous();
            jTextFieldNome.setText(conex.getRs().getString("nome_produto"));
            jTextFieldCodigo.setText(String.valueOf(conex.getRs().getString("cod_produto")));
            jTextFieldPreco.setText(String.valueOf(conex.getRs().getString("preco_produto")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro 'Anterior':\n" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProximoActionPerformed
        // TODO add your handling code here:
        //exibirProduto(l.proximo());
        jTextFieldNome.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonVoltar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        try {
            conex.getRs().next();
            jTextFieldNome.setText(conex.getRs().getString("nome_produto"));
            jTextFieldCodigo.setText(String.valueOf(conex.getRs().getString("cod_produto")));
            jTextFieldPreco.setText(String.valueOf(conex.getRs().getString("preco_produto")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro 'Próximo':\n" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonProximoActionPerformed

    private void jButtonPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrimeiroActionPerformed
        // TODO add your handling code here:
        //exibirProduto(l.primeiro());
        jTextFieldNome.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonVoltar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        try {
            conex.executaSQL("select * from Produtos");
            conex.getRs().first();
            jTextFieldNome.setText(conex.getRs().getString("nome_produto"));
            jTextFieldCodigo.setText(String.valueOf(conex.getRs().getString("cod_produto")));
            jTextFieldPreco.setText(String.valueOf(conex.getRs().getString("preco_produto")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro 'Primeiro':\n" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonPrimeiroActionPerformed

    private void jButtonUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimoActionPerformed
        // TODO add your handling code here:
        //exibirProduto(l.ultimo());
        jTextFieldNome.setEnabled(true);
        jTextFieldPreco.setEnabled(true);
        jTextFieldCodigo.setEnabled(true);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jButtonSalvar.setEnabled(false);
        jButtonVoltar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        try {
            conex.executaSQL("select * from Produtos");
            conex.getRs().last();
            jTextFieldNome.setText(conex.getRs().getString("nome_produto"));
            jTextFieldCodigo.setText(String.valueOf(conex.getRs().getString("cod_produto")));
            jTextFieldPreco.setText(String.valueOf(conex.getRs().getString("preco_produto")));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro 'Último':\n" + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonUltimoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        //l.gravar();
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    String sql = ("insert into Produtos(cod_produto,nome_produto,preco_produto) values(?,?,?)");
                    PreparedStatement pst = conex.getConexaoBD().prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(jTextFieldCodigo.getText()));
                    pst.setString(2, jTextFieldNome.getText());
                    pst.setDouble(3, Double.parseDouble(jTextFieldPreco.getText()));
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Salvo com sucesso");
                    jButtonNovoActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro:\n" + ex.getMessage());
        }
        preencherTabela("select * from Produtos order by cod_produto");
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        // l.ler();
        //exibirProduto(l.primeiro());
        try {
            String sql = ("update Produtos set nome_produto=?,preco_produto=? where cod_produto=?");
            PreparedStatement pst = conex.getConexaoBD().prepareStatement(sql);
            pst.setString(1, jTextFieldNome.getText());
            pst.setDouble(2, Double.parseDouble(jTextFieldPreco.getText()));
            pst.setInt(3, Integer.parseInt(jTextFieldCodigo.getText()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Alterado com sucesso");
            jButtonNovoActionPerformed(evt);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro:\n" + ex.getMessage());
            limparTela();
        }
        preencherTabela("select * from Produtos order by cod_produto");
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        TelaMenu tela = new TelaMenu();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed
    
    public void preencherTabela(String sql) {

        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{"ID", "Nome", "Preço"};

        conex.executaSQL(sql);
        try {
            conex.getRs().first();
            do {
                dados.add(new Object[]{conex.getRs().getInt("cod_produto"), conex.getRs().getString("nome_produto"), conex.getRs().getDouble("preco_produto")});
            } while (conex.getRs().next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Erro 'Peencher Tabela':\n" + ex.getMessage());
        }
        Tabela tabel = new Tabela(dados, Colunas);
        jTableProduto.setModel(tabel);
        jTableProduto.getColumnModel().getColumn(0).setPreferredWidth(146);
        jTableProduto.getColumnModel().getColumn(0).setResizable(false);
        jTableProduto.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTableProduto.getColumnModel().getColumn(1).setResizable(false);
        jTableProduto.getColumnModel().getColumn(2).setPreferredWidth(150);
        jTableProduto.getColumnModel().getColumn(2).setResizable(false);
        jTableProduto.getTableHeader().setReorderingAllowed(false);
        jTableProduto.setAutoResizeMode(jTableProduto.AUTO_RESIZE_OFF);
        jTableProduto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    public void exibirProduto() {

        if (prod != null) {
            jTextFieldCodigo.setText(Integer.toString(prod.getCodigo()));
            jTextFieldNome.setText(prod.getNome());
            jTextFieldPreco.setText(String.format("%.2f", prod.getPreco()));
        }
    }

    private boolean preencherObjeto() {

        prod.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
        prod.setNome(jTextFieldNome.getText());
        prod.setPreco(Double.parseDouble(jTextFieldPreco.getText()));
        return true;
    }

    private boolean validarCampos() {

        if (jTextFieldNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite um nome!!");
            jTextFieldNome.requestFocus();
            return false;
        }
        if (jTextFieldNome.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Erro 'Nome':\nDigite no máximo 20 caracteres!!");
            jTextFieldNome.requestFocus();
            return false;
        }
        if (jTextFieldPreco.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o preço!!");
            jTextFieldPreco.requestFocus();
            return false;
        }
        if (jTextFieldPreco.getText().length() > 20) {
            JOptionPane.showMessageDialog(this, "Erro 'Preço':\nDigite no máximo 20 caracteres!!");
            jTextFieldPreco.requestFocus();
            return false;
        }
        return true;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }    

    private void limparTela() {

        jTextFieldCodigo.setText("0");
        jTextFieldNome.setText("");
        jTextFieldPreco.setText("");
    }

    /**
     * @param sql
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPrimeiro;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonUltimo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFundoCadastro;
    private javax.swing.JLabel jLabelFundoOutfit;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}
