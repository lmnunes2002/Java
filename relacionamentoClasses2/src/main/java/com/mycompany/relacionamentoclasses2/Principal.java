/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionamentoclasses2;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Enderecos endereco1 = new Enderecos("Beco da morte", 42, "Feira de Santana");
        Clientes cliente = new Clientes("Joao Paulo", 22, endereco1);
        
        System.out.println("Cliente: ");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        
        System.out.println("\nDados do endereço do cliente: ");
        System.out.println("Logradouro: " + cliente.getEndereco().getLogradouro());
        System.out.println("Número: " + cliente.getEndereco().getNumero());
        System.out.println("Cidade: " + cliente.getEndereco().getCidade());
    }
}
