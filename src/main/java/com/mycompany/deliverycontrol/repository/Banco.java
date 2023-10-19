package com.mycompany.deliverycontrol.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import com.mycompany.deliverycontrol.model.Cliente;
import com.mycompany.deliverycontrol.model.Entregador;

public class Banco {

    private Banco() {

    }

    private static Connection connection;

    private static Banco banco;

    public static Banco getInstance() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }

    public void conexao() throws SQLException {
        String user = "root";
        String senha = "123456789";
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DeliveryControl", user, senha);
    }

    public boolean estaConectado() throws SQLException {
        if (connection.isClosed()) {
            return false;
        } else {
            return true;
        }
    }

    public void fechaConexao() throws SQLException {
        connection.close();
    }

    public void insertEntregador(Entregador entregador) throws SQLException {
        System.out.println(entregador.toString());
        String sql = "INSERT INTO entregador (nome, telefone, cpf) VALUES (?, ?, ?)";
        // Crie um PreparedStatement com a consulta SQL
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // Substitua os valores das colunas pelos valores reais que você deseja inserir
        preparedStatement.setString(1, entregador.getNome());
        preparedStatement.setString(2, entregador.getTelefone());
        preparedStatement.setString(3, entregador.getCpf());
        // Execute o INSERT
        preparedStatement.executeUpdate();
        // fechaConexao();
    }

    public void removeEntregador(Integer id) throws SQLException {
        System.out.println("entrou no método removeEntregador");
        String sql = "DELETE FROM entregador WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        System.out.println(sql);
        preparedStatement.executeUpdate();
    }

    /*
     * public void insertVeiculo(Veiculo veiculo) throws SQLException {
     * String sql = "INSERT INTO veiculo (placa, modelo, cor) VALUES (?, ?, ?)";
     * // Crie um PreparedStatement com a consulta SQL
     * PreparedStatement preparedStatement = connection.prepareStatement(sql);
     * // Substitua os valores das colunas pelos valores reais que você deseja
     * inserir
     * preparedStatement.setString(1, veiculo.getPlaca());
     * preparedStatement.setString(2, veiculo.getModelo());
     * preparedStatement.setString(3, veiculo.getCor());
     * // Execute o INSERT
     * preparedStatement.executeUpdate();
     * //fechaConexao();
     * }
     */

    public void insertCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, endereco, telefone) VALUES (?, ?, ?)";
        // Crie um PreparedStatement com a consulta SQL
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // Substitua os valores das colunas pelos valores reais que você deseja inserir
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getEndereco());
        preparedStatement.setString(3, cliente.getTelefone());
        // Execute o INSERT
        preparedStatement.executeUpdate();
        // fechaConexao();
    }

}
