package Entite;

public class Enclos {
    private String idEnclos;
    private String type;
    private double superficie;

    public Enclos(String idEnclos, String type, double superficie) {
        this.idEnclos = idEnclos;
        this.type = type;
        this.superficie = superficie;
    }

    public String getIdEnclos() {
        return idEnclos;
    }

    public String getType() {
        return type;
    }

    public double getSuperficie() {
        return superficie;
    }


}
