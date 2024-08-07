/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classes;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //Puxando classe Clientes.
        Clientes cliente = new Clientes();
        
        //cliente.nome = "Lucas";
        cliente.setNome("Lucas");
        //cliente.idade = 22;
        cliente.setIdade(22);
        
        //Exibindo resultados.
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Idade do cliente: " + cliente.getIdade());
    }
}