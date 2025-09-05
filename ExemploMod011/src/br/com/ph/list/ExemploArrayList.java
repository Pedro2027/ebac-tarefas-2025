package br.com.ph.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemCrescente();
        exemploNumeros();
    }

    private static void exemploListaSimples(){
        System.out.println("*** Lista de Simples ***");
        List<String> lista = new ArrayList<>();
        lista.add("Pedro Henrique Araujo");
        lista.add("Thaina Zamperlim Segura");
        lista.add("Juanito Henrique Araujo");
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploListaSimplesOrdemCrescente(){
        System.out.println("*** Lista de Simples Ordem Crescente ***");
        List<String> lista = new ArrayList<>();
        lista.add("Pedro Henrique Araujo");
        lista.add("Thaina Zamperlim Segura");
        lista.add("Juanito Henrique Araujo");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }

    private static void exemploNumeros(){
        System.out.println("*** Lista de Numeros ***");
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(1);
        lista.add(5);
        lista.add(2);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");

    }
}