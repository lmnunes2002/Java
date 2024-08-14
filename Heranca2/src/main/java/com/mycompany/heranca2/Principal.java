/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca2;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Processadores processador1 = new Processadores(48, "Intel", "dual-core i7");
        Memorias memoria1 = new Memorias(16.0, "Intel", "dual-core i7");
        
        System.out.println("Dados do processador: ");
        System.out.println("Marca: " + processador1.getMarca());
        System.out.println("Modelo: " + processador1.getModelo());
        System.out.println("Frequência: " + processador1.getFrequencia() + " Ghz");
        
        System.out.println("\nDados da memória: ");
        System.out.println("Marca: " + memoria1.getMarca());
        System.out.println("Modelo: " + memoria1.getModelo());
        System.out.println("Capacidade de armazenamento: " + memoria1.getCapacidadeDeArmazenamento()+ " Gb");
    }
}
