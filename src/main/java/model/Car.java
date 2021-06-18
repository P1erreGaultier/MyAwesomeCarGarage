package model;

import java.util.Objects;

public final class Car {
    private final String color;
    private final String brand;
    private final double nbKm;
    private final Motor motor;

    public Car(String color, String brand, double nbKm, Motor motor) {
        this.color = color;
        this.brand = brand;
        this.nbKm = nbKm;
        // On valide à la création qu'on a bien un moteur
        // Comme l'objet est immutable, on est toujours sur que le modele est consistant
        this.motor = Objects.requireNonNull(motor, "motor is mandatory");
    }

    @Override
    public String toString() {
        return "model.Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", nbKm=" + nbKm +
                ", motor=" + motor +
                '}';
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public double getNbKm() {
        return nbKm;
    }

    public Motor getMotor() {
        return motor;
    }

}
