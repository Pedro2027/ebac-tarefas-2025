package br.com.ph.builder;


/*
@author Pedro Henrique Araujo
24/04/2025 
*/
public class Gerente {
    //construção do hambúrguer usando um objeto BurgerBuilder
    BurgerBuilder builder;

    //Para não precisar criar um gerente novo a cada mudança de tipo de hambuerguer
    public void setBuilder(BurgerBuilder builder) {
        this.builder = builder;
    }


    //O construtor recebe um BurgerBuilder como parâmetro e o armazena no atributo da classe. Isso permite que o Gerente
    // use o builder para criar hambúrgueres personalizados.

    /*public Gerente(BurgerBuilder builder){
        this.builder = builder;
    }*/


    public Burger buildBurger(){
        builder.buildBun();       // Monta o pão
        builder.buildMeat();      // Adiciona a carne
        builder.buildCheese();   // Adiciona o queijo
        builder.buildSalad();     // Adiciona a salada
        builder.buildSauce();     // Adiciona o molho
        return builder.build();   // Retorna o hambúrguer montado
    }


}
