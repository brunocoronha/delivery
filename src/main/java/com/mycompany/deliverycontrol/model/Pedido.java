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
    }

    @Override
    public String toString() {
        return id +
                ";" + nome +
                ";" + endereco +
                ";" + telefone +
                ";" + observacao +
                ";" + hrEntrega;
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

}

