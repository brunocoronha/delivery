package com.mycompany.deliverycontrol.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mycompany.deliverycontrol.CRUD.IRegistraClienteCRUD;
import com.mycompany.deliverycontrol.model.Cliente;

public class RegistraClienteDAO implements IRegistraClienteCRUD {

    Banco banco = Banco.getInstance();
    private String nomeDoArquivo = null;

    public RegistraClienteDAO() {

        nomeDoArquivo = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator
                + "dadosDelivey\\ClienteBD.txt";
    }

    @Override
    public void incluir(Cliente cliente) {
        try {            
            if (!banco.estaConectado()) {
                banco.conexao();
                System.out.println("conectadooooooooooooo");
                banco.insertCliente(cliente);
                banco.fechaConexao();
            } else {
                System.out.println("nao conectadooooooooooooo");
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro ao conectar no banco");
            e.printStackTrace();
        }        
    }

    @Override
    public void alterar(Cliente cliente) throws Exception {
        int novaLinha = 0; // linha que será alterada
        boolean clienteEncontrado = false;
        try {
            FileReader fr = new FileReader(nomeDoArquivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linha = "";
                while ((linha = br.readLine()) != null) {
                    String[] dados = linha.split(";");
                    if (cliente.getNome().equals(Integer.valueOf(dados[0]))) {
                        System.out.println("Encontrou");
                        clienteEncontrado = true;
                        break; // Caso encontre o Cliente o laço é parado
                    } else {
                        novaLinha++; //
                    }
                }
                br.close();
            }
        } catch (IOException e) {
            throw new Exception("Não foi possível abrir o arquivo");
        }
        if (clienteEncontrado) {
            try {
                Path arquivoPath = Path.of(nomeDoArquivo);
                List<String> linhas = Files.readAllLines(arquivoPath, StandardCharsets.UTF_8);
                linhas.set(novaLinha, cliente.toString()); // Altera a linha desejada
                Files.write(arquivoPath, linhas, StandardCharsets.UTF_8);
            } catch (IOException e) {
                throw new Exception("Não foi possível alterar o arquivo");
            }
        } else {
            System.out.println("Cliente não encontrado");
        }

    }

    @Override
    public ArrayList<Cliente> listagemDeCliente() throws Exception{
        ArrayList<Cliente> listaClientes = null;
        try {
            banco.conexao();
            listaClientes = banco.buscaClientes();
            banco.fechaConexao();
            return listaClientes;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public Cliente consultar(Integer id) throws Exception {
        /*
         * try {
         * FileReader fr = new FileReader(nomeDoArquivo);
         * try (BufferedReader br = new BufferedReader(fr)) {
         * String linha = "";
         * while ((linha = br.readLine()) != null) {
         * String[] dados = linha.split(";");
         * if (id.equals(Integer.valueOf(dados[0]))) {
         * Cliente Cliente = new Cliente(
         * Integer.valueOf(dados[0]),
         * dados[1],
         * dados[2],
         * dados[3],
         * new Veiculo(dados[4], dados[5], dados[6]),
         * Integer.parseInt(dados[7]));
         * return Cliente;
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
