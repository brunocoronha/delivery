/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.view;

/**
 *
 * @author brunocoronha.adm
 */
import com.mycompany.deliverycontrol.CRUD.IRegistraPedidoCRUD;
import com.mycompany.deliverycontrol.controller.RegistraPedidoControle;
import com.mycompany.deliverycontrol.model.Pedido;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaPedido extends JFrame {
    private JTextField idField, nomeField, enderecoField, telefoneField, observacaoField, hrEntregaField;
    IRegistraPedidoCRUD pedidos = new RegistraPedidoControle();
    public JanelaPedido() {
        // Configurações básicas do JFrame
        setTitle("Cadastro de Pedido");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false); // Impede o redimensionamento da janela
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Criação dos componentes JLabel e JTextField
        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField(10);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeField = new JTextField(20);

        JLabel enderecoLabel = new JLabel("Endereço:");
        enderecoField = new JTextField(40);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneField = new JTextField(15);

        JLabel observacaoLabel = new JLabel("Observação:");
        observacaoField = new JTextField(30);

        JLabel hrEntregaLabel = new JLabel("Hora de Entrega:");
        hrEntregaField = new JTextField(10);

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
        gbc.gridy = 0;
        panel.add(idLabel, gbc);

        gbc.gridx = 1;
        panel.add(idField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(nomeLabel, gbc);

        gbc.gridx = 1;
        panel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(enderecoLabel, gbc);

        gbc.gridx = 1;
        panel.add(enderecoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(telefoneLabel, gbc);

        gbc.gridx = 1;
        panel.add(telefoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(observacaoLabel, gbc);

        gbc.gridx = 1;
        panel.add(observacaoField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        panel.add(hrEntregaLabel, gbc);

        gbc.gridx = 1;
        panel.add(hrEntregaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(registrarButton, gbc);

        gbc.gridy = 7;
        panel.add(limparButton, gbc);

        gbc.gridy = 8;
        panel.add(voltarButton, gbc);

        // Adiciona o painel ao JFrame
        add(panel);

        // Ação do botão "Registrar"
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Registra um novo Entregador
                Integer id = Integer.valueOf(idField.getText());
                String nome = nomeField.getText();
                String endereco = enderecoField.getText();
                String telefone = telefoneField.getText();
                String observacao = observacaoField.getText();
                String hrEntrega = hrEntregaField.getText();
                Pedido pedido = new Pedido(id, nome, endereco, telefone, observacao, hrEntrega);
                System.out.println("Tela > " + pedido.toString());
                try {
                    pedidos.incluir(pedido);
                } catch (Exception e1) {
                    // TODO Auto-generated catch block

                }
            }
        });

        // Ação do botão "Limpar"
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpa todos os campos de texto
                idField.setText("");
                nomeField.setText("");
                enderecoField.setText("");
                telefoneField.setText("");
                observacaoField.setText("");
                hrEntregaField.setText("");
            }
        });

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a janela
                dispose();
            }
        });
    }
}