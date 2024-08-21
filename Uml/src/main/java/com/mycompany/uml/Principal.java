/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uml;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Juridicas pessoaJuridica = new Juridicas("00014545-456", "1353", "Lucas tecnologia Ltda.", "1234-5678");
        Fisicas pessoaFisica = new Fisicas("132165", "5466", "26/06/2002", "Lucas", "1234-5678");
        
        System.out.println(pessoaJuridica.toString());
        System.out.println(pessoaFisica.toString());
    }
}
