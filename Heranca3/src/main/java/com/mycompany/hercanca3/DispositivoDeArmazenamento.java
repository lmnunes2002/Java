/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hercanca3;

/**
 *
 * @author Aluno
 */
public class DispositivoDeArmazenamento extends Especificos {
    private String tipoDeConexao;

    public DispositivoDeArmazenamento(String tipoDeConexao, String marca, String modelo) {
        super(marca, modelo);
        this.tipoDeConexao = tipoDeConexao;
    }

    public String getTipoDeConexao() {
        return tipoDeConexao;
    }

    public void setTipoDeConexao(String tipoDeConexao) {
        this.tipoDeConexao = tipoDeConexao;
    }
    
}
