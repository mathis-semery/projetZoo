package Zoo;

import java.util.Scanner;
import Entite.Lion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenue au zoo !");
        System.out.println("Souhaitez-vous gérer le Zoo ou le visiter ?  gérer / visiter / partir ");

        Scanner clavier = new Scanner(System.in);
        String action1 = clavier.nextLine().trim();

        if (action1.equalsIgnoreCase("gérer")) {
            System.out.println("Gestion du zoo en cours...");

        } else if (action1.equalsIgnoreCase("visiter")) {
            System.out.println("Quel animal souhaitez-vous observer ?");
            String actionV = clavier.nextLine().trim();

            if (actionV.equalsIgnoreCase("le lion")) {
                Lion lion1 = new Lion("Lion", "Carnivore", 4.0, "Mâle", "Marche");
                lion1.afficherLion();
            } else {
                System.out.println("Cet animal n'est pas disponible.");
            }

        } else if (action1.equalsIgnoreCase("partir")) {
            System.out.println("Merci de votre visite !");
        } else {
            System.out.println("Option invalide. Veuillez choisir parmi : gérer / visiter / partir.");
        }

        clavier.close();
    }
}
