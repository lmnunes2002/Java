/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.metodosstring;

/**
 *
 * @author Aluno
 */
public class MetodosString {

    public static void main(String[] args) {
        //Declaração de variáveis.
        String nome = "Lucas";
        String sobrenome = "Nunes";
        
        //Exibindo quantidade de caracteres.
        System.out.println("Tamanho do nome: " +nome.length());
        System.out.println("Tamanho do sobrenome: " +sobrenome.length());
        
        //Concatenando nome e sobrenome.
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        //Exibindo nome completo usando métodos Strings - Maiúsculas.
        System.out.println("Concatenação maiúscula: " +nomeCompleto.toUpperCase());
        
        //Exibindo nome completo usando metódos Strings - Minúsculas.
        System.out.println("Concatenação minúscula: " +nomeCompleto.toLowerCase());
    }
}
