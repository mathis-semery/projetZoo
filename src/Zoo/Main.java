package Zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Entite.Lion;

public class Main {
    private static Scanner clavier = new Scanner(System.in);
    private static Map<String, Lion> animaux = new HashMap<>();// connecte par pair une clé en string avecc une valeur objet donc les animaux

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
        System.out.println("Gestion du zoo en cours...");

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
