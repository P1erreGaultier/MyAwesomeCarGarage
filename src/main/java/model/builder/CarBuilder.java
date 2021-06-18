package model.builder;

import model.Car;
import model.Motor;

public class CarBuilder {

    private String color;
    private String brand;
    private double nbKm;
    private Motor motor;


    public CarBuilder(Car built) {
        this.color = built.getColor();
        this.brand = built.getBrand();
        this.nbKm = built.getNbKm();
        this.motor = built.getMotor();
    }

    public CarBuilder withColor(String color){
        this.color = color;
        return this;
    }

    public CarBuilder withBrand(String brand){
        this.color = color;
        return this;
    }

    public CarBuilder withNbKm(double nbKm){
        this.nbKm = nbKm;
        return this;
    }

    public CarBuilder withMotor(Motor motor){
        this.motor = motor;
        return this;
    }

    public Car build(){
        return new Car(this.color,this.brand,this.nbKm,this.motor);
    }

}
