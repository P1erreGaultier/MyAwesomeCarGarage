package model;

// Le record rend cette modelisation beaucoup moins verbeuse
// On pourrai meme l'ecrire dans la classe "Car"
public record Motor(double size, double power) {

    public static Motor NONE = new Motor(0d, 0d);

}



