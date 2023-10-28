package com.mycompany.deliverycontrol.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameBuscaID extends JFrame {
    private JTextField jtextfield_id;
    
    public FrameBuscaID() {
        super("Busca por ID");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Informe o ID:");
        jtextfield_id = new JTextField(10);
        JButton buscarButton = new JButton("Buscar");
        JButton voltarButton = new JButton("Voltar");

        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a janela
                dispose();
            }
        });

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = jtextfield_id.getText();
                // Faça algo com o ID digitado
                JOptionPane.showMessageDialog(null, "Você digitou o ID: " + id);
            }
        });

        panel.add(label);
        panel.add(jtextfield_id);
        panel.add(buscarButton);
        panel.add(voltarButton);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrameBuscaID janela = new FrameBuscaID();
                janela.setVisible(true);
            }
        });
    }
}