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

    private Integer id;
    private Integer id_pedido;
    private String hrEntrega;

    public Entrega(Integer id, Integer id_pedido, String hrEntrega) {
        this.id = id;
        this.id_pedido = id_pedido;
        this.hrEntrega = hrEntrega;
    }
     public Entrega(Integer id, Integer id_pedido) {
        this.id = id;
        this.id_pedido = id_pedido;
    }

    @Override
    public String toString() {
        return id +
                ";" + id_pedido +
                ";" + hrEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getHrEntrega() {
        return hrEntrega;
    }

    public void setHrEntrega(String hrEntrega) {
        this.hrEntrega = hrEntrega;
    }    

}
