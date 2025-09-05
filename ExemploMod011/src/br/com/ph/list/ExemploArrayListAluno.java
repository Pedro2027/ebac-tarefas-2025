package br.com.ph.list;

import br.com.ph.domain.Aluno;
import br.com.ph.domain.ComparaNotaAluno;


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
@author Pedro Henrique Araujo
11/03/2025 
*/
public class ExemploArrayListAluno {
    public static void main(String[] args) {

        exemploListaSimplesOrdenadaClassesExterna();
        exemploListaSimplesOrdenadaComparatorAluno();

    }
    private static void exemploListaSimplesOrdenadaClassesExterna(){
        System.out.println("*** Lista de Simples Ordenada Classes***");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Pedro Henrique", "Java", 0);
        Aluno b = new Aluno("Thaina Bradesco", "Finanças", 0);
        Aluno c = new Aluno("Gustavo","Mecanico", 0);

        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");


    }
    private static void exemploListaSimplesOrdenadaComparatorAluno(){
        System.out.println("*** Lista de Simples Ordenada Comparator***");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("Pedro Henrique", "Java", 20);
        Aluno b = new Aluno("Thaina Segura", "Finanças", 10);
        Aluno c = new Aluno("Gustavo", "Mecanico", 15);

        lista.add(a);
        lista.add(b);
        lista.add(c);

        System.out.println("Lista sem ordenação" + lista);
        //Collections.sort(lista);
        System.out.println("Lista com ordenação" + lista);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(lista, comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" + lista);

        System.out.println("");

    }
}
