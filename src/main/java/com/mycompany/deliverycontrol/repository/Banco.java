package com.mycompany.deliverycontrol.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mycompany.deliverycontrol.model.Entregador;

public class Banco {

    private Banco() {

    }
    private static Connection connection;

    private static Banco banco;

    public static Banco getInstance(){
        if(banco == null){
            banco = new Banco();
        }
        return banco;
    }

    public void conexao() throws SQLException {
        String user = "root";
        String senha = "123456789";
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DeliveryControl", user, senha);      
    }

    public boolean estaConectado() throws SQLException{
        if(connection.isClosed()){
            return false;
        }else{
            return true;
        }
    }

    public void fechaConexao() throws SQLException {
        connection.close();
    }

    public void insertEntregador(Entregador entregador) throws SQLException {


        String sql = "INSERT INTO entregador (placa_veiculo, nome, telefone, cpf, quantidadeEntregas) VALUES (?, ?, ?, ?, ?)";


        // Crie um PreparedStatement com a consulta SQL
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        // Substitua os valores das colunas pelos valores reais que você deseja inserir
        preparedStatement.setString(1, entregador.getVeiculo().getPlaca());
        preparedStatement.setString(2, entregador.getNome());
        preparedStatement.setString(3, entregador.getTelefone());
        preparedStatement.setString(4, entregador.getCpf());
        preparedStatement.setInt(5, entregador.getQntEntregas());

        // Execute o INSERT
        preparedStatement.executeUpdate();
        fechaConexao();
    }

}
