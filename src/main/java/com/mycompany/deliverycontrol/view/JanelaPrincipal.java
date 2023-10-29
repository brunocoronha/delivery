/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.view;

/**
 *
 * @author brunocoronha.adm
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame {
    
    public JanelaPrincipal() {
        setTitle("Janela Principal");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        JButton botaoPedido = new JButton("Pedido");
        JButton botaoEntregador = new JButton("Entregador");
        JButton botaoCliente = new JButton("Cliente");

        JPanel painel = new JPanel(new GridLayout(3, 1));
        painel.add(botaoPedido);
        painel.add(botaoEntregador);
        painel.add(botaoCliente);
        add(painel);

        botaoPedido.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaRegistrarPedido janelaPedido = new TelaRegistrarPedido();
                janelaPedido.setVisible(true);
                janelaPedido.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        botaoEntregador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastroEntregador janelaEntregador;
                janelaEntregador = new TelaCadastroEntregador();
                janelaEntregador.setTitle("Cadastro de entregador");
                janelaEntregador.setVisible(true);
                janelaEntregador.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                janelaEntregador.setResizable(false);
                janelaEntregador.setLocationRelativeTo(null);
            }
        });

        
        botaoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaCadastroCliente janelaCliente;
                janelaCliente = new TelaCadastroCliente();
                janelaCliente.setVisible(true);
                
            }
        });

    }


}