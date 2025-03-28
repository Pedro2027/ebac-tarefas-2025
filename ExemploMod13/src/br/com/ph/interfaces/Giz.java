package br.com.ph.interfaces;


/*
@author Pedro Henrique Araujo
27/03/2025 
*/
public class Giz implements ICaneta {
    @Override
    public void escrever(String texto) {
        System.out.println("Escrevendo o valor" + texto + " na classe " + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
