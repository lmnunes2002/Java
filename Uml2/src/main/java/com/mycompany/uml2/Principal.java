/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uml2;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Motoboys funcionario1 = new Motoboys("643215", "José", "1341583", "134657", 4000);
        Engenheiros funcionario2 = new Engenheiros("1324651", "Marcos", "1216513", "121651", 10000);
        Medicos funcionario3 = new Medicos("6532135", "Antonio", "145876", "124564", 15000);
        
        System.out.println(funcionario1.toString());
        System.out.println(funcionario2.toString());
        System.out.println(funcionario3.toString());
    }
}
