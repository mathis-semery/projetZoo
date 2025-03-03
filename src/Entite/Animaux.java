package Entite;

public abstract class Animaux {
    private String nom;
    private String type;
    private Double age;
    private String sexe;
    private String deplacement;

    public Animaux(String nom, String type, Double age, String sexe, String deplacement) {
        this.nom = nom;
        this.type = type;
        this.age = age;
        this.sexe = sexe;
        this.deplacement = deplacement;
    }


    public void afficher() {
        System.out.println("Nom: " + nom);
        System.out.println("Type: " + type);
        System.out.println("Âge: " + age + " ans");
        System.out.println("Sexe: " + sexe);
        System.out.println("Mode de déplacement: " + deplacement);
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public Double getAge() {
        return age;
    }

    public String getSexe() {
        return sexe;
    }

    public String getDeplacement() {
        return deplacement;
    }

    public abstract void manger();
    public abstract void Sedeplacer();
    public abstract void bruit();
}
