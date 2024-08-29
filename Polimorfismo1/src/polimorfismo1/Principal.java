/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo1;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cachorros cachorro = new Cachorros();
        Gatos gato = new Gatos();
        Galos galo = new Galos();
        Patos pato = new Patos();
        
        System.out.println("Cachorro: ");
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.comer());
        
        System.out.println("\nGato: ");
        System.out.println(gato.emitirSom());
        System.out.println(gato.comer());
        
        System.out.println("\nGalo: ");
        System.out.println(galo.emitirSom());
        System.out.println(galo.comer());
        
        System.out.println("\nPato: ");
        System.out.println(pato.emitirSom());
        System.out.println(pato.comer());
    }
    
}
