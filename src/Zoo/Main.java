package Zoo;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Entite.Animaux;
import Entite.Lion;
import Entite.Personnel;
import Entite.Soigneur;

public class Main {
    private static Scanner clavier = new Scanner(System.in);
    private static Map<String, Lion> animaux = new HashMap<>();

    public static void main(String[] args) {
        initialiserAnimaux();

        System.out.println("Bienvenue au zoo !");
        while (true) {
            System.out.println("Souhaitez-vous gérer le Zoo ou le visiter ? (gérer / visiter / partir)");
            String action1 = clavier.nextLine().trim().toLowerCase();

            switch (action1) {
                case "gérer":
                    gererZoo();
                    break;
                case "visiter":
                    visiterZoo();
                    break;
                case "partir":
                    System.out.println("Merci de votre visite !");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez choisir parmi : gérer / visiter / partir.");
            }
        }
    }

    private static void initialiserAnimaux() {
        animaux.put("lion", new Lion("Lion", "Carnivore", 4.0, "Mâle", "Marche"));

    }

    private static void gererZoo() {
        System.out.println("gestion du zoo en cours ......");
        System.out.println("voulez vous faire appel au soigneur pour diagnostiquer les animaux !");
        String choix = clavier.nextLine().trim().toLowerCase();

        if (choix.equals("oui")) {

            Animaux animal = animaux.get("lion");

            if (animal != null) {
                Soigneur soigneur = new Soigneur("Paul", "Dena", 20 , "Lion");
                soigneur.diagnostiquer(animal);
            } else {
                System.out.println("Le lion n'est pas disponible dans le zoo.");
            }
        } else if (choix.equals("plus tard")) {
            System.out.println("Pas de soucis, n'oubliez pas de prendre soin des animaux !");
        } else {
            System.out.println("Option invalide. Veuillez répondre par 'oui' ou 'plus tard'.");
        }

    }

    private static void visiterZoo() {
        System.out.println("Quel animal souhaitez-vous observer ?");
        String nomAnimal = clavier.nextLine().trim().toLowerCase();

        if (animaux.containsKey(nomAnimal)) {
            animaux.get(nomAnimal).afficherLion();
        } else {
            System.out.println("Cet animal n'est pas disponible.");
        }
    }
}
