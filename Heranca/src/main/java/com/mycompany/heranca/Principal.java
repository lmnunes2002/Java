/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("26/06/2024","Cartão de crédito", "Lucas", 22);
        Funcionarios funcionario1 = new Funcionarios("46546", "Analista de dados", 4000.0, "Lucas", 22);
        
        System.out.println("\nDados do cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Data de compra: " + cliente1.getDataDeCompra());
        System.out.println("Forma de pagamento: " + cliente1.getFormaDePagamento());
        
        System.out.println("\nDados do funcionário: ");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Matrícula: " + funcionario1.getMatricula());
    }
}
