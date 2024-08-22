/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uml4;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Rápido", Sexo.FEMININO, EstadoCivil.SOLTEIRO, "20/08/2002", "Laura", "1234-5678", "Laura@email.com",
                            new Enderecos("Rua B", "123", "lado do posto", "1234567", "Lauro de Freitas", UnidadeFederativa.BAHIA));
        
        PrestacaoServicos prestacao1 = new PrestacaoServicos("01/01/2024", "31/12/2024", "1234567", "12345", "Soluções tecnologia", "1234-5678", "tecnologias@gmail.",
                                       new Enderecos("Rua A", "321", "lado da estação", "123-456", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(cliente1.toString());
        System.out.println(prestacao1.toString());
    }
}
