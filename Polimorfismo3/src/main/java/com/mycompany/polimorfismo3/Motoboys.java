/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismo3;

/**
 *
 * @author Aluno
 */
public class Motoboys extends Funcionarios {
    private  String carteiraDeHabilitacao;

    public Motoboys(String carteiraDeHabilitacao, String nome, String dataNascimento, Sexo sexo, double salarioBase) {
        super(nome, dataNascimento, sexo, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    public double getSalarioFinal(){
        return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nCarteira de habilitação: " + carteiraDeHabilitacao;
    }
    
}
