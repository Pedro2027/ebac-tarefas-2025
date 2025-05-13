package br.com.ph.factory;


/*
@author Pedro Henrique Araujo
29/04/2025 
*/
public class Demo {
    public static void main(String args[]){
        Customer cliente = new Customer("A", true);
        Factory factory = getFactory(cliente);
        Car car = factory.create(cliente.getGradeRequest());
        car.startEngine();

    }

    private static Factory getFactory(Customer cliente){
        if(cliente.hasCompanyContract()){
            return new ContratosFactory();
        }else{
            return new SemContratosFactory();
        }
    }
}
