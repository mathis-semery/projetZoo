package Zoo;

import Entite.Animaux;
import Entite.Soigneur;

import java.util.Scanner;

public class GererZoo {
    private static Scanner clavier = new Scanner(System.in);

    protected static void gererZoo() {

        System.out.println("gestion du zoo en cours ......");
        System.out.println("voulez vous faire appel au soigneur pour diagnostiquer les animaux !");
        String choix = clavier.nextLine().trim().toLowerCase();

        if (choix.equals("oui")) {

            Animaux animal = GestionZoo.getAnimaux().get("lion");

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
}
