package br.com.ph.factory;


import br.com.ph.models.SUV;
import br.com.ph.models.SUVGm;
import br.com.ph.models.Sedan;
import br.com.ph.models.SedanGm;

/*
@author Pedro Henrique Araujo
19/05/2025 
*/
public class ChevroletFactory implements CarFactory{
    @Override
    public SUV criarSUV() {
        return new SUVGm();
    }

    @Override
    public Sedan criarSedan() {
        return new SedanGm();
    }
}
