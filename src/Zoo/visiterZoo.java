package Zoo;

import Entite.Animaux;

import java.util.Scanner;





public class visiterZoo {
    private static Scanner clavier = new Scanner(System.in);

protected static void visiterZoo() {

    System.out.println("Quel animal souhaitez-vous observer ?");
    String nomAnimal = clavier.nextLine().trim().toLowerCase();

    if (GestionZoo.getAnimaux().containsKey(nomAnimal)) {

        Animaux animal = GestionZoo.getAnimaux().get(nomAnimal);
        animal.afficher();
    } else {
        System.out.println("Cet animal n'est pas disponible.");
    }
}}