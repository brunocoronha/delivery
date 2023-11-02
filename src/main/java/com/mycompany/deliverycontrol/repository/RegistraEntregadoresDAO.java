/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.model.Entregador;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */
public class RegistraEntregadoresDAO implements IRegistraEntregadoresCRUD {

    Banco banco = Banco.getInstance();



    @Override
    public void incluir(Entregador entregador) {
        try {
            banco.conexao();
            banco.insertEntregador(entregador);
            banco.fechaConexao();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Entregador entregador) throws Exception {
        try {
            banco.conexao();
            banco.updateEntregador(entregador);
            banco.fechaConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Entregador> listagemDeEntregador() throws Exception {
        try {
            banco.conexao();
            ArrayList<Entregador> listaEntregadores = null;
            banco.conexao();
            listaEntregadores = banco.buscaEntregadores();
            banco.fechaConexao();
            return listaEntregadores;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Entregador consultar(Integer id) throws Exception {
        try {
            banco.conexao();
            Entregador entregador = banco.buscaEntregador(id);
            banco.fechaConexao();
            return entregador;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deletar(Integer id) throws Exception {
        try {
            banco.conexao();
            boolean removeu = banco.removeEntregador(id);
            banco.fechaConexao();
            return removeu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
