/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml3;

/**
 *
 * @author Aluno
 */
public class Fisicas extends Pessoas {
    private Sexo sexo;
    private String dataNascimento;

    public Fisicas(Sexo sexo, String dataNascimento, String nome, String telefone, String email, Enderecos endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "\n\nPessoa Física: " +
               "\nSexo: " + sexo.getTexto() + 
               "\nData de nascimento: " + dataNascimento;
    }
}
