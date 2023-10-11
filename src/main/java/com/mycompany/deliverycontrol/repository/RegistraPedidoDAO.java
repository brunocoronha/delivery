/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;
import com.mycompany.deliverycontrol.CRUD.IRegistraPedidoCRUD;
import com.mycompany.deliverycontrol.model.Pedido;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author brunocoronha.adm
 */
public class RegistraPedidoDAO implements IRegistraPedidoCRUD {

    String nomeDoArquivo = null;

    public RegistraPedidoDAO() {
        nomeDoArquivo = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator + "dadosDelivey\\pedidos.txt";
    }

    @Override
    public void incluir(Pedido pedido) throws Exception {
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nomeDoArquivo, true))) {
            buffWrite.append(pedido.toString() + "\n");
            buffWrite.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void alterar(Pedido pedido) throws Exception {

    }

    @Override
    public ArrayList<Pedido> listagemDePedidos() throws Exception {
        return null;
    }

    @Override
    public Pedido consultar(Integer id) throws Exception {
        return null;
    }
}
