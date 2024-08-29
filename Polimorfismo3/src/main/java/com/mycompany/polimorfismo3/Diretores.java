/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo3;

import javax.xml.transform.Source;

/**
 *
 * @author Aluno
 */
public class Diretores extends Funcionarios implements Contratacao{
    private double PREMIO = salarioBase * 0.2;

    public Diretores(String nome, String dataNascimento, Sexo sexo, double salarioBase) {
        super(nome, dataNascimento, sexo, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }
    
    public double getSalarioFinal(){
        return salarioBase;
    }
    
    public double getPremio(){
        return PREMIO;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nPrêmio: " + PREMIO;
    }

    @Override
    public void admitir(Funcionarios funcionarios) {
        System.out.println("Parabéns! você foi admitido.");
    }

    @Override
    public void demitir(Funcionarios funcionarios) {
        System.out.println("Infelizmente. você foi demitido.");
    }
    
}
