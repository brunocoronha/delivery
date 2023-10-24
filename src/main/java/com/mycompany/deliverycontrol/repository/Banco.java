package com.mycompany.deliverycontrol.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    //#region CRUD_ENTREGADOR
    public void insertEntregador(Entregador entregador) throws SQLException {
        System.out.println(entregador.toString());
        String sql = "INSERT INTO entregador (nome, telefone) VALUES (?, ?)";        
        PreparedStatement preparedStatement = connection.prepareStatement(sql);        
        preparedStatement.setString(1, entregador.getNome());
        preparedStatement.setString(2, entregador.getTelefone());        
        preparedStatement.executeUpdate();
        
    }

    public boolean removeEntregador(Integer id) throws SQLException {
        System.out.println("entrou no método removeEntregador");
        String sql = "DELETE FROM entregador WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        System.out.println(sql);
        if (preparedStatement.executeUpdate() < 1) {
            return false;
        }
        return true;
    }

    public ArrayList<Entregador> buscaEntregadores() throws SQLException {
        ArrayList<Entregador> entregadores = new ArrayList<>();
        String sql = "SELECT id, nome, telefone FROM entregador";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String telefone = resultSet.getString("telefone");
            Entregador entregador = new Entregador(id, nome, telefone);
            entregadores.add(entregador);
        }
        return entregadores;
    }

    public boolean updateEntregador(Entregador entregador) throws SQLException {
        String sql = "UPDATE entregador SET nome = ?, telefone = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, entregador.getNome());
        preparedStatement.setString(2, entregador.getTelefone());
        preparedStatement.setInt(3, entregador.getId());
        if (preparedStatement.executeUpdate() < 1) {
            return false;
        }
        return true;
    }

    public Entregador buscaEntregador(Integer id) throws SQLException {
        String sql = "SELECT * FROM entregador WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultset = preparedStatement.executeQuery();
        int idEntregador = resultset.getInt("id");
        String nomeEntregador = resultset.getString("nome");
        String telefoneEntregador = resultset.getString("telefone");
        return new Entregador(idEntregador, nomeEntregador, telefoneEntregador);
    }

    public void insertCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, endereco, telefone) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getEndereco());
        preparedStatement.setString(3, cliente.getTelefone());
        preparedStatement.executeUpdate();
    }
    //#endregion

}
