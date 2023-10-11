/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.model;

/**
 *
 * @author brunocoronha.adm
 */
public class EntregaCancelada extends Entrega{

    private String motivo = "";

    public EntregaCancelada(Pedido pedido, Entregador entregador, String motivo) {
        super(pedido, entregador);
        this.motivo = motivo;
    }
    
    @Override
    public String toString(){
        return super.toString() + ";" + motivo;
    }

}
