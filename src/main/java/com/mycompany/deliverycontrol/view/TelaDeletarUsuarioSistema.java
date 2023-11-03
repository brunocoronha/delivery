/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import com.mycompany.deliverycontrol.CRUD.ICadastroUsuarioSistema;
import com.mycompany.deliverycontrol.model.LoginUsuario;
import com.mycompany.deliverycontrol.repository.Banco;
import com.mycompany.deliverycontrol.repository.CadastroUsuarioSistemaDAO;
import com.mycompany.deliverycontrol.view.TelaPrincipalDeliveryControl;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author gustavo.adm
 */
public class TelaDeletarUsuarioSistema extends javax.swing.JFrame {
    Banco banco = Banco.getInstance();
    ICadastroUsuarioSistema cadastroUsuarioSistemaControle = null;
    /**
     * Creates new form TelaDeletarUsuarioSistema
     */
    public TelaDeletarUsuarioSistema() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Deletar Usuario no Sistema");
        cadastroUsuarioSistemaControle = new CadastroUsuarioSistemaDAO();
        preencherComboBoxLogin();
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton_Voltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jComboBox_UsuariosCadastrados = new javax.swing.JComboBox<>();
        jButton_Deletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(65, 31, 21));
        jPanel2.setForeground(new java.awt.Color(65, 31, 21));

        jLabel1.setBackground(new java.awt.Color(255, 178, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 178, 0));
        jLabel1.setText("Deletar usuário");

        jLabel6.setIcon(icon); // NOI18N

        jButton_Voltar.setText("Voltar");

        jButton_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VoltarActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton_Voltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_Voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(65, 31, 21));

        jButton_Deletar.setText("Deletar");
        jButton_Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jComboBox_UsuariosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButton_Deletar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jComboBox_UsuariosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_Deletar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherComboBoxLogin()  {
        try {
            ArrayList<LoginUsuario> usuariosLista = cadastroUsuarioSistemaControle.listagemDeUsuarioSistema();
            jComboBox_UsuariosCadastrados.removeAllItems();
            jComboBox_UsuariosCadastrados.addItem("Escolha um usuario:");
            for (LoginUsuario usuarios : usuariosLista) {
                jComboBox_UsuariosCadastrados.addItem(usuarios.getNome_usuario());
            }
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }
    private void jButton_DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeletarActionPerformed
        try {
            String nomeSelecionado = (String) jComboBox_UsuariosCadastrados.getSelectedItem();
            LoginUsuario objLogin = cadastroUsuarioSistemaControle.buscarNome(nomeSelecionado);
            System.out.println(objLogin.toString());
            boolean adicicionou = cadastroUsuarioSistemaControle.deletar(objLogin);
            if ( adicicionou) {
                JOptionPane.showMessageDialog(null,"Usuario deletado com sucesso!");
                preencherComboBoxLogin();
            }else {
                JOptionPane.showMessageDialog(null,"Não foi possivel adicionar o usuario!");
            }
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel deletar: " + erro.getMessage());
        }

    }//GEN-LAST:event_jButton_DeletarActionPerformed

    private void jButton_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VoltarActionPerformed
        TelaPrincipalDeliveryControl telaPrincipalDeliveryControl = new TelaPrincipalDeliveryControl();
        telaPrincipalDeliveryControl.dispose();
        telaPrincipalDeliveryControl.setLocationRelativeTo(this);
        telaPrincipalDeliveryControl.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        telaPrincipalDeliveryControl.setVisible(true);
        dispose();
    }
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
            java.util.logging.Logger.getLogger(TelaDeletarUsuarioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarUsuarioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarUsuarioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeletarUsuarioSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeletarUsuarioSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Deletar;
    private javax.swing.JButton jButton_Voltar;
    private javax.swing.JComboBox<String> jComboBox_UsuariosCadastrados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
