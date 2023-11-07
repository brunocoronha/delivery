/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.controller;

import com.mycompany.deliverycontrol.CRUD.IRegistraPedidoCRUD;
import com.mycompany.deliverycontrol.model.Pedido;
import com.mycompany.deliverycontrol.repository.RegistraPedidoDAO;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */
public class RegistraPedidoControle implements IRegistraPedidoCRUD {
    
    IRegistraPedidoCRUD registraPedidoPersistencia = null;

    public RegistraPedidoControle() {
        registraPedidoPersistencia = new RegistraPedidoDAO();
    }

    @Override
    public void incluir(Pedido pedido) throws Exception {
        System.out.println(pedido.toString());
        registraPedidoPersistencia.incluir(pedido);
    }

    @Override
    public void alterar(Pedido pedido) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public ArrayList<Pedido> listagemDePedidos() throws Exception {
        return registraPedidoPersistencia.listagemDePedidos();
    }

    @Override
    public Pedido consultar(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }

  
}