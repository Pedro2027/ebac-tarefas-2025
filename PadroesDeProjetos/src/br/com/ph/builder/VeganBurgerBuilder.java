package br.com.ph.builder;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class VeganBurgerBuilder extends BurgerBuilder {
    @Override
    public void buildBun() {
        burger.setBun("Pão de milho");


    }

    @Override
    public void buildMeat() {
        burger.setMeat("Carne de ervilha");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Queijo de Papel");

    }

    @Override
    public void buildSalad() {
        burger.setSalad("Alface");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Creme de milho");

    }
}
