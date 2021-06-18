import model.Car;
import model.Motor;
import service.CarService;

public class main {

    public static void main(String[] args){

        CarService garage = new CarService();

        // On a une twingo rouge avec un petit moteur
        Car maTwingo = new Car("Rouge","Renault",70000,new Motor(120d,12d));

        // utilisation du garage
        maTwingo = garage.paintAndReplaceMotor(maTwingo,"bleu",180d,12d);

        // On veut une twingo bleu avec un gros moteur
        System.out.println(maTwingo);
    }

}
