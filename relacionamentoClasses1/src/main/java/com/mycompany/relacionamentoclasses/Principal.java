/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.relacionamentoclasses;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        //Instanciando os objetos Cliente e Veiculo.
        Clientes cliente1 = new Clientes("Lucas Moreira Nunes", 22, "654654654", "Rua A", "1234-5678");
        Veiculos carro = new Veiculos("FEG-5847", "Verde", 4, 80.0, 2500, 13.2);
        
        //Exibindo dados do Cliente.
        System.out.println("Dados do Cliente: ");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("Endereço: " + cliente1.getEndereco());
        System.out.println("Telefone: " + cliente1.getTelefone());
        
        //Exibindo dados do veiculo.
        System.out.println("Dados do veiculo: ");
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Cor: " + carro.getPlaca());
        System.out.println("Numero de passageiros: " + carro.getNumeroPassageiros());
        System.out.println("Capacidade do tanque: " + carro.getCapacidadeTanque());
        System.out.println("Velocidade maxima: " + carro.getVelocidadeMaxima());
        System.out.println("Consumo medio: " + carro.getConsumoMedio());
    }
}
