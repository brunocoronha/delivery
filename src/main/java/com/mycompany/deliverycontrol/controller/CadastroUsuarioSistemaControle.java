package com.mycompany.deliverycontrol.controller;

import com.mycompany.deliverycontrol.CRUD.ICadastroUsuarioSistema;
import com.mycompany.deliverycontrol.model.LoginUsuario;
import com.mycompany.deliverycontrol.repository.CadastroUsuarioSistemaDAO;


import java.util.ArrayList;

public class CadastroUsuarioSistemaControle implements ICadastroUsuarioSistema {
    ICadastroUsuarioSistema cadastroUsuarioSistema = null;

    public CadastroUsuarioSistemaControle() {
        cadastroUsuarioSistema = new CadastroUsuarioSistemaDAO();
    }
    @Override
    public boolean incluir(LoginUsuario loginUsuario) throws Exception {
        return cadastroUsuarioSistema.incluir(loginUsuario);
    }

    @Override
    public boolean deletar(LoginUsuario loginUsuario) throws Exception {
        return cadastroUsuarioSistema.deletar(loginUsuario);
    }

    @Override
    public ArrayList<LoginUsuario> listagemDeUsuarioSistema() throws Exception {
        return cadastroUsuarioSistema.listagemDeUsuarioSistema();
    }

    @Override
    public LoginUsuario buscarNome(String nome) throws Exception {
        return cadastroUsuarioSistema.buscarNome(nome);
    }
}
