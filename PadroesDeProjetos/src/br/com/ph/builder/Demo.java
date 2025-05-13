package br.com.ph.builder;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class Demo {

    public static void main(String args[]){

        Gerente gerente = new Gerente();

        //Utilizando o mesmo gerente para criação de cada tipo de hamburguer
        gerente.setBuilder(new VeganBurgerBuilder());
        Burger burger = gerente.buildBurger();
        burger.print();

        //Gerente gerente1 = new Gerente (new VeganBurgerBuilder());
        gerente.setBuilder(new CheeseBurgerBuilder());
        Burger burger1 = gerente.buildBurger();
        burger1.print();

    }
}
