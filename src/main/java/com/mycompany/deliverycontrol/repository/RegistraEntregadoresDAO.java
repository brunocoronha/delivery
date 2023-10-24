/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deliverycontrol.repository;

import com.mycompany.deliverycontrol.CRUD.IRegistraEntregadoresCRUD;
import com.mycompany.deliverycontrol.model.Entregador;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author brunocoronha.adm
 */
public class RegistraEntregadoresDAO implements IRegistraEntregadoresCRUD {

    Banco banco = Banco.getInstance();

    /*     
    private String nomeDoArquivo = null;

    public RegistraEntregadoresDAO() {
        nomeDoArquivo = System.getenv("USERPROFILE") + File.separator + "Documents" + File.separator
                + "dadosDelivey\\entregadoresBD.txt";
    } 
    */

    @Override
    public void incluir(Entregador entregador) {
        try {            
            if (banco.tentaConexao()) {
                banco.conexao();
                System.out.println("conectado");
                banco.insertEntregador(entregador);
                banco.fechaConexao();
            } else {
                JOptionPane.showMessageDialog(null, "banco de dados indisponivel");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void alterar(Entregador entregador) throws Exception {        
        try{
            if(banco.tentaConexao()){
                banco.conexao();
                banco.updateEntregador(entregador);
                banco.fechaConexao();
            } else {
                JOptionPane.showMessageDialog(null, "banco de dados indisponivel");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }       

    }

    @Override
    public ArrayList<Entregador> listagemDeEntregador() throws Exception {
        try {
            if(banco.tentaConexao()){
                banco.conexao();
                ArrayList<Entregador> listaEntregadores = null;
                System.out.println("conectado listagem");
                banco.conexao();
                listaEntregadores = banco.buscaEntregadores();
                banco.fechaConexao();
                return listaEntregadores;
            }else {
                JOptionPane.showMessageDialog(null, "banco de dados indisponivel");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Entregador consultar(Integer id) throws Exception {
        try {
            if(banco.tentaConexao()){            
                banco.conexao();
                System.out.println("consulta direta " + banco.buscaEntregador(17));
                Entregador entregador = null;
                System.out.println("conectado consulta");
                entregador = banco.buscaEntregador(id);
                banco.fechaConexao();
                return entregador;
            }else {
                JOptionPane.showMessageDialog(null, "banco de dados indisponivel");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deletar(Integer id) throws Exception {
        try{
            if(banco.tentaConexao()){
                banco.conexao();
                boolean removeu = banco.removeEntregador(id);
                banco.fechaConexao();
                return removeu;
            }else {
                JOptionPane.showMessageDialog(null, "banco de dados indisponivel");
            }            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}
