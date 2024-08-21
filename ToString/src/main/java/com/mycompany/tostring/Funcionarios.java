/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tostring;

/**
 *
 * @author Aluno
 */
public class Funcionarios{
   private int id;
   private String nome;
   private String cpf;
   private String rg;
   private String matricula;
   private String dataNascimento;
   private Sexo sexo;
   private Setor setor;
   private double salario;
   private String telefone;
   private String email;
   private Enderecos endereco;

    public Funcionarios(int id, String nome, String cpf, String rg, String matricula, String dataNascimento, Sexo sexo, Setor setor, double salario, String telefone, String email, Enderecos endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enderecos getEndereco() {
        return endereco;
    }

    public void setEndereco(Enderecos endereco) {
        this.endereco = endereco;
    }
   
     @Override
    public String toString() {
        return "Dados do funcionário:" +
                "\nId: " + id + 
                "\nNome: " + nome + 
                "\nCpf: " + cpf + 
                "\nRg: " + rg + 
                "\nMatricula: " + matricula + 
                "\nData de nascimento: " + dataNascimento + 
                "\nSexo: " + sexo.getTexto() + 
                "\nSetor: " + setor.getTexto() + 
                "\nSalario: " + salario + 
                "\nTelefone: " + telefone + 
                "\nEmail: " + email + 
                "\n\nEndereco: " + endereco;
    }
    
}
