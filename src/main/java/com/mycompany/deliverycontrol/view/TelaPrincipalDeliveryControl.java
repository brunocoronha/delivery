/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.deliverycontrol.view;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 *
 * @author gustavocamargo.adm
 */
public class TelaPrincipalDeliveryControl extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalDeliveryControl
     */
    public TelaPrincipalDeliveryControl() {
        initComponents();
        this.setTitle("Delivery Control");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    String urlDaImagem = "https://www.segredes.com.br/deliverycontrol/img/dcinicio.png";

    // Baixar a imagem da internet e criar um ImageIcon
    ImageIcon icon = criarImageIcon(urlDaImagem);


    public static ImageIcon criarImageIcon(String url) {
        try {
            // Carregar a imagem a partir do URL
            BufferedImage imagem = ImageIO.read(new URL(url));

            // Criar um ImageIcon a partir da imagem
            return new ImageIcon(imagem);
        } catch (IOException e) {
            // Tratar exceções de IO, por exemplo, URL inválido ou problema de conexão
            e.printStackTrace();
            return null; // Retornar null em caso de erro
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_RegistrarPedido = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_CadastrarEntregador = new javax.swing.JMenuItem();
        jMenuItem_CadastrarCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_VisualizaAlterarPedidos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_Cadastrar = new javax.swing.JMenuItem();
        jMenuItem_Deletar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(icon); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu1.setText("Registrar");

        jMenuItem_RegistrarPedido.setText("Pedido");
        jMenuItem_RegistrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_RegistrarPedidoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_RegistrarPedido);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastrar");

        jMenuItem_CadastrarEntregador.setText("Entregador");
        jMenuItem_CadastrarEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastrarEntregadorActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_CadastrarEntregador);

        jMenuItem_CadastrarCliente.setText("Cliente");
        jMenuItem_CadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_CadastrarCliente);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Visualizar / Alterar");

        jMenuItem_VisualizaAlterarPedidos.setText("Pedidos");
        jMenuItem_VisualizaAlterarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_VisualizaAlterarPedidosActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_VisualizaAlterarPedidos);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Usuário do Sistema");

        jMenuItem_Cadastrar.setText("Cadastrar");
        jMenuItem_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_CadastrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Cadastrar);

        jMenuItem_Deletar.setText("Deletar");
        jMenuItem_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_DeletarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_Deletar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_RegistrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_RegistrarPedidoActionPerformed
        TelaRegistrarPedido registrarPedido = new TelaRegistrarPedido();
        registrarPedido.dispose();
        registrarPedido.setLocationRelativeTo(this);
        registrarPedido.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        registrarPedido.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jMenuItem_RegistrarPedidoActionPerformed

    private void jMenuItem_CadastrarEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastrarEntregadorActionPerformed
        TelaCadastroEntregador cadastroEntregador = new TelaCadastroEntregador();
        cadastroEntregador.dispose();
        cadastroEntregador.setLocationRelativeTo(this);
        cadastroEntregador.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        cadastroEntregador.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jMenuItem_CadastrarEntregadorActionPerformed

    private void jMenuItem_CadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastrarClienteActionPerformed
        TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
        telaCadastroCliente.dispose();
        telaCadastroCliente.setLocationRelativeTo(this);
        telaCadastroCliente.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaCadastroCliente.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jMenuItem_CadastrarClienteActionPerformed

    private void jMenuItem_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_CadastrarActionPerformed
        TelaCadastroUsuarioSistema telaCadastroUsuarioSistema = new TelaCadastroUsuarioSistema();
        telaCadastroUsuarioSistema.dispose();
        telaCadastroUsuarioSistema.setLocationRelativeTo(this);
        telaCadastroUsuarioSistema.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaCadastroUsuarioSistema.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jMenuItem_CadastrarActionPerformed

    private void jMenuItem_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_DeletarActionPerformed
        TelaDeletarUsuarioSistema telaDeletarUsuarioSistema = new TelaDeletarUsuarioSistema();
        telaDeletarUsuarioSistema.dispose();
        telaDeletarUsuarioSistema.setLocationRelativeTo(this);
        telaDeletarUsuarioSistema.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaDeletarUsuarioSistema.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jMenuItem_DeletarActionPerformed

    private void jMenuItem_VisualizaAlterarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_VisualizaAlterarPedidosActionPerformed
        TelaPedido telaPedido = new TelaPedido();
        telaPedido.dispose();
        telaPedido.setLocationRelativeTo(this);
        telaPedido.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaPedido.setVisible(true);
    }//GEN-LAST:event_jMenuItem_VisualizaAlterarPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalDeliveryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalDeliveryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalDeliveryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalDeliveryControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalDeliveryControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Cadastrar;
    private javax.swing.JMenuItem jMenuItem_CadastrarCliente;
    private javax.swing.JMenuItem jMenuItem_CadastrarEntregador;
    private javax.swing.JMenuItem jMenuItem_Deletar;
    private javax.swing.JMenuItem jMenuItem_RegistrarPedido;
    private javax.swing.JMenuItem jMenuItem_VisualizaAlterarPedidos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
