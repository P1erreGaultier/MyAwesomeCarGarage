package model;

public class Motor {

    private double size;
    private double power;

    public Motor(double size, double power) {
        this.size = size;
        this.power = power;
    }

    @Override
    public String toString() {
        return "model.Motor{" +
                "size=" + size +
                ", power=" + power +
                '}';
    }

    public double getSize() {
        return size;
    }

    public double getPower() {
        return power;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
