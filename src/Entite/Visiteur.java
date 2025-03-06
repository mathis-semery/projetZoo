package Entite;

public class Visiteur {
    private String nom;
    private String prenom;
    private int age;


    public Visiteur(String nom, String prenom, int  age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;

    }
    @Override
    public String toString() {
        return "Visiteur{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

}
