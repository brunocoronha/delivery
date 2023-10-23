/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.view;

/**
 *
 * @author brunocoronha.adm
 */
import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.controller.RegistraEntregadoresControle;
import com.mycompany.deliverycontrol.model.Entregador;
import com.mycompany.deliverycontrol.repository.Banco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class JanelaEntregador extends JFrame {
    IRegistraEntregadoresCRUD entregadores = new RegistraEntregadoresControle();
    Banco banco = Banco.getInstance();
    private JTextField nomeField, telefoneField, cpfField;    
    public JanelaEntregador() throws SQLException {
        // Configurações básicas do JFrame        
        setTitle("Cadastro de Entregador");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); // Impede o redimensionamento da janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        
        
        // Criação dos componentes JLabel e JTextFielfd
        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(15);

        JLabel cpfLabel = new JLabel("CPF:");
        cpfField = new JTextField(11);       

        // Criação dos botões
        JButton registrarButton = new JButton("Registrar");
        JButton limparButton = new JButton("Limpar");
        JButton voltarButton = new JButton("Voltar");

        // Configuração do layout usando GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nomeLabel, gbc);

        gbc.gridx = 1;
        panel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(telefoneLabel, gbc);

        gbc.gridx = 1;
        panel.add(telefoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(cpfLabel, gbc);

        gbc.gridx = 1;
        panel.add(cpfField, gbc);        

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(registrarButton, gbc);

        gbc.gridy = 9;
        panel.add(limparButton, gbc);

        gbc.gridy = 10;
        panel.add(voltarButton, gbc);

        // Adiciona o painel ao JFrame
        add(panel);

        // Ação do botão "Limpar"
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Registra um novo Entregador               
                String nome = nomeField.getText();
                String telefone = telefoneField.getText();
                Entregador entregador = new Entregador(nome,telefone);
                try {
                    entregadores.incluir(entregador);
                    banco.conexao();
                    //banco.removeEntregador(6);
                    for(Entregador i : banco.buscaEntregadores()){
                        System.out.println(i.toString());
                    }
                    banco.fechaConexao();
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        });

        // Ação do botão "Limpar"
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa todos os campos de texto                
                nomeField.setText("");
                telefoneField.setText("");
                cpfField.setText("");
            }
        });

        // Ação do botão "Voltar"
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a janela
                setVisible(false);
                dispose();
            }
        });
    }

}