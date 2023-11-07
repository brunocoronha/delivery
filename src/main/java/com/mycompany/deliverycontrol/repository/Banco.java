package com.mycompany.deliverycontrol.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mycompany.deliverycontrol.model.Cliente;
import com.mycompany.deliverycontrol.model.Entregador;
import com.mycompany.deliverycontrol.model.LoginUsuario;
import com.mycompany.deliverycontrol.model.Pedido;
import com.mycompany.deliverycontrol.model.StatusPedidoENUM;

import javax.swing.*;

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
        String senha = "Getin@dm";
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DeliveryControl", user, senha);
    }

    public void fechaConexao() throws SQLException {
        connection.close();
    }

    public boolean tentaConexao() throws SQLException {
        return connection.isClosed();
    }

    public boolean inserirUsuarioSistema(LoginUsuario loginUsuario) throws SQLException {
        String sql = "INSERT INTO login (nome_usuario, senha_usuario) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, loginUsuario.getNome_usuario());
        preparedStatement.setString(2, loginUsuario.getSenha_usuario());
        if (preparedStatement.executeUpdate() < 1) {
            return false;
        }
        return true;
    }

    public boolean removeUsuarioSistema(Integer id) throws SQLException {
        String sql = "DELETE FROM login WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("ID QUE CHEGOU NO METODO REMOVEUSUARIOSISTEMA: " + id);
        preparedStatement.setInt(1, id);
        if (preparedStatement.executeUpdate() < 1) {
            return false;
        }
        return true;
    }

    public LoginUsuario buscaUsuarioSistemaPorNome(String nome) throws SQLException {
        String sql = "SELECT * FROM login WHERE nome_usuario LIKE ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + nome + "%");
        ResultSet resultset = preparedStatement.executeQuery();
        if (resultset.next()) {
            int id = resultset.getInt("id");
            String nome_usuario = resultset.getString("nome_usuario");
            String senha_usuario = resultset.getString("senha_usuario");
            LoginUsuario usuarioBuscado = new LoginUsuario(id, nome_usuario, senha_usuario);
            System.out.println("Usuario encontrado: " + nome_usuario + " ");
            return usuarioBuscado;
        }
        return null;
    }

    public ArrayList<LoginUsuario> buscaUsuarios() throws SQLException {
        ArrayList<LoginUsuario> usuarios = new ArrayList<>();
        String sql = "SELECT nome_usuario, senha_usuario FROM login";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String nome_usuario = resultSet.getString("nome_usuario");
            String senha_usuario = resultSet.getString("senha_usuario");
            LoginUsuario usuario = new LoginUsuario(nome_usuario, senha_usuario);
            usuarios.add(usuario);
        }
        return usuarios;
    }

    public ResultSet autenticacaoUsuario(LoginUsuario novoLogin) throws SQLException {
        try {
            String sql = "SELECT * FROM login WHERE nome_usuario = ? and senha_usuario = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, novoLogin.getNome_usuario());
            preparedStatement.setString(2, novoLogin.getSenha_usuario());
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar!" + erro.getMessage());
        }
        return null;
    }

    // #region CRUD_ENTREGADOR
    public void insertEntregador(Entregador entregador) throws SQLException {
        String sql = "INSERT INTO entregador (nome, telefone) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, entregador.getNome());
        preparedStatement.setString(2, entregador.getTelefone());
        preparedStatement.executeUpdate();

    }

    public boolean removeEntregador(Integer id) throws SQLException {
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

    public Entregador buscaEntregador(Integer id) throws SQLException {
        String sql = "SELECT id, nome, telefone FROM entregador WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultset = preparedStatement.executeQuery();
        if (resultset.next()) {
            int idEntregador = resultset.getInt("id");
            String nomeEntregador = resultset.getString("nome");
            String telefoneEntregador = resultset.getString("telefone");
            Entregador entregador = new Entregador(idEntregador, nomeEntregador, telefoneEntregador);
            return entregador;
        }
        return null;
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

    // #endregion

    // #region CRUD_CLIENTE

    public void insertCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO cliente (nome, endereco, telefone) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getEndereco());
        preparedStatement.setString(3, cliente.getTelefone());
        preparedStatement.executeUpdate();
    }

    public boolean removeCliente(Integer id) throws SQLException {
        String sql = "DELETE FROM cliente WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        System.out.println(sql);
        if (preparedStatement.executeUpdate() < 1) {
            return false;
        }
        return true;
    }

    public ArrayList<Cliente> buscaClientes() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT id, nome, endereco, telefone FROM cliente";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String nome = resultSet.getString("nome");
            String endereco = resultSet.getString("endereco");
            String telefone = resultSet.getString("telefone");
            Cliente cliente = new Cliente(id, nome, endereco, telefone);
            clientes.add(cliente);
        }
        return clientes;
    }

    public Cliente buscaCliente(Integer id) throws SQLException {
        String sql = "SELECT * FROM cliente WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultset = preparedStatement.executeQuery();
        if (resultset.next()) {
            int idCliente = resultset.getInt("id");
            String nomeCliente = resultset.getString("nome");
            String enderecoCLiente = resultset.getString("endereco");
            String telefoneCliente = resultset.getString("telefone");
            return new Cliente(idCliente, nomeCliente, enderecoCLiente, telefoneCliente);
        }
        return null;
    }

    public Cliente buscaClientePorNome(String nome) throws SQLException {
        System.out.println("CHEGOU O NOME: " + nome);
        String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "%" + nome + "%");
        ResultSet resultset = preparedStatement.executeQuery();
        if (resultset.next()) {
            int idCliente = resultset.getInt("id");
            String nomeCliente = resultset.getString("nome");
            String enderecoCLiente = resultset.getString("endereco");
            String telefoneCliente = resultset.getString("telefone");
            Cliente cliente = new Cliente(idCliente, nomeCliente, enderecoCLiente, telefoneCliente);
            System.out.println(cliente.toString());
            return cliente;
        }
        return null;
    }

    public boolean updateCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE cliente SET nome = ?, endereco = ?, telefone = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, cliente.getNome());
        preparedStatement.setString(2, cliente.getEndereco());
        preparedStatement.setString(3, cliente.getTelefone());
        preparedStatement.setInt(4, cliente.getId());
        if (preparedStatement.executeUpdate() < 1) {
            return false;
        }
        return true;
    }

    // #endregion

    // #region CRUD_PEDIDO
    public void insertPedido(Pedido pedido) throws SQLException {
        System.out.println("pedido no banco " + pedido.toString());
        String sql = "INSERT INTO pedido (id_cliente, id_entregador, observacao, statusPedido) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, pedido.getId_cliente());
        preparedStatement.setInt(2, pedido.getId_entregador());
        preparedStatement.setString(3, pedido.getObservacao());
        preparedStatement.setString(4, pedido.getStatusPedido().toString());
        preparedStatement.executeUpdate();
    }

    public ArrayList<Pedido> buscaPedidos(Pedido pedido) throws SQLException {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String sql = "SELECT id, id_cliente, id_entregador, observacao, statusPedido FROM pedido";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            Integer id_cliente = resultSet.getInt("id_cliente");
            Integer id_entregador = resultSet.getInt("id_entregador");
            String observacao = resultSet.getString("observacao");
            String statusPedido = resultSet.getString("statusPedido");
            StatusPedidoENUM status = StatusPedidoENUM.valueOf(statusPedido);
            Pedido p = new Pedido(id, id_cliente, id_entregador, observacao, status);
            pedidos.add(p);
        }
        return pedidos;
    }
    // #endregion
}
