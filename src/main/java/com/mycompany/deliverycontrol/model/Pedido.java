/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.model;

/**
 *
 * @author brunocoronha.adm
 */
public class Pedido {
    private Integer id = 0;
    private Integer id_cliente = 0;
    private Integer id_entregador = 0;
    private String observacao = "";
    private StatusPedidoENUM statusPedido = null;

    public Pedido(Integer id, Integer id_cliente, String observacao) {
        this.id = id;
        this.id_cliente = id_cliente;
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return id +
                ";" + id_cliente +
                ";" + id_entregador +
                ";" + observacao +
                ";" + statusPedido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public StatusPedidoENUM isStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedidoENUM statusPedido) {
        this.statusPedido = statusPedido;
    }
    
    public StatusPedidoENUM getStatusPedido() {
        return statusPedido;
    }

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public Integer getId_entregador() {
        return id_entregador;
    }

    public void setId_entregador(Integer id_entregador) {
        this.id_entregador = id_entregador;
    }

}
