package Zoo;



import java.util.Scanner;

import Entite.Animaux;
import Entite.Lion;
import Entite.Personnel;
import Entite.Soigneur;

import static Zoo.GestionZoo.getAnimaux;

public class Main {
    private static Scanner clavier = new Scanner(System.in);


    public static void main(String[] args) {

        GestionZoo.initialiserAnimaux();
        GestionZoo.initialiserPersonnel();
        GestionZoo.initialiserEnclos();

        System.out.println("Bienvenue au zoo !");
        while (true) {
            System.out.println("Souhaitez-vous gérer le Zoo ou le visiter ? (gérer / visiter / partir)");
            String action1 = clavier.nextLine().trim().toLowerCase();

            switch (action1) {
                case "gérer":
                    GererZoo.gererZoo();
                    break;
                case "visiter":
                    visiterZoo.visiterZoo();
                    break;
                case "partir":
                    System.out.println("Merci de votre visite !");
                    return;
                default:
                    System.out.println("Option invalide. Veuillez choisir parmi : gérer / visiter / partir.");
            }
        }
    }



}
