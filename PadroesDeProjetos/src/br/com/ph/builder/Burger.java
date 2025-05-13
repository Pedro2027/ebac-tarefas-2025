package br.com.ph.builder;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class Burger {

    private String bun = "No Bun";
    private String meat = "No Meat";
    private String cheese = "No Cheese";
    private String salad = "No Salad";
    private String sauce = "No Sauce";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void print(){
        System.out.println("Hamburguer Pronto! -> "+ " Pão: " + bun +  " - Proteina: " + meat + " - Queijo: " + cheese + " - Salada: " + salad + " - Molho: " + sauce);
    }
}
