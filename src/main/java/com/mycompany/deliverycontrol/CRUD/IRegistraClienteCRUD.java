package com.mycompany.deliverycontrol.CRUD;

import java.util.ArrayList;

import com.mycompany.deliverycontrol.model.Cliente;

public interface IRegistraClienteCRUD {

    public void incluir(Cliente cliente) throws Exception;

    public void alterar(Cliente cliente) throws Exception;

    public ArrayList<Cliente> listagemDeCliente() throws Exception;

    public Cliente consultar(Integer id) throws Exception;

    public boolean deletar(Integer id) throws Exception;

}
