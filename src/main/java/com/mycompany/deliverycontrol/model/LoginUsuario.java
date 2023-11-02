package com.mycompany.deliverycontrol.model;

public class LoginUsuario {
    private int id;
    private String nome_usuario;
    private String senha_usuario;

    public LoginUsuario(String nome_usuario, String senha_usuario) {

        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }
}
