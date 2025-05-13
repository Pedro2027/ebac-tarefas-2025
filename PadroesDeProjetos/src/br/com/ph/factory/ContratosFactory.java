package br.com.ph.factory;


/*
@author Pedro Henrique Araujo
29/04/2025 
*/
public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestGrade) {
        if("A".equals(requestGrade)){
            return new CorolaCar(100, "Cheio", "Vermelha");
        }else{
            return null;
        }
    }
}
