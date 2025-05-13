package br.com.ph.builder;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public abstract class BurgerBuilder {

    Burger burger = new Burger();

    abstract void buildBun();
    abstract void buildMeat();
    abstract void buildCheese();
    abstract void buildSalad();
    abstract void buildSauce();

    Burger build(){
        return burger;
    }
}
