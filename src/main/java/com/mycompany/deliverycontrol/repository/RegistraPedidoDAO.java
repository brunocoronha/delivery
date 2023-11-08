/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.IRegistraPedidoCRUD;
import com.mycompany.deliverycontrol.model.Pedido;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RegistraPedidoDAO implements IRegistraPedidoCRUD {

    Banco banco = Banco.getInstance();

    @Override
    public void incluir(Pedido pedido) throws Exception  {
        try {
            banco.conexao();
            boolean inseriu = banco.insertPedido(pedido);
            if (inseriu) {
                JOptionPane.showMessageDialog(null, "Pedido registrado com sucesso!");
            }else {
                JOptionPane.showMessageDialog(null, "Não foi possivel registrar o pedido!");
            }
            banco.fechaConexao();
        } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e.getMessage() + "Erro incluir pedido");
        }

    }

    @Override
    public void alterar(Pedido pedido) throws Exception {
        try{
            banco.conexao();
            banco.updatePedido(pedido);
            banco.fechaConexao();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "Erro alterar pedido");
        }
    }

    @Override
    public ArrayList<Pedido> listagemDePedidos() throws Exception {
        try {
            banco.conexao();
            ArrayList<Pedido> listaPedidos = null;
            listaPedidos = banco.buscaPedidos();
            banco.fechaConexao();
            return listaPedidos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + "Erro listar pedidos");
        }
        return null;
    }

    @Override
    public Pedido consultar(Integer id) throws Exception {
        try{
            banco.conexao();
            Pedido pedido = banco.buscaPedido(id);
            banco.fechaConexao();
            return pedido;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "Erro Consultar Pedido");
        }
        return null;
    }
}
