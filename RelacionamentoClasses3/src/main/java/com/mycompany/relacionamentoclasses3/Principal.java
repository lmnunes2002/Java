/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionamentoclasses3;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //Instanciando os objetos.
        Pets animal = new Pets("Todd", 7, "Shi-Tzu");
        Clientes cliente1 = new Clientes("Lucas Moreira Nunes", 22, animal);
        
        System.out.println("Dados do cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        
        System.out.println("\nDados do pet: ");
        System.out.println("Nome; " + cliente1.getPet().getNome());
        System.out.println("Idade: " + cliente1.getPet().getIdade());
        System.out.println("Raça: " + cliente1.getPet().getRaca());
    }
}
