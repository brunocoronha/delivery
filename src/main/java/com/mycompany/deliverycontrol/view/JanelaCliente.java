package com.mycompany.deliverycontrol.view;

import javax.swing.*;

import com.mycompany.deliverycontrol.CRUD.IRegistraClienteCRUD;
import com.mycompany.deliverycontrol.controller.RegistraClienteControle;
import com.mycompany.deliverycontrol.model.Cliente;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaCliente extends JFrame {
    IRegistraClienteCRUD clientes = new RegistraClienteControle();
    private JTextField campoNome, campoEndereco, campoTelefone;
    private JLabel labelNome, labelEndereco, labelTelefone;

    public JanelaCliente() {
        // Configurações gerais do JFrame
        setTitle("Cadastro de Cliente");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 3));

        // Campos de texto e rótulos
        labelNome = new JLabel("Nome:");
        campoNome = new JTextField(20);
        labelEndereco = new JLabel("Endereço:");
        campoEndereco = new JTextField(20);
        labelTelefone = new JLabel("Telefone:");
        campoTelefone = new JTextField(20);

        // Botões
        JButton botaoRegistrar = new JButton("Registrar");
        JButton botaoLimpar = new JButton("Limpar");
        JButton botaoVoltar = new JButton("Voltar");

        // Adicionar componentes ao JFrame
        add(labelNome);
        add(campoNome);
        add(new JLabel()); // Espaço vazio
        add(labelEndereco);
        add(campoEndereco);
        add(new JLabel()); // Espaço vazio
        add(labelTelefone);
        add(campoTelefone);
        add(new JLabel()); // Espaço vazio
        add(botaoRegistrar);
        add(botaoLimpar);
        add(botaoVoltar);

        // Ação do botão Registrar
        botaoRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Coloque aqui a ação desejada ao clicar em Registrar
                String nome = campoNome.getText();
                String endereco = campoEndereco.getText();
                String telefone = campoTelefone.getText();
                Cliente cliente = new Cliente(nome, endereco, telefone);
                try {
                    clientes.incluir(cliente);
                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                JOptionPane.showMessageDialog(JanelaCliente.this, "Cliente registrado!");

            }
        });

        // Ação do botão Limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Limpar os campos de texto
                campoNome.setText("");
                campoEndereco.setText("");
                campoTelefone.setText("");
            }
        });

        // Ação do botão Voltar
        botaoVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fechar a janela
                dispose();
            }
        });
    }
}
