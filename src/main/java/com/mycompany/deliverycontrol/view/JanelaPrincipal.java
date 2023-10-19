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
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JanelaPrincipal extends JFrame {
    
    public JanelaPrincipal() {
        setTitle("Janela Principal");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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
                JanelaPedido janelaPedido = new JanelaPedido();
                janelaPedido.setVisible(true);
                
            }
        });

        botaoEntregador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaEntregador janelaEntregador;
                try {
                    janelaEntregador = new JanelaEntregador();
                    janelaEntregador.setVisible(true);
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
                
            }
        });

        
        botaoCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JanelaCliente janelaCliente;
                janelaCliente = new JanelaCliente();
                janelaCliente.setVisible(true);
                
            }
        });

    }


}