public class Car {
    private String color;
    private String brand;
    private double nbKm;
    private Motor motor;

    public Car(String color, String brand, int nbKm, Motor motor) {
        this.color = color;
        this.brand = brand;
        this.nbKm = nbKm;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setNbKm(double nbKm) {
        this.nbKm = nbKm;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
