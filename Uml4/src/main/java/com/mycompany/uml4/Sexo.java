/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.uml4;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");
    
    private char caractere;
    private String texto;

    private Sexo(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getTexto() {
        return texto;
    }
    
}
