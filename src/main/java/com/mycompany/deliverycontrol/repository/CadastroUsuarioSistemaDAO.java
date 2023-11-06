package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.ICadastroUsuarioSistema;
import com.mycompany.deliverycontrol.model.LoginUsuario;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class CadastroUsuarioSistemaDAO implements ICadastroUsuarioSistema {

    Banco banco = Banco.getInstance();
    @Override
    public boolean incluir(LoginUsuario loginUsuario) throws Exception {
        try {
            banco.conexao();
            boolean removeu = banco.inserirUsuarioSistema(loginUsuario);
            banco.fechaConexao();
            return removeu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deletar(LoginUsuario loginUsuario) throws Exception {
        try {
            banco.conexao();
            System.out.println(loginUsuario.getNome_usuario() + " " + loginUsuario.getId());
            boolean removeu = banco.removeUsuarioSistema(loginUsuario.getId());
            banco.fechaConexao();
            return removeu;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<LoginUsuario> listagemDeUsuarioSistema() throws Exception {
        ArrayList<LoginUsuario> listaUsuarioSistema = null;
        try {
            banco.conexao();
            listaUsuarioSistema = banco.buscaUsuarios();
            banco.fechaConexao();
            return listaUsuarioSistema;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public LoginUsuario buscarNome(String nome) throws Exception {
        try {
            banco.conexao();
            LoginUsuario usuario = banco.buscaUsuarioSistemaPorNome(nome);
            banco.fechaConexao();
            return usuario;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
        }
        return null;
    }
}

