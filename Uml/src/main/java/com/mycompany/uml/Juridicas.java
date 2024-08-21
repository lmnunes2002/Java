/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml;

/**
 *
 * @author Aluno
 */
public class Juridicas extends Pessoas {
    private String cnpj;
    private String inscricaoEstadual;

    public Juridicas(String cnpj, String inscricaoEstadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Pessoa juridica:" + 
               "\nNome: " + super.getNome() +
               "\nTelefone: " + super.getTelefone() +
               "\nCNPJ: " + cnpj + 
               "\nInscricao estadual: " + inscricaoEstadual;
    }
    
}
