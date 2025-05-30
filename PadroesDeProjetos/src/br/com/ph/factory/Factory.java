package br.com.ph.factory;


/*
@author Pedro Henrique Araujo
29/04/2025 
*/
public abstract class Factory {

    public Car create(String requestGrade) {
        Car car = retrieveCar(requestGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car.clean();
        car.mechanicCheck();
        car.fuelCar();
        return car;
    }

    abstract Car retrieveCar(String requestGrade);


}
