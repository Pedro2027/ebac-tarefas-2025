package br.com.ph.list;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
@author Pedro Henrique Araujo
11/03/2025 
*/
public class ExemploLinkedList {

    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdenada();

    }

    private static void exemploListaSimples() {
        System.out.println("Exemplo Lista Simples");
        List<String> lista = new LinkedList<>();
        lista.add("Pedro Henrique");
        lista.add("Thaina Bradesco");
        lista.add("Gustavo Bradesco");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenada() {
        System.out.println("Exemplo Lista Simples Ordenada");
        List<String> lista = new LinkedList<>();
        lista.add("Pedro Henrique");
        lista.add("Thaina Bradesco");
        lista.add("Gustavo Bradesco");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
