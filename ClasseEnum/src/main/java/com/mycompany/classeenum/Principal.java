/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classeenum;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios(123, "Lucas", 4000.0, Setor.VENDAS, Genero.MASCULINO, 22);
        
        System.out.println("Dados do funcionário: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Setor: " + funcionario1.getSetor().getNome());
        System.out.println("Genero; " + funcionario1.getSexo().getTexto());
        System.out.println("Genero; " + funcionario1.getSexo().getCaractere());
        System.out.println("Idade: " + funcionario1.getIdade());
    }
}