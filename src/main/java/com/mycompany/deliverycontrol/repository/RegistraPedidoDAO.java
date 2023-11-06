/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.IRegistraPedidoCRUD;
import com.mycompany.deliverycontrol.model.Pedido;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */
public class RegistraPedidoDAO implements IRegistraPedidoCRUD {

    Banco banco = Banco.getInstance();

    @Override
    public void incluir(Pedido pedido) throws Exception  {
        try {
            banco.conexao();
            banco.insertPedido(pedido);
            banco.fechaConexao();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
