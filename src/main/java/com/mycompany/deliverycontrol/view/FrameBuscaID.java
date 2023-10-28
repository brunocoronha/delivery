package com.mycompany.deliverycontrol.view;

import javax.swing.*;

import com.mycompany.deliverycontrol.model.Cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameBuscaID extends JFrame {
    private JTextField jtextfield_id;
    private Object busca;

    public FrameBuscaID() {
        super("Busca por ID");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
                Integer id = Integer.parseInt(jtextfield_id.getText());
                // Faça algo com o ID digitado, por exemplo, exibir em uma mensagem de diálogo
                JOptionPane.showMessageDialog(null, "Você digitou o ID: " + id);

                // Aqui você pode chamar um método que faz algo com o ID
                fazAlgoComID(id);
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

    // Método para fazer algo com o ID
    private Cliente fazAlgoComID(Integer id) {
        // Faça algo com o ID aqui
        System.out.println("ID recebido: " + id);
        return null;
    }

    // Método para obter o valor do ID
    public String getID() {
        return jtextfield_id.getText();
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