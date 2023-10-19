package com.mycompany.deliverycontrol.controller;

import java.util.ArrayList;

import com.mycompany.deliverycontrol.CRUD.IRegistraClienteCRUD;
import com.mycompany.deliverycontrol.model.Cliente;
import com.mycompany.deliverycontrol.repository.RegistraClienteDAO;

public class RegistraClienteControle implements IRegistraClienteCRUD{

    IRegistraClienteCRUD registraClientePersistencia = null;

    public RegistraClienteControle() {
        registraClientePersistencia = new RegistraClienteDAO();
    }

    @Override
    public void incluir(Cliente Cliente) throws Exception {
        registraClientePersistencia.incluir(Cliente);
    }

    @Override
    public void alterar(Cliente Cliente) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public ArrayList<Cliente> listagemDeCliente() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listagemDeClientes'");
    }

    @Override
    public Cliente consultar(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }
    
}
