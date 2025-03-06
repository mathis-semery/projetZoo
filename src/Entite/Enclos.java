package Entite;

public class Enclos {

    private String idEnclos;
    private int capacite;
    private double superficie;
    private int salete ;



    public int getCapacite() {
        return capacite;
    }

    private String typeAnimal;

    public Enclos(String idEnclos, int capacite, double superficie , String  typeAnimal , int salete) {
        this.idEnclos = idEnclos;
        this.capacite = capacite;
        this.superficie = superficie;
        this.typeAnimal = typeAnimal;
        this.salete = 0;
    }

    public String getIdEnclos() {
        return idEnclos;
    }

    public int capacite() {
        return capacite;
    }

    public double getSuperficie() {
        return superficie;
    }
    public String getTypeAnimal() {
        return typeAnimal;
    }

    @Override
    public String toString() {
        return "Enclos{" +
                "id='" + idEnclos + '\'' +
                ", capacité='" + capacite + '\'' +
                ", superficie=" + superficie + " m²" +
                ", typeAnimal='" + typeAnimal + '\'' +
                '}';
    }

    public int getSalete() {
        return salete;
    }
    public void ajoutSalete() {
        this.salete += 1;

    }
    public void nettoyer() {
        this.salete = 0;
        System.out.println( " l'enclos a été nettoyé. Saleté ");
    }


}
