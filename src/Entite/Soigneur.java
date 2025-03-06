package Entite;

import java.util.Random;

public class Soigneur extends Personnel {
    private String specialite;

    public Soigneur(String nom, String prenom, int age, String specialite) {
        super(nom, prenom, age);
        this.specialite = specialite;
    }

    public void diagnostiquer(Animaux animal) {

        if (!animal.getClass().getSimpleName().equalsIgnoreCase(specialite)) {
            System.out.println(getNom() + " ne peut pas diagnostiquer cet animal !");
            return;
        }

        System.out.println(getNom() + " examine " + animal.getNom() + "...");

        Random rand = new Random();
        boolean malade = rand.nextBoolean();

        if (malade) {
            System.out.println(animal.getNom() + " est malade ! Il doit être soigné.");
            soigner(animal);
        } else {
            System.out.println(animal.getNom() + " est en bonne santé !");
        }
    }

    public void soigner(Animaux animal) {
        if (animal.getClass().getSimpleName().equalsIgnoreCase(specialite)) {
            System.out.println(getNom() + " soigne un " + animal.getNom() + ".");
        } else {
            System.out.println(getNom() + " ne peut pas soigner cet animal !");
        }
    }

    public String getSpecialite() {
        return specialite;
    }

    @Override
    public String toString() {
        return "Soigneur{" +
                "nom='" + getNom() + '\'' +
                ", prenom='" + getPrenom() + '\'' +
                ", age=" + getAge() +
                ", specialite='" + specialite + '\'' +
                '}';
    }

}
