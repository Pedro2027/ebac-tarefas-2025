package br.com.ph.models;


/*
@author Pedro Henrique Araujo
19/05/2025 
*/
public class SUVFord implements SUV{

    @Override
    public void exibirInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Modelo: Terrytory " +  " Ano 2025";
    }
}
