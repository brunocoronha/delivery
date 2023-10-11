/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deliverycontrol;

import com.mycompany.deliverycontrol.view.JanelaPrincipal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author brunocoronha.adm
 */
public class DeliveryControl {

    public static void main(String[] args) {
        JanelaPrincipal janela = new JanelaPrincipal();
        janela.setVisible(true);
        
        String url = "jdbc:mysql://localhost:3306/exercicio10";
        String usuario = "root";
        String senha = "Getin@dm";

        Connection conexao = null;

        try {
            // Carregar a classe do driver MySQL (isso não é necessário em versões recentes do MySQL Connector/J)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão com o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);

            if (conexao != null) {
                System.out.println("Conexão com o banco de dados estabelecida!");
                // Você pode executar consultas SQL aqui
            }

        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Classe do driver não encontrada: " + e.getMessage());
        } finally {
            try {
                if (conexao != null) {
                    conexao.close(); // Fechar a conexão quando você terminar de usá-la
                }
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão: " + e.getMessage());
            }
        }
    }
}
