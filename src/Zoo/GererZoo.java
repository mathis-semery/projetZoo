package Zoo;

import Entite.Animaux;
import Entite.Lion;
import Entite.Oiseau;
import Entite.Serpent;

import java.util.Scanner;

public class GererZoo {
    private static Scanner clavier = new Scanner(System.in);


    protected static void gererZoo() {
        while (true) {
            System.out.println("Que souhaitez vous faire  ? ()");
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
                case "ajouter":
                    ajouterAnimaux();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez choisir parmi : gérer / visiter / partir.");
            }


        }
    }

    public static String especeAnimaux() {
        System.out.println("Quelle espèce souhaitez-vous ajouter ?");
        String espece = clavier.nextLine().trim().toLowerCase();

        System.out.println("Vous avez choisi d'ajouter un " + espece);
        return espece;
    }
    public static void ajouterAnimaux() {

        String espece = especeAnimaux();
        especeAnimaux();


        System.out.println("vous ajouter ici un animaux");

        System.out.print("Entrez le nom de l'animal : ");
        String nom = clavier.nextLine().trim().toLowerCase();

        System.out.println("De quel sex est la/le" + espece + " : ");
        String sexe = clavier.nextLine().trim().toLowerCase();

        System.out.print("Quel âge à le " + espece + " : ");
        double age = clavier.nextDouble();


        Animaux animal = null ;

        if (espece.equals("lion")){
            String type = "Carnivore" ;
            String deplacement = "Marche";
            animal =   new Lion(nom, type, age ,sexe, deplacement);
        }else if (espece.equals("Serpent")){
            String type = "Carnivore" ;
            String deplacement = "Rampe";
            animal = new Serpent(nom, type, age, sexe, deplacement);
        }else if (espece.equals("oiseau")){
            String type = "herbivore" ;
            String deplacement = "voler";
            animal = new Oiseau( nom , type, age, sexe, deplacement);
        }

        if (animal != null) {

            String clé = clavier.nextLine().trim().toLowerCase();

            GestionZoo.ajouterAnimal(clé, animal);
            System.out.println(animal.getNom() + " a bien été ajouté au zoo avec la clé " + clé);
        } else {
            System.out.println("Espèce inconnue, l'animal n'a pas pu être ajouté.");
        }
        GestionZoo.afficherTousLesAnimaux();
    }
}




