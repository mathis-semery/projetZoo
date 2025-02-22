package Entite;

public class Soigneur extends Personnel{
    private String specialite;
    public Soigneur(String nom , String prenom , int age , String specialite){
        super(nom , prenom ,age);
        this.specialite = specialite;
    }


    }

