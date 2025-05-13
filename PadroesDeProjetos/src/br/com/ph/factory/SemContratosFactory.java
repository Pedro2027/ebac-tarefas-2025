package br.com.ph.factory;


/*
@author Pedro Henrique Araujo
29/04/2025 
*/
public class SemContratosFactory extends Factory {


    @Override
    Car retrieveCar(String requestGrade) {
        if("A".equals(requestGrade)){
            return new MiniKiwd(100, "Cheio", "Rosa");
        }else{return null;}
    }
}
