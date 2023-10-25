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
    public void incluir(Cliente cliente) throws Exception {
        registraClientePersistencia.incluir(cliente);
    }

    @Override
    public void alterar(Cliente cliente) throws Exception {
        registraClientePersistencia.alterar(cliente);
    }

    @Override
    public ArrayList<Cliente> listagemDeCliente() throws Exception {
        return registraClientePersistencia.listagemDeCliente();
    }

    @Override
    public Cliente consultar(Integer id) throws Exception {
        return registraClientePersistencia.consultar(id);
    }

    @Override
    public boolean deletar(Integer id) throws Exception {
        return registraClientePersistencia.deletar(id);
    }
    
}
