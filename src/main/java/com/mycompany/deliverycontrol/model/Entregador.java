/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.model;

/**
 *
 * @author brunocoronha.adm
 */
public class Entregador {
    private Integer id = 0;
    private String nome = "";
    private String telefone = "";
    private String cpf = "";
    private boolean statusEntregador = false;
    

    public Entregador(Integer id, String nome, String telefone, String cpf, boolean statusEntregador) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.statusEntregador = statusEntregador;
    }

    public Entregador(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return id + ";" +
                nome + ";" +
                telefone + ";" +
                cpf + ";";
    }

    // #region Getter e Setter
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isStatusEntregador() {
        return statusEntregador;
    }

    public void setStatusEntregador(boolean statusEntregador) {
        this.statusEntregador = statusEntregador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    // #endregion
}
