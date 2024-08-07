/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.funcionario;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //Puxando classe Funcionarios.
       Funcionarios funcionario = new Funcionarios();
       
       //Setando atributos.
       funcionario.setNome("Lucas");
       funcionario.setIdade(22);
       funcionario.setSalario(4000);
       
       //Exibindo resultados com o get.
       System.out.println("Nome do funcionário: " + funcionario.getNome());
       System.out.println("Idade do funcionário: " + funcionario.getIdade());
       System.out.println("Salário do funcionário: " + funcionario.getSalario());
    }
}
