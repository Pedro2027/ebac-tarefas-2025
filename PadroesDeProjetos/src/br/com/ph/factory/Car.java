package br.com.ph.factory;


import org.w3c.dom.ls.LSOutput;

/*
@author Pedro Henrique Araujo
29/04/2025 
*/
public abstract class Car {
    private int horsePower;
    private String fuelSource;
    private String color;


    public Car(int horsePower, String fuelSource, String color){
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + fuelSource + " o motor foi ligado e está pronto para ser utilizado" + " horsetPower: " + horsePower + "");
    }

    public void clean(){
        System.out.println("O carro está limpo, é da cor " + color.toLowerCase() + " e a cor brilha");
    }

    public void mechanicCheck(){
        System.out.println("A mecanica do carro foi checada, Boa sorte!");
    }

    public void fuelCar(){
        System.out.println("O carro está sendo abastecido " + fuelSource.toLowerCase());
    }

}


