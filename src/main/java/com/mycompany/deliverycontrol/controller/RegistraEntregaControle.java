/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.controller;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregaCRUD;
import com.mycompany.deliverycontrol.model.Entrega;
import com.mycompany.deliverycontrol.repository.RegistraEntregaDAO;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */
public class RegistraEntregaControle implements IRegistraEntregaCRUD {
    
    IRegistraEntregaCRUD registraentregaPersistencia = null;

    public RegistraEntregaControle() {
        registraentregaPersistencia = new RegistraEntregaDAO();
    }

    @Override
    public void incluir(Entrega entrega) throws Exception {
        registraentregaPersistencia.incluir(entrega);
    }

    @Override
    public void alterar(Entrega entrega) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }

    @Override
    public ArrayList<Entrega> listagemDeEntrega() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listagemDeentregas'");
    }

    @Override
    public Entrega consultar(Integer id) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultar'");
    }

  
}

