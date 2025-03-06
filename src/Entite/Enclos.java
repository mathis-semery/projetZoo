package Entite;

public class Enclos {
    private String idEnclos;
    private int capacite;
    private double superficie;

    public int getCapacite() {
        return capacite;
    }

    private String typeAnimal;

    public Enclos(String idEnclos, int capacite, double superficie , String  typeAnimal) {
        this.idEnclos = idEnclos;
        this.capacite = capacite;
        this.superficie = superficie;
        this.typeAnimal = typeAnimal;
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


}
