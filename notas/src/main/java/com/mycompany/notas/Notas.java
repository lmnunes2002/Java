/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Notas {

    public static void main(String[] args) {
        double notaUm;
        double notaDois;
        double soma, media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        notaUm = teclado.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        notaDois = teclado.nextDouble();
        
        soma = notaUm + notaDois;
        media = soma / 2;
        
        if (media >= 7.0){
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado");
        }
    }
}
