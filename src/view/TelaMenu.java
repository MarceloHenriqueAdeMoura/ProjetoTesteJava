/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Marcelo
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jButtonMenuBone = new javax.swing.JButton();
        jButtonMenuCamisa = new javax.swing.JButton();
        jButtonMenuBlusa = new javax.swing.JButton();
        jButtonMenuCalca = new javax.swing.JButton();
        jButtonMenuBermuda = new javax.swing.JButton();
        jButtonMenuShorts = new javax.swing.JButton();
        jButtonMenuCalcado = new javax.swing.JButton();
        jButtonMenuCinto = new javax.swing.JButton();
        jButtonMenuOculos = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 120, 670, 10);

        jButtonMenuBone.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuBone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bone.png"))); // NOI18N
        jButtonMenuBone.setText("Bonés");
        jButtonMenuBone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBoneActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuBone);
        jButtonMenuBone.setBounds(10, 130, 210, 70);

        jButtonMenuCamisa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuCamisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/camisa.png"))); // NOI18N
        jButtonMenuCamisa.setText("Camisas");
        jButtonMenuCamisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCamisaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuCamisa);
        jButtonMenuCamisa.setBounds(230, 130, 210, 70);

        jButtonMenuBlusa.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuBlusa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/blusa.png"))); // NOI18N
        jButtonMenuBlusa.setText("Blusas");
        jButtonMenuBlusa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBlusaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuBlusa);
        jButtonMenuBlusa.setBounds(450, 130, 210, 70);

        jButtonMenuCalca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuCalca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/calça.png"))); // NOI18N
        jButtonMenuCalca.setText("Calças");
        jButtonMenuCalca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCalcaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuCalca);
        jButtonMenuCalca.setBounds(10, 260, 210, 70);

        jButtonMenuBermuda.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuBermuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bermuda.png"))); // NOI18N
        jButtonMenuBermuda.setText("Bermudas");
        jButtonMenuBermuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuBermudaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuBermuda);
        jButtonMenuBermuda.setBounds(230, 260, 210, 70);

        jButtonMenuShorts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuShorts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/shorts.png"))); // NOI18N
        jButtonMenuShorts.setText("Shorts");
        jButtonMenuShorts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuShortsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuShorts);
        jButtonMenuShorts.setBounds(450, 260, 210, 70);

        jButtonMenuCalcado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuCalcado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/tenis.png"))); // NOI18N
        jButtonMenuCalcado.setText("Calçados");
        jButtonMenuCalcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCalcadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuCalcado);
        jButtonMenuCalcado.setBounds(10, 390, 210, 70);

        jButtonMenuCinto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuCinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cinto.png"))); // NOI18N
        jButtonMenuCinto.setText("Cintos");
        jButtonMenuCinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuCintoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuCinto);
        jButtonMenuCinto.setBounds(230, 390, 210, 70);

        jButtonMenuOculos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonMenuOculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/oculos.png"))); // NOI18N
        jButtonMenuOculos.setText("Óculos");
        jButtonMenuOculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuOculosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenuOculos);
        jButtonMenuOculos.setBounds(450, 390, 210, 70);

        jButtonSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(10, 480, 650, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/outfit.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 10, 190, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Lista de Produtos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 350, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        jLabel1.setText("Sair");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 570);

        setSize(new java.awt.Dimension(676, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuBoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBoneActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Bonés");
        dispose();
    }//GEN-LAST:event_jButtonMenuBoneActionPerformed

    private void jButtonMenuCamisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuCamisaActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Camisas");
        dispose();
    }//GEN-LAST:event_jButtonMenuCamisaActionPerformed

    private void jButtonMenuBlusaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBlusaActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Blusas");
        dispose();
    }//GEN-LAST:event_jButtonMenuBlusaActionPerformed

    private void jButtonMenuCalcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuCalcaActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Calças");
        dispose();
    }//GEN-LAST:event_jButtonMenuCalcaActionPerformed

    private void jButtonMenuBermudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuBermudaActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Bermudas");
        dispose();
    }//GEN-LAST:event_jButtonMenuBermudaActionPerformed

    private void jButtonMenuShortsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuShortsActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Shorts");
        dispose();
    }//GEN-LAST:event_jButtonMenuShortsActionPerformed

    private void jButtonMenuCalcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuCalcadoActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Calçados");
        dispose();
    }//GEN-LAST:event_jButtonMenuCalcadoActionPerformed

    private void jButtonMenuCintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuCintoActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Cintos");
        dispose();
    }//GEN-LAST:event_jButtonMenuCintoActionPerformed

    private void jButtonMenuOculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuOculosActionPerformed
        // TODO add your handling code here:
        Produto tela = new Produto();
        tela.setVisible(true);
        tela.getjLabel2().setText("Óculos");
        dispose();
    }//GEN-LAST:event_jButtonMenuOculosActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonMenuBermuda;
    private javax.swing.JButton jButtonMenuBlusa;
    private javax.swing.JButton jButtonMenuBone;
    private javax.swing.JButton jButtonMenuCalca;
    private javax.swing.JButton jButtonMenuCalcado;
    private javax.swing.JButton jButtonMenuCamisa;
    private javax.swing.JButton jButtonMenuCinto;
    private javax.swing.JButton jButtonMenuOculos;
    private javax.swing.JButton jButtonMenuShorts;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
