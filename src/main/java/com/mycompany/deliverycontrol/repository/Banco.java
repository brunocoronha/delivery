package com.mycompany.deliverycontrol.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Banco {
    Connection connection;

    public void criaConexao() throws SQLException{
            String user = "root";
            String senha = "123456789";
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DeliveryControl", user, senha);
            String sql = "INSERT INTO sua_tabela (coluna1, coluna2, coluna3) VALUES (?, ?, ?)";

            // Crie um PreparedStatement com a consulta SQL
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            // Substitua os valores das colunas pelos valores reais que você deseja inserir
            preparedStatement.setString(1, "valor_coluna1");
            preparedStatement.setInt(2, 123);
            preparedStatement.setString(3, "valor_coluna3");

            // Execute o INSERT
            preparedStatement.executeUpdate();

            
            System.out.println("Inserção bem-sucedida.");


    }

    public void fechaConexao() throws SQLException {
        connection.close();
    }

}
