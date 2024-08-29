/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo1;

/**
 *
 * @author Aluno
 */
public class Patos implements Animal{

    @Override
    public String emitirSom() {
        return "Quack Quack";
    }

    @Override
    public String comer() {
        return "Nhom Nhom";
    }
    
}
