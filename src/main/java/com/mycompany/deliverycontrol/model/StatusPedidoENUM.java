/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.model;

/**
 *
 * @author brunocoronha.adm
 */
public enum StatusPedidoENUM {    

        PEDIDO_RECEBIDO("Pedido recebido"),
        PEDIDO_EM_PREPARO("Pedido em preparo"),
        PEDIDO_AGUARDANDO_RETIRDA("Aguardando coleta do entregador"),
        PEDIDO_SAIU_ENTREGA("Pedido saiu para Entrega"),
        PEDIDO_ENTREGUE("Pedido entregue");
    
        private String descricao;
    
        StatusPedidoENUM(String descricao) {
            this.descricao = descricao;
        }
    
        public String getDescricao() {
            return descricao;
        }
    
}