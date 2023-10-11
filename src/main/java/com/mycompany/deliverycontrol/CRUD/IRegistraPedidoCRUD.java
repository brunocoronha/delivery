/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.deliverycontrol.CRUD;

import com.mycompany.deliverycontrol.model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */
public interface IRegistraPedidoCRUD {
     public void incluir(Pedido pedido) throws Exception;

        public void alterar(Pedido pedido) throws Exception;

        public ArrayList<Pedido> listagemDePedidos() throws Exception;

        public Pedido consultar(Integer id) throws Exception;

}
