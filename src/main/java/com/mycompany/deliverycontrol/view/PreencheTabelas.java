package com.mycompany.deliverycontrol.view;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.mycompany.deliverycontrol.model.Entregador;

public class PreencheTabelas {

    public static void preencherTabelaEntregadores(DefaultTableModel modelo, ArrayList<Entregador> entregadores){
        modelo.setNumRows(0);
        if(entregadores.isEmpty()){
            return;
        }
        for(Entregador e : entregadores){
            Object[] obj = e.toString().split(";");
            modelo.addRow(obj);
        }
    }
    
}
