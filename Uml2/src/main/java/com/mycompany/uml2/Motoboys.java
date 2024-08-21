/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml2;

/**
 *
 * @author Aluno
 */
public class Motoboys extends Funcionarios {
    private String cnh;

    public Motoboys(String cnh, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return "\nDados do motoboy: " +
               super.toString() +
               "\nCNH: " + cnh;
    }
    
    
}
