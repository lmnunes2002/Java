/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo3;

/**
 *
 * @author Aluno
 */
public abstract class Funcionarios {
    protected String nome;
    protected String dataNascimento;
    protected Sexo sexo;
    protected double salarioBase;

    public Funcionarios(String nome, String dataNascimento, Sexo sexo, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public abstract double getSalarioFinal();

    @Override
    public String toString() {
        return "\nFuncionario: " + 
               "\nNome: " + nome + 
               "\nData de nascimento: " + dataNascimento + 
               "\nSexo: " + sexo.getTexto() + 
               "\nSalário base: " + salarioBase;
    }
   
}
