/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml2;

/**
 *
 * @author Aluno
 */
public class Medicos extends Funcionarios {
    private String CRM;

    public Medicos(String CRM, String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, salario);
        this.CRM = CRM;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    @Override
    public String toString() {
        return "\nDados do medico: "+  
               super.toString() +
               "\nCRM: " + CRM;
    }
    
}
