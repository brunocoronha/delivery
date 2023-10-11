/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregaCRUD;
import com.mycompany.deliverycontrol.model.Entrega;
import com.mycompany.deliverycontrol.model.EntregaCancelada;
import com.mycompany.deliverycontrol.model.EntregaRealizada;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author brunocoronha.adm
 */
public class RegistraEntregaDAO implements IRegistraEntregaCRUD {

    private String arquivo1 = null;
    private String arquivo2 = null;

    public RegistraEntregaDAO() {
        arquivo1 = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator + "dadosDelivey\\entregasRealizadasBD.txt";
        arquivo2 = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator + "dadosDelivey\\entregasCanceladasBD.txt";
    }

    @Override
    public void incluir(Entrega entrega) throws Exception {
        if (entrega instanceof EntregaRealizada) {
            try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo1, true))) {
                buffWrite.append(entrega.toString() + "\n");
                buffWrite.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        if(entrega instanceof EntregaCancelada){
            try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo2, true))) {
                buffWrite.append(entrega.toString() + "\n");
                buffWrite.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    @Override
    public void alterar(Entrega entrega) throws Exception {
        int novaLinha = 0; // linha que será alterada
        boolean entregaEncontrada = false;
        try {
            FileReader fr = new FileReader(arquivo1);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(";");
                    if (entrega.getId().equals(dados[0])) {
                        entregaEncontrada = true;
                        break; // Caso encontre o Entrega o laço é parado
                    } else {
                        novaLinha++; //
                    }
                }
                br.close();
            }
        } catch (IOException e) {
            throw new Exception("Não foi possível abrir o arquivo");
        }
        if (entregaEncontrada) {
            try {
                Path arquivoPath = Path.of(arquivo1);
                List<String> linhas = Files.readAllLines(arquivoPath, StandardCharsets.UTF_8);
                linhas.set(novaLinha, entrega.toString()); // Altera a linha desejada
                Files.write(arquivoPath, linhas, StandardCharsets.UTF_8);
            } catch (IOException e) {
                throw new Exception("Não foi possível alterar o arquivo");
            }
        } else {
            System.out.println("Entrega não encontrado");
        }

    }

    @Override
    public ArrayList<Entrega> listagemDeEntrega() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listagemDeEntregador'");
    }

    @Override
    public Entrega consultar(Integer id) throws Exception {/*
                                                            * try {
                                                            * FileReader fr = new FileReader(nomeDoArquivo);
                                                            * try (BufferedReader br = new BufferedReader(fr)) {
                                                            * String linha = "";
                                                            * while ((linha = br.readLine()) != null) {
                                                            * String[] dados = linha.split(";");
                                                            * if (id.equals(Integer.parseInt(dados[0]))) {
                                                            * Entrega entragador = new Entrega(
                                                            * Integer.parseInt(dados[0]),
                                                            * dados[1],
                                                            * dados[2],
                                                            * dados[3],
                                                            * new Veiculo(dados[4], dados[5], dados[6]),
                                                            * Integer.parseInt(dados[7]));
                                                            * return entragador;
                                                            * }
                                                            * }
                                                            * br.close();
                                                            * }
                                                            * return null;
                                                            * } catch (IOException e) {
                                                            * throw new Exception("Não foi possível abrir o arquivo");
                                                            * }
                                                            */
        return null;
    }

}

