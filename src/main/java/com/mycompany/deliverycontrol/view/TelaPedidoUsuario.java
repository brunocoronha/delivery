/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.deliverycontrol.view;

import com.mycompany.deliverycontrol.CRUD.IRegistraClienteCRUD;
import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.CRUD.IRegistraPedidoCRUD;
import com.mycompany.deliverycontrol.controller.ExportarPDF;
import com.mycompany.deliverycontrol.controller.RegistraClienteControle;
import com.mycompany.deliverycontrol.controller.RegistraEntregadoresControle;
import com.mycompany.deliverycontrol.controller.RegistraPedidoControle;
import com.mycompany.deliverycontrol.model.Pedido;
import com.mycompany.deliverycontrol.model.StatusPedidoENUM;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author brunocoronha.adm
 */
public final class TelaPedidoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaPedido
     */
    IRegistraPedidoCRUD pedidos;
    IRegistraClienteCRUD clientes;
    IRegistraEntregadoresCRUD entregadores;
    DefaultTableModel model;
    Integer idPedido = null;

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public TelaPedidoUsuario() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        preencherComboBoxStatus();
        pedidos = new RegistraPedidoControle();
        clientes = new RegistraClienteControle();
        entregadores = new RegistraEntregadoresControle();
        model = (DefaultTableModel) jTable_pedidos.getModel();
        preencherTabela();
    }

    String urlDaImagem = "https://www.segredes.com.br/deliverycontrol/img/dc-pequeno.png";
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton_Voltar = new javax.swing.JButton();
        jLabel_Icon = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_pedidos = new javax.swing.JTable();
        jComboBox_status = new javax.swing.JComboBox<>();
        jButton_alterarStatus = new javax.swing.JButton();
        jButton_geraPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(65, 31, 21));
        jPanel3.setForeground(new java.awt.Color(65, 31, 21));

        jLabel3.setBackground(new java.awt.Color(255, 178, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 178, 0));
        jLabel3.setText("Lista de Pedidos");

        jButton_Voltar.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jButton_Voltar.setText("Voltar");
        jButton_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VoltarActionPerformed(evt);
            }
        });

        jLabel_Icon.setIcon(icon); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jButton_Voltar)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Icon)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Icon)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Voltar)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10)))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(65, 31, 21));
        jPanel4.setForeground(new java.awt.Color(65, 31, 21));

        jTable_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Entregador", "Status"
            }
        ));
        jTable_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_pedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_pedidos);

        jButton_alterarStatus.setText("Alterar");
        jButton_alterarStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterarStatusActionPerformed(evt);
            }
        });

        jButton_geraPDF.setText("PDF");
        jButton_geraPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_geraPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jComboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_alterarStatus)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_geraPDF)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_geraPDF)
                    .addComponent(jButton_alterarStatus)
                    .addComponent(jComboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_alterarStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterarStatusActionPerformed
        
        if (getIdPedido() != null) {
            try {
                Pedido p = pedidos.consultar(getIdPedido());
                System.out.println(jComboBox_status.getSelectedItem().toString());        
                StatusPedidoENUM status = StatusPedidoENUM.valueOf(jComboBox_status.getSelectedItem().toString());
                p.setStatusPedido(status);
                System.out.println("PEDIDOOOO -> " + p.toString());
                pedidos.alterar(p);
                System.out.println("ID eh -> " + getIdPedido());
                preencherTabela();
                setIdPedido(null);
                jComboBox_status.setSelectedIndex(0);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nenhum item selecionado");
        }
    }//GEN-LAST:event_jButton_alterarStatusActionPerformed

    private void jButton_VoltarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_VoltarActionPerformed
//        TelaPrincipalUser telaPrincipalUser = new TelaPrincipalUser();
//        telaPrincipalUser.dispose();
//        telaPrincipalUser.setLocationRelativeTo(this);
//        telaPrincipalUser.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        telaPrincipalUser.setVisible(true);
        dispose();
    }// GEN-LAST:event_jButton_VoltarActionPerformed
    
    private void jButton_geraPDFActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_geraPDFActionPerformed
        try {
            ExportarPDF.exportToPDF(jTable_pedidos);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 

    }// GEN-LAST:event_jButton_geraPDFActionPerformed

    private void jTable_pedidosMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jTable_pedidosMouseClicked
        try {
            Object obj = jTable_pedidos.getValueAt(jTable_pedidos.getSelectedRow(), 0);
            setIdPedido((Integer) obj);
            Pedido pedidoAlterar = pedidos.consultar((Integer) obj);
            for (int j = 0; j < jComboBox_status.getItemCount(); j++) {
                if (jComboBox_status.getItemAt(j).toString().equals(pedidoAlterar.getStatusPedido().toString())) {
                    jComboBox_status.setSelectedIndex(j);
                    break;
                }
            }
            System.out.println("ID -> " + getIdPedido());
        } catch (Exception ex) {
            Logger.getLogger(TelaPedidoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_jTable_pedidosMouseClicked

    private void preencherComboBoxStatus() {
        jComboBox_status.removeAllItems();
        jComboBox_status.addItem("Selecione um Status");
        for (StatusPedidoENUM status : StatusPedidoENUM.values()) {
            jComboBox_status.addItem(status.toString());
        }
    }

    private void preencherTabela() {
        try {
            model.setRowCount(0);
            ArrayList<Pedido> listaPedidos = pedidos.listagemDePedidos();
            for (Pedido p : listaPedidos) {
                adicionarLinha(model, p.getId(), clientes.consultar(p.getId_cliente()).getNome(),
                        entregadores.consultar(p.getId_entregador()).getNome(), p.getStatusPedido().toString());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage() + "Preencher Tabela");
        }
    }

    private void adicionarLinha(DefaultTableModel model, int id, String cliente, String entregador, String status) {
        model.addRow(new Object[] { id, cliente, entregador, status });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPedidoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPedidoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Voltar;
    private javax.swing.JButton jButton_alterarStatus;
    private javax.swing.JButton jButton_geraPDF;
    private javax.swing.JComboBox<String> jComboBox_status;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Icon;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_pedidos;
    // End of variables declaration//GEN-END:variables
}
