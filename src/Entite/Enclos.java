package Entite;

public class Enclos {
    private String idEnclos;
    private String capacite;
    private double superficie;

    public Enclos(String idEnclos, String capacite, double superficie) {
        this.idEnclos = idEnclos;
        this.capacite = capacite;
        this.superficie = superficie;
    }

    public String getIdEnclos() {
        return idEnclos;
    }

    public String geCapacite() {
        return capacite;
    }

    public double getSuperficie() {
        return superficie;
    }


}
