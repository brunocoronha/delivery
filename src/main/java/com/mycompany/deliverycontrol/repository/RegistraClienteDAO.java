package com.mycompany.deliverycontrol.repository;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mycompany.deliverycontrol.CRUD.IRegistraClienteCRUD;
import com.mycompany.deliverycontrol.model.Cliente;

public class RegistraClienteDAO implements IRegistraClienteCRUD {

    Banco banco = Banco.getInstance();


    @Override
    public void incluir(Cliente cliente) throws Exception {
        try {
            banco.conexao();
            boolean inseriu = banco.insertCliente(cliente);
            if (inseriu) {
                JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!");
            }else {
                JOptionPane.showMessageDialog(null, "Não foi possivel inserir o usuario!");
            }
            banco.fechaConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Cliente cliente) throws Exception {
        try {
            banco.conexao();
            banco.updateCliente(cliente);
            banco.fechaConexao();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public ArrayList<Cliente> listagemDeCliente() throws Exception {
        ArrayList<Cliente> listaClientes = null;
        try {
            banco.conexao();
            listaClientes = banco.buscaClientes();
            banco.fechaConexao();
            return listaClientes;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Cliente consultar(Integer id) throws Exception {
        try {
            banco.conexao();           
            Cliente cliente = banco.buscaCliente(id);
            banco.fechaConexao();
            return cliente;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        }
        return null;
    }

    @Override
    public boolean deletar(Integer id) throws Exception {
        try {
            banco.conexao();
            boolean removeu = banco.removeCliente(id);
            banco.fechaConexao();
            return removeu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Cliente consultarPorNome(String nome) throws Exception {
        try {
            banco.conexao();           
            Cliente cliente = banco.buscaClientePorNome(nome);
            banco.fechaConexao();
            return cliente;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        }
        return null;
    }

}
