/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.deliverycontrol.CRUD;

import com.mycompany.deliverycontrol.model.Entregador;
import java.util.ArrayList;

/**
 *
 * @author brunocoronha.adm
 */


public interface IRegistraEntregadoresCRUD {
     /**
     * Este metodo recebe um objeto do tipo entregador e o insere na BD
     * @param entregador novo entregador que vai ser cadastrado no sistema
     */
    public void incluir(Entregador entregador) throws Exception;
    /**
     * Este metodo recebe um entregador e busca este na lista de entregadores cadastrados
     * caso o encontre ele sera alterado
     * @param entregador Objeto do tipo entregador que será buscado na lista
     * @throws Exception
     */
    public void alterar(Entregador entregador) throws Exception;

    /**
     * Este Método retorna uma lista com todos entregadores cadastrados
     * @return List de Entregadores
     * @throws Exception
     */
    public ArrayList<Entregador> listagemDeEntregador()  throws Exception;

    /**
     * Este método busca um entregador baseado em um ID recebido como parâmetro
     * @param id
     * @return
     * @throws Exception
     */
    public Entregador consultar(Integer id) throws Exception;

    public boolean deletar(Integer id) throws Exception;
}
