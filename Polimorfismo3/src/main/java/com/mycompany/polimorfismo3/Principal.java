/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo3;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Motoboys funcionario1 = new Motoboys("1234-5678", "João", "08/09/2000", Sexo.MASCULINO, 4000);
        Motoboys funcionario2 = new Motoboys("5678-1234", "Gabriel", "09/10/2001", Sexo.MASCULINO, 3500);
        Diretores diretor = new Diretores("Pedro", "06/07/2000", Sexo.MASCULINO, 6000);
        
        System.out.println(funcionario1.toString());
        diretor.demitir(funcionario1);
        
        System.out.println(funcionario2.toString());
        diretor.admitir(funcionario2);
        
        System.out.println(diretor.toString());
    }
}
