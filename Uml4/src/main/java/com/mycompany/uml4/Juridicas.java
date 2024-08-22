/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml4;

/**
 *
 * @author Aluno
 */
public abstract class Juridicas extends Pessoas{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridicas(String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Enderecos endereco) {
        super(nome, telefone, email, endereco);
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
        return super.toString() +
               "\n\nPessoa Jurídica: " +
               "\nCNPJ: " + cnpj + 
               "\nInscricao estadual: " + inscricaoEstadual;
    }
    
}
