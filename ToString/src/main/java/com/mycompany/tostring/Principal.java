/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tostring;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Funcionarios funcionario1 = new Funcionarios(123, "Lucas", "123-456-890-10", "1234567", "1234", "26/06/02", Sexo.MASCULINO, Setor.ENGENHARIA, 4000, "1234-5678", "lucas@email",
                                    new Enderecos("Rua A", "129", "N/A", "123456", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println("Informações do usuário: \n");
        
        /*System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Sexo: " + funcionario1.getSexo().getCaractere());
        System.out.println("Estado: " + funcionario1.getEndereco().getUf());*/
        
        System.out.println(funcionario1.toString());
        }
}
