/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.model;

/**
 *
 * @author brunocoronha.adm
 */
public abstract class Entrega {
    private String nomeEntregador;
    private String hrEntrega;
    private Integer id;    

    public Entrega(String nomeEntregador, String hrEntrega, Integer id) {
        this.nomeEntregador = nomeEntregador;
        this.hrEntrega = hrEntrega;
        this.id = id;
    }

    public Entrega(Pedido pedido, Entregador entregador){
        nomeEntregador = entregador.getNome();
        hrEntrega = pedido.getHrEntrega();
        id = pedido.getId();
    }

    @Override
    public String toString() {
        return id + ";" + nomeEntregador + ";" + hrEntrega;
    }

    public String getNomeEntregador() {
        return nomeEntregador;
    }

    public void setNomeEntregador(String nomeEntregador) {
        this.nomeEntregador = nomeEntregador;
    }

    public String getHrEntrega() {
        return hrEntrega;
    }

    public void setHrEntrega(String hrEntrega) {
        this.hrEntrega = hrEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
}
