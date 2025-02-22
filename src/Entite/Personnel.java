package Entite;

public class Personnel {

    private String nom;
    private String prenom;
    private int    age;



    public Personnel(String nom , String prenom , int age ) {
        this.nom    = nom;
        this.prenom = prenom;
        this.age    = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getPrenom() {
        return prenom;
    }




}
