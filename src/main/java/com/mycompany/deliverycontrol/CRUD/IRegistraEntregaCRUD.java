/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.CRUD;

/**
 *
 * @author brunocoronha.adm
 */
import com.mycompany.deliverycontrol.model.Entrega;
import java.util.ArrayList;


public interface IRegistraEntregaCRUD {

    public void incluir(Entrega entrega) throws Exception;
    public void alterar(Entrega entrega) throws Exception;
    public ArrayList<Entrega> listagemDeEntrega()  throws Exception;
    public Entrega consultar(Integer id) throws Exception;
    
}