/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiormenor;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Maiormenor {

    public static void main(String[] args) {
       int a;
       int b;
       int maior;
       
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        a = teclado.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = teclado.nextInt();
        
        if (a > b){
            maior = a;
        }  else {
            maior = b;
        }
        
        System.out.println("Maior número: " + maior);
         teclado.close();
        }
    }
