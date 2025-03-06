package Zoo;

import Entite.*;


import java.util.HashMap;
import java.util.Map;

public class GestionZoo {
    private static Map<String, Animaux> animaux = new HashMap<>();
    private static Map<String, Soigneur> personnel = new HashMap<>();
    private static Map<String, Enclos> enclos = new HashMap<>();
    private static Map<String, Visiteur> visiteur = new HashMap<>();

    public static Map<String, String> getAnimalEnclos() {
        return animalEnclos;
    }

    private static Map<String, String> animalEnclos = new HashMap<>();

    public static double soldeZoo = 1000.0;
    static double richesse = 15 + (Math.random() * (1500 - 15));
    static  double soldeVisiteur = Math.round(richesse * 100.0) / 100.0;

    public static double  prixbilletEnfant = 8;
    public static double prixbilletAdulte = 15;

    static void initialiserAnimaux() {
        animaux.put("lion", new Lion("Lion", "Carnivore", 4.0, "Mâle", "Marche"));
        animaux.put("serpent", new Serpent("Serpent", "carnivore", 6.0, "Femelle", "Rampe"));
        animaux.put("oiseau", new Oiseau("oiseau", "herbivore", 2.0, "Mâle", "voler"));
    }

    static void initialiserPersonnel() {

        personnel.put("Soigneur1", new Soigneur("Dena", "Paul", 20, "Lion"));
    }

    static void initialiserEnclos() {
        enclos.put("Enclos1", new Enclos("Enclos1", 6, 10.0 , "lion"));
        enclos.put("Enclos2", new Enclos("Enclos2", 8, 10.0 , "serpent"));
        enclos.put("Enclos3", new Enclos("Enclos3", 10, 10.0 , "oiseau"));


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

    public static void ajouterAnimal(String cle, Animaux animal) {
        animaux.put(cle, animal);
        System.out.println(" votre animal à bien été ajouter au zoo ");
    }
    public static void ajouterEnclo(String cle, Enclos enclo) {
        enclos.put(cle, enclo);
        System.out.println(" votre animal à bien été ajouter au zoo ");
    }

    public static void afficherTousLesAnimaux() {
        for (Animaux animal : GestionZoo.getAnimaux().values()) {
            System.out.println(animal);
        }
    }
        public static void afficherTousLesEnclos () {
            for (Enclos enclo : GestionZoo.getEnclos().values()) {
                System.out.println(enclo);
            }
        }
    public static void ajouterSoigneur(String cle, Soigneur soigneur) {
        personnel.put(cle, soigneur);
        System.out.println("Le soigneur a bien été ajouté au zoo.");
    }


    public static void afficherTousLesSoigneurs() {
        for (Soigneur soigneur : personnel.values()) {
            System.out.println(soigneur);
        }
    }

    public static void afficherLiaisons() {
        if (getAnimalEnclos().isEmpty()) {
            System.out.println("Aucune liaison entre animal et enclos.");
        } else {
            for (String idAnimal : getAnimalEnclos().keySet()) {
                Animaux animal = getAnimaux().get(idAnimal);
                String enclos = getAnimalEnclos().get(idAnimal);
                System.out.println(animal.getNom() + " est dans l'enclos " + enclos.getClass());
            }
        }
    }

        public static void afficherSolde () {
            System.out.println(soldeZoo);
        }

    public static void ajouterVisiteur(String cle, Visiteur visiteurr) {
        visiteur.put(cle , visiteurr);
    }
    public static void affichervisiteur() {
        for (Visiteur visiteurr : visiteur.values()) {
            System.out.println(visiteurr);
        }
    }
}