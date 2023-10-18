/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.deliverycontrol;

import com.mycompany.deliverycontrol.view.JanelaPrincipal;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
        
    }
}
