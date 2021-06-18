package service;

import model.Car;
import model.Motor;

public class CarService {

    public Car paintAndReplaceMotor(Car car, String color, Double size, Double power){
        return car.mutate((mutated)-> new Car(
                color,
                mutated.getBrand(),
                mutated.getNbKm(),
                new Motor(size,power)
        ));
    }

}
