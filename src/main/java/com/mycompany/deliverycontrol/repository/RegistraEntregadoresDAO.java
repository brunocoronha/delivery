/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.model.Entregador;
import com.mycompany.deliverycontrol.model.Veiculo;
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
public class RegistraEntregadoresDAO implements IRegistraEntregadoresCRUD {

    Banco banco = Banco.getInstance();
    private String nomeDoArquivo = null;

    public RegistraEntregadoresDAO() {
        
        nomeDoArquivo = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator + "dadosDelivey\\entregadoresBD.txt";
    }

    @Override
    public void incluir(Entregador entregador) throws Exception {
        banco.conexao();
        System.out.println(banco.toString());
        if(banco.estaConectado()){
            System.out.println("conectadooooooooooooo");
        }else{
            System.out.println("nao conectadooooooooooooo");
        }
        banco.insertEntregador(entregador);
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter(nomeDoArquivo, true))) {
            buffWrite.append(entregador.toString() + "\n");
            buffWrite.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void alterar(Entregador entregador) throws Exception {
        int novaLinha = 0; // linha que será alterada
        boolean entregadorEncontrado = false;
        try {
            FileReader fr = new FileReader(nomeDoArquivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(";");
                    if (entregador.getId().equals(Integer.valueOf(dados[0]))) {
                        System.out.println("Encontrou");
                        entregadorEncontrado = true;
                        break; // Caso encontre o entregador o laço é parado
                    } else {
                        novaLinha++; //
                    }
                }
                br.close();
            }
        } catch (IOException e) {
            throw new Exception("Não foi possível abrir o arquivo");
        }
        if (entregadorEncontrado) {
            try {
                Path arquivoPath = Path.of(nomeDoArquivo);
                List<String> linhas = Files.readAllLines(arquivoPath, StandardCharsets.UTF_8);
                linhas.set(novaLinha, entregador.toString()); // Altera a linha desejada
                Files.write(arquivoPath, linhas, StandardCharsets.UTF_8);
            } catch (IOException e) {
                throw new Exception("Não foi possível alterar o arquivo");
            }
        } else {
            System.out.println("Entregador não encontrado");
        }

    }

    @Override
    public ArrayList<Entregador> listagemDeEntregador() throws Exception {
        return null;
    }

    @Override
    public Entregador consultar(Integer id) throws Exception {
        try {
            FileReader fr = new FileReader(nomeDoArquivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(";");
                    if (id.equals(Integer.valueOf(dados[0]))) {
                        Entregador entregador = new Entregador(
                                Integer.valueOf(dados[0]),
                                dados[1],
                                dados[2],
                                dados[3],
                                new Veiculo(dados[4], dados[5], dados[6]),
                                Integer.parseInt(dados[7]));
                        return entregador;
                    }
                }
                br.close();
            }
            return null;
        } catch (IOException e) {
            throw new Exception("Não foi possível abrir o arquivo");
        }
    }
}