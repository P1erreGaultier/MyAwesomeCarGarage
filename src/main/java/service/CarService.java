package service;

import model.Car;
import model.Motor;
import model.builder.CarBuilder;

public class CarService {

    public Car paintAndReplaceMotor(Car car, String color, Double size, Double power){
        return new CarBuilder(car)
                .withColor(color)
                .withMotor(new Motor(size,power))
                .build();
    }
}
