/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.comparacaotipos;

/**
 *
 * @author Aluno
 */
public class ComparacaoTipos {

    public static void main(String[] args) {
        //Declaração de variáveis.
        String nomeUsuario = "Lucas";
        int senha = 123;
        
        //Comparação de Strings e inteiros.
        boolean resultadoNome = nomeUsuario.equals("Lucas");
        boolean resultadoSenha = (senha == 456);
        
        //Exibindo resultados.
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
