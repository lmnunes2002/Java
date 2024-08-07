/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livro;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Livros livroUm = new Livros("Maquiável", "O príncipe", 120, 42.5);
        Livros livroDois = new Livros("Pablo Marçal", "Primo rico e primo pobre", 200, 150.75);
        
        System.out.println("Titulo: " + livroUm.getTitulo());
        System.out.println("Titulo: " + livroDois.getTitulo());
        System.out.println("Autor: " + livroUm.getAutor());
        System.out.println("Autor: " + livroDois.getAutor());
        System.out.println("Páginas: " + livroUm.getNumeroDePaginas());
        System.out.println("Páginas: " + livroDois.getNumeroDePaginas());
        System.out.println("Páginas: " + livroUm.getPreco());
        System.out.println("Páginas: " + livroDois.getPreco());
    }
}
