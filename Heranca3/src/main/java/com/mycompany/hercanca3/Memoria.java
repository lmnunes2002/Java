/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hercanca3;

/**
 *
 * @author Aluno
 */
public class Memoria extends Especificos {
    private String capacidadeDeArmazenamento;
    private double frequencia;

    public Memoria(String capacidadeDeArmazenamento, double frequencia, String marca, String modelo) {
        super(marca, modelo);
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
        this.frequencia = frequencia;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public String getCapacidadeDeArmazenamento() {
        return capacidadeDeArmazenamento;
    }

    public void setCapacidadeDeArmazenamento(String capacidadeDeArmazenamento) {
        this.capacidadeDeArmazenamento = capacidadeDeArmazenamento;
    }
    
}
