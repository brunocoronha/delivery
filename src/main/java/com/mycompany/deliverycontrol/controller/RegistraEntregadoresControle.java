/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.controller;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.model.Entregador;
import com.mycompany.deliverycontrol.repository.RegistraEntregadoresDAO;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */
public class RegistraEntregadoresControle implements IRegistraEntregadoresCRUD {

    IRegistraEntregadoresCRUD entregadoresPersistencia = null;

    public RegistraEntregadoresControle() {
        entregadoresPersistencia = new RegistraEntregadoresDAO();
    }
    @Override
    public void incluir(Entregador entregador) throws Exception {
        entregadoresPersistencia.incluir(entregador);
    }

    @Override
    public void alterar(Entregador entregador) throws Exception {
        entregadoresPersistencia.alterar(entregador);
    }

    @Override
    public ArrayList<Entregador> listagemDeEntregador() throws Exception {
        return entregadoresPersistencia.listagemDeEntregador();
    }

    @Override
    public Entregador consultar(Integer id) throws Exception {
        return entregadoresPersistencia.consultar(id);
    }
}
