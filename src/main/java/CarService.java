public class CarService {


    public void paint (Car car, String color) {
        car.setColor(color);
    }

    public void prepareCarToBeRepaired(Car car){

        // Le garagiste n'est pas très doué, il enleve la peinture de la voiture avant de changer le moteur
        car.setColor("");
        car.setMotor(null);
    }

    public void replaceMotor(Car car, Double size, Double power) {
        // La non plus le garagiste n'est pas très doué, il ne verifie pas la présence du moteur avant de travailler dessus
        car.getMotor().setPower(power);
        car.getMotor().setSize(size);
    }


}
