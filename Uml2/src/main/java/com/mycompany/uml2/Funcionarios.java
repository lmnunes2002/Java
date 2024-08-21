/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml2;

/**
 *
 * @author Aluno
 */
public abstract class Funcionarios {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected double salario;

    public Funcionarios(String nome, String cpf, String rg, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome + 
               "\nCPF: " + cpf + 
               "\nRG: " + rg + 
               "\nSalario: " + salario;
    }
    
    
}
