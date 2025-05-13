package br.com.ph.builder;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class CheeseBurgerBuilder extends BurgerBuilder {
    @Override
    public void buildBun() {
        burger.setBun("Brioche");


    }

    @Override
    public void buildMeat() {
        burger.setMeat("Carne");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Cheddar");

    }

    @Override
    public void buildSalad() {
        burger.setSalad("Alface");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Maionese");

    }
}
