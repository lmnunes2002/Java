/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hercanca3;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Processador processador1 = new Processador(2.4, "Intel", "i7");
        PlacaMae placamae1 = new PlacaMae("LGA1150", "AMD", "am4");
        Memoria memoria1 = new Memoria("8 Gb", 2.4, "Kingston", "DDR4");
        DispositivoDeArmazenamento hd1 = new DispositivoDeArmazenamento("SATA", "Seagate", "Barracuda");
    }
}
