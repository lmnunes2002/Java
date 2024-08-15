/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.classeenum;

/**
 *
 * @author Aluno
 */
public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recusos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
}
