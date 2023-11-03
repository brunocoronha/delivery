package com.mycompany.deliverycontrol.CRUD;

import com.mycompany.deliverycontrol.model.Cliente;
import com.mycompany.deliverycontrol.model.LoginUsuario;

import java.util.ArrayList;

public interface ICadastroUsuarioSistema {
    public boolean incluir(LoginUsuario loginUsuario) throws Exception;

    public boolean deletar(LoginUsuario loginUsuario) throws Exception;

    public ArrayList<LoginUsuario> listagemDeUsuarioSistema() throws Exception;

    public LoginUsuario buscarNome(String nome)throws Exception;
}
