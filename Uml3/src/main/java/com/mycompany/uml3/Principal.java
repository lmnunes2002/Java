/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uml3;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Fisicas fisica1 = new Fisicas(Sexo.FEMININO, "25/06/2002", "Leticia", "1234-5678", "Leticia@email.com",
                          new Enderecos("Rua C", "13", "do lado do ponto", "12345", "Brumado", UnidadeFederativa.BAHIA));
        
        Juridicas juridica1 = new Juridicas("12345678", "1234", "Vigitech", "8765-4321", "Vigitech@email.com",
                              new Enderecos("Rua C", "27", "frente da padaria", "12345", "Brumado", UnidadeFederativa.BAHIA));
        
        System.out.println(fisica1.toString());
        System.out.println(juridica1.toString());
    }
}
