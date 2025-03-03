package Entite;

public class Oiseau extends Animaux {
    public Oiseau(String nom, String type, double age, String sexe, String deplacement) {
        super(nom, type, age, sexe, deplacement);
    }

    public void afficherOiseau() {
        System.out.println("Animal : " + getNom());
        System.out.println("Régime alimentaire : " + getType());
        System.out.println("Âge : " + getAge() + " ans");
        System.out.println("Sexe : " + getSexe());
        System.out.println("Mode de déplacement : " + getDeplacement());
    }

    public void SeReproduire() {
        System.out.println("L'oiseau pond des œufs.");
    }

    public void manger() {
        System.out.println("L'oiseau mange des graines et des insectes.");
    }

    public void Sedeplacer() {
        System.out.println("L'oiseau vole.");
    }

    public void bruit() {
        System.out.println("L'oiseau chante : Cui Cui !");
    }
}
