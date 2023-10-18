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
    private String nome = "";
    private String endereco = "";
    private String telefone = "";
    private String observacao = "";
    private String hrEntrega = "";
    private StatusPedidoENUM statusPedido = null;

    public Pedido(Integer id, String nome, String endereco, String telefone, String observacao, String hrEntrega) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.observacao = observacao;
        this.hrEntrega = hrEntrega;
        //this.id_cliente = id_cliente;
        //this.id_entregador = id_entregador;
    }

    @Override
    public String toString() {
        return id +
                ";" + nome +
                ";" + endereco +
                ";" + telefone +
                ";" + observacao +
                ";" + hrEntrega;// +
                //";" + id_cliente +
                //";" + id_entregador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public String getHrEntrega() {
        return hrEntrega;
    }

    public void setHrEntrega(String hrEntrega) {
        this.hrEntrega = hrEntrega;
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

