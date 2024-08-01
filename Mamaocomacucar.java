/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mamaocomacucar;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Mamaocomacucar {

    public static void main(String[] args) {
        //Criando o scanner.
        Scanner teclado = new Scanner(System.in);
        
        //Declaração de variáveis.
        Double preco, parcela;
        String  mercado = "Mamão com açucar";
        
        //Entrada de dados.
        System.out.println("Digite o valor: ");
        
        //Processamento de dados.
        preco = teclado.nextDouble();
        parcela = preco / 5;
        
        //Exibindo resultados.
        System.out.println("Mercado: "+ mercado) ;
        System.out.println("Parcela: " + parcela);
    }
}
