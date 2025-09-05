package br.com.ph.observer;


/*
@author Pedro Henrique Araujo
03/07/2025 
*/
public class Demo{

    public static void main (String args[]){

    Jornalista jor = new Jornalista();
    jor.add(new TV());
    jor.notifyall("Teste");

    }
}
