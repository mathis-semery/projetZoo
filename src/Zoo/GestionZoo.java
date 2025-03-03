package Zoo;

import Entite.*;

import java.util.HashMap;
import java.util.Map;

public class GestionZoo {
    private static Map<String, Animaux> animaux = new HashMap<>();
    private static Map<String, Soigneur> personnel = new HashMap<>();
    private static Map<String, Enclos> enclos = new HashMap<>();
    private static Map<String, Visiteur> visiteur = new HashMap<>();

    public static double soldeZoo = 1000.0;

    static void initialiserAnimaux() {
        animaux.put("lion", new Lion("Lion", "Carnivore", 4.0, "Mâle", "Marche"));
        animaux.put("Serpent", new Serpent("Serpent", "carnivore", 6.0, "Femelle", "Rampe"));
        animaux.put("oiseau", new Lion("oiseau", "herbivore", 2.0, "Mâle", "voler"));
    }

    static void initialiserPersonnel() {

        personnel.put("Soigneur1", new Soigneur("Dena", "Paul", 20, "Lion"));
    }

    static void initialiserEnclos() {
        enclos.put("Enclos1", new Enclos("Enclos1", "Lion", 10.0));
        enclos.put("Enclos2", new Enclos("Enclos2", "Serpent", 10.0));
        enclos.put("Enclos3", new Enclos("Enclos3", "oiseau", 10.0));


    }

    static void initialiserVisiteur() {
        visiteur.put("Visiteur1", new Visiteur("Semery", "Mathis", 18));
    }

    public static Map<String, Soigneur> getPersonnel() {
        return personnel;
    }

    public static Map<String, Animaux> getAnimaux() {
        return animaux;
    }

    public static Map<String, Enclos> getEnclos() {
        return enclos;
    }

    public static void ajouterAnimal(String clé, Animaux animal) {
        animaux.put(clé, animal);
        System.out.println(" votre animal à bien été ajouter au zoo ");
    }
    
    public static void afficherTousLesAnimaux() {
        for (Animaux animal : GestionZoo.getAnimaux().values()) {
            System.out.println(animal);
        }

    }
}