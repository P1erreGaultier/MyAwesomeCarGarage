import model.Car;
import model.Motor;
import service.CarService;

public class main {

    public static void main(String[] args){

        CarService garage = new CarService();

        // On a une twingo rouge avec un petit moteur
        Car maTwingo = new Car("Rouge","Renault",70000,new Motor(120d,12d));

        // On peint la voiture
        garage.paint(maTwingo,"bleu");

        // On prepare la voiture avant les travaux sur le moteur
        garage.prepareCarToBeRepaired(maTwingo);

        // On remplace le moteur par un nouveau
        garage.replaceMotor(maTwingo,180d,18d);

        // On veut une twingo bleu avec un gros moteur
        System.out.println(maTwingo);
    }

}
