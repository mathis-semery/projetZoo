package Entite;

public class Serpent extends Animaux {
    public Serpent(String nom, String type, Double age, String sexe, String deplacement) {
        super(nom, type, age, sexe, deplacement);
    }

    public void afficherSerpent() {
        System.out.println("Animal : " + getNom());
        System.out.println("Régime alimentaire : " + getType());
        System.out.println("Âge : " + getAge() + " ans");
        System.out.println("Sexe : " + getSexe());
        System.out.println("Mode de déplacement : " + getDeplacement());
    }

    public void SeReproduire() {
        System.out.println("Le serpent pond des œufs.");
    }

    public void manger() {
        System.out.println("Le serpent mange des rongeurs.");
    }

    public void Sedeplacer() {
        System.out.println("Le serpent rampe.");
    }

    public void bruit() {
        System.out.println("Le serpent siffle : Ssssss !");
    }
}