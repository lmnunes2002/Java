/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uml4;

/**
 *
 * @author Aluno
 */
public class Clientes extends Fisicas {
    private String protocoloAtendimento;

    public Clientes(String protocoloAtendimento, Sexo sexo, EstadoCivil estadoCivil, String dataNascimento, String nome, String telefone, String email, Enderecos endereco) {
        super(sexo, estadoCivil, dataNascimento, nome, telefone, email, endereco);
        this.protocoloAtendimento = protocoloAtendimento;
    }

    public String getProtocoloAtendimento() {
        return protocoloAtendimento;
    }

    public void setProtocoloAtendimento(String protocoloAtendimento) {
        this.protocoloAtendimento = protocoloAtendimento;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\n\nCliente: " + 
               "\nProtocolo de atendimento: " + protocoloAtendimento;
    }

    
    
}
