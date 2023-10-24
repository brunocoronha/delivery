/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.deliverycontrol.view;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

import com.mycompany.deliverycontrol.CRUD.IRegistraClienteCRUD;
import com.mycompany.deliverycontrol.controller.RegistraClienteControle;
import com.mycompany.deliverycontrol.model.Cliente;
import com.mycompany.deliverycontrol.repository.Banco;

/**
 *
 * @author Gustavo Camargo
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    IRegistraClienteCRUD registraCliente;
    Banco banco = Banco.getInstance();
    DefaultTableModel modeloTabela;

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Clientes");
        modeloTabela = (DefaultTableModel) jTable_ListaCliente.getModel();
        registraCliente = new RegistraClienteControle();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        try {
            PreencheTabelas.preencherTabelaClientes(modeloTabela, registraCliente.listagemDeCliente());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // #region AUTOCREATED
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_ListaCliente = new javax.swing.JTable();
        jTextField_nome = new javax.swing.JTextField();
        jTextField_Endereco = new javax.swing.JTextField();
        jTextField_telefone = new javax.swing.JTextField();
        jLabel_nome = new javax.swing.JLabel();
        jLabel_telefone = new javax.swing.JLabel();
        jLabel_endereco = new javax.swing.JLabel();
        jButton_deletar = new javax.swing.JButton();
        jButton_limpar = new javax.swing.JButton();
        jButton_salvar = new javax.swing.JButton();
        jLabel_id = new javax.swing.JLabel();
        jTextField_deletarID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(65, 31, 21));
        jPanel1.setForeground(new java.awt.Color(65, 31, 21));

        jLabel1.setBackground(new java.awt.Color(255, 178, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 178, 0));
        jLabel1.setText("Lista de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(36, 36, 36)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addContainerGap()));

        jPanel2.setBackground(new java.awt.Color(65, 31, 21));

        jTable_ListaCliente.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "ID", "Nome", "Endereco", "Telefone"
                }));
        jScrollPane1.setViewportView(jTable_ListaCliente);

        jLabel_nome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_nome.setText("Nome");

        jLabel_telefone.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_telefone.setText("Telefone");

        jLabel_endereco.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_endereco.setText("Endereço");

        jButton_deletar.setText("Deletar");
        jButton_deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deletarActionPerformed(evt);
            }
        });

        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

        jButton_salvar.setText("Salvar");
        jButton_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvarActionPerformed(evt);
            }
        });

        jLabel_id.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel_id.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                false)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel_nome)
                                                                .addGap(57, 57, 57)
                                                                .addComponent(jTextField_nome))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                jPanel2Layout.createSequentialGroup()
                                                                        .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel_endereco)
                                                                                .addComponent(jLabel_telefone))
                                                                        .addGap(33, 33, 33)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextField_Endereco,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        410,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel2Layout
                                                                                        .createSequentialGroup()
                                                                                        .addComponent(
                                                                                                jTextField_telefone,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                138,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jButton_limpar)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jButton_salvar)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(jLabel_id)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(
                                                                                                jTextField_deletarID,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                37,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton_deletar, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(14, 14, 14))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                jPanel2Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jScrollPane1)))
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_nome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_nome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_endereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField_telefone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_telefone)
                                        .addComponent(jButton_deletar)
                                        .addComponent(jButton_limpar)
                                        .addComponent(jButton_salvar)
                                        .addComponent(jTextField_deletarID, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_id))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16,
                                        Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     // #endregion

    private void jButton_deletarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_deletarActionPerformed
        try {
            Integer id = Integer.parseInt(jTextField_deletarID.getText());
            registraCliente.deletar(id);
            PreencheTabelas.preencherTabelaClientes(modeloTabela, registraCliente.listagemDeCliente());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }// GEN-LAST:event_jButton_deletarActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_limparActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton_limparActionPerformed

    private void jButton_salvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_salvarActionPerformed
        String nome = jTextField_nome.getText();
        String endereco = jTextField_Endereco.getText();
        String telefone = jTextField_telefone.getText();
        Cliente cliente = new Cliente(nome, endereco, telefone);
        try {
            registraCliente.incluir(cliente);
            PreencheTabelas.preencherTabelaClientes(modeloTabela, registraCliente.listagemDeCliente());
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }// GEN-LAST:event_jButton_salvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_deletar;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_endereco;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_nome;
    private javax.swing.JLabel jLabel_telefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_ListaCliente;
    private javax.swing.JTextField jTextField_Endereco;
    private javax.swing.JTextField jTextField_deletarID;
    private javax.swing.JTextField jTextField_nome;
    private javax.swing.JTextField jTextField_telefone;
    // End of variables declaration//GEN-END:variables
}
