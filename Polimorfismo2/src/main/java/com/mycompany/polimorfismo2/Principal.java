/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo2;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Somas soma = new Somas();
        Subtracoes subtracao = new Subtracoes();
        Divisoes divisao = new Divisoes();
        Multiplicacoes multiplicacao = new Multiplicacoes();
        
        System.out.println("Resultados de 8 e 4: ");
        System.out.println("Soma: " + soma.calcular(8, 4));
        System.out.println("Subtração: " + subtracao.calcular(8, 4));
        System.out.println("Divisão: " + divisao.calcular(8, 4));
        System.out.println("Multiplicação: " + multiplicacao.calcular(8, 4));
    }
}
