/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.deliverycontrol;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.controller.RegistraEntregadoresControle;
import com.mycompany.deliverycontrol.model.Entregador;
import com.mycompany.deliverycontrol.view.JanelaPrincipal;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


/**
 *
 * @author brunocoronha.adm
 */
public class DeliveryControl {

    public static void main(String[] args) {
        String caminho = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator + "dadosDelivey";
        File diretorio = new File(caminho);
        if (!(diretorio.exists() && diretorio.isDirectory())) {
            Path path = Paths.get(caminho);
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                System.err.println("Falha ao criar o diretório: " + e.getMessage());

            }
        }
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setVisible(true);

        IRegistraEntregadoresCRUD entregadores = new RegistraEntregadoresControle();
        ArrayList<Entregador> listaDeEntregadores;
        try {
            listaDeEntregadores = entregadores.listagemDeEntregador();
            for(Entregador e : listaDeEntregadores){
                System.out.println(e.toString());
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            
        
    }
}
