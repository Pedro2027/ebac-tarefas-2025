package br.com.ph.factory;


import br.com.ph.models.*;

/*
@author Pedro Henrique Araujo
19/05/2025 
*/
public class FordFactory implements CarFactory{
    @Override
    public SUV criarSUV() {
        return new SUVFord();
    }

    @Override
    public Sedan criarSedan() {
        return new SedanFord();
    }
}
