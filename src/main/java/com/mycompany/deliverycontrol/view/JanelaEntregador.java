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
    private JTextField nomeField, telefoneField, cpfField, placaField, modeloField, corField, qntEntregasField;    
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

        JLabel placaLabel = new JLabel("Placa:");
        placaField = new JTextField(8);

        JLabel modeloLabel = new JLabel("Modelo:");
        modeloField = new JTextField(20);

        JLabel corLabel = new JLabel("Cor:");
        corField = new JTextField(15);

        JLabel qntEntregasLabel = new JLabel("Quantidade de Entregas:");
        qntEntregasField = new JTextField(5);

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
        gbc.gridy = 4;
        panel.add(placaLabel, gbc);

        gbc.gridx = 1;
        panel.add(placaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(modeloLabel, gbc);

        gbc.gridx = 1;
        panel.add(modeloField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        panel.add(corLabel, gbc);

        gbc.gridx = 1;
        panel.add(corField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        panel.add(qntEntregasLabel, gbc);

        gbc.gridx = 1;
        panel.add(qntEntregasField, gbc);

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
                String cpf = cpfField.getName();
                Entregador entregador = new Entregador(nome, telefone, cpf);
                try {
                    entregadores.incluir(entregador);
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
                placaField.setText("");
                modeloField.setText("");
                corField.setText("");
                qntEntregasField.setText("");
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