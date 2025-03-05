package Zoo;

import Entite.Animaux;
import Entite.Lion;
import Entite.Oiseau;
import Entite.Serpent;
import Entite.Enclos;

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
                case "afficheranimaux":
                    GestionZoo.afficherTousLesAnimaux();
                    break;
                case "modifprixbillet":
                    modifPrixBillet();
                    break;
                case "affichersolde":
                    GestionZoo.afficherSolde();
                    break;
                case "ajouterenclos":
                    GestionZoo.ajouterEnclo();
                    break;
                case "ajouteranimal":
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


        Animaux animal = null;

        if (espece.equals("lion")) {
            String type = "Carnivore";
            String deplacement = "Marche";
            animal = new Lion(nom, type, age, sexe, deplacement);
        } else if (espece.equals("serpent")) {
            String type = "Carnivore";
            String deplacement = "Rampe";
            animal = new Serpent(nom, type, age, sexe, deplacement);
        } else if (espece.equals("oiseau")) {
            String type = "herbivore";
            String deplacement = "voler";
            animal = new Oiseau(nom, type, age, sexe, deplacement);
        }

        if (animal != null) {

            String cle = clavier.nextLine().trim().toLowerCase();

            GestionZoo.ajouterAnimal(cle, animal);
            System.out.println(animal.getNom() + " a bien été ajouté au zoo avec la clé " + cle);
        } else {
            System.out.println("Espèce inconnue, l'animal n'a pas pu être ajouté.");
        }
        GestionZoo.afficherTousLesAnimaux();
    }

    public static void ajouterEnclos() {
        System.out.println("vous ajoutez ici un enclos");

        System.out.print("Entrez l'ID de l'enclos : ");
        String idEnclos = clavier.nextLine().trim().toLowerCase();

        System.out.print("Entrez le type d'enclos (ex: Savane, Jungle, Volière) : ");
        String capacite = clavier.nextLine().trim().toLowerCase();

        System.out.print("Quelle est la superficie de l'enclos en m² : ");
        double superficie = clavier.nextDouble();

        clavier.nextLine();

        Enclos enclo = new Enclos(idEnclos, capacite, superficie);

        if (enclo != null) {
            String cle = clavier.nextLine().trim().toLowerCase();
            GestionZoo.ajouterEnclo(cle, enclo);
            System.out.println("L'enclos " + enclo.getIdEnclos() + " a bien été ajouté au zoo avec la clé " + cle);
        } else {
            System.out.println("Type d'enclos inconnu, l'enclos n'a pas pu être ajouté.");
        }
        GestionZoo.afficherTousLesEnclos();
    }



    public static void modifPrixBillet() {
        System.out.print("Nouveau prix du billet enfant : ");
        GestionZoo.prixbilletEnfant = clavier.nextDouble();

        System.out.print("Nouveau prix du billet adulte : ");
        GestionZoo.prixbilletAdulte = clavier.nextDouble();

        System.out.println("Les nouveaux prix ont été mis à jour !");
        System.out.println("les Prix enfant sont :" + GestionZoo.prixbilletEnfant + "les Prix Adultes sont : " + GestionZoo.prixbilletAdulte);
    }


}



