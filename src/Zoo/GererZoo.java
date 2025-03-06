package Zoo;

import Entite.Animaux;
import Entite.Lion;
import Entite.Oiseau;
import Entite.Serpent;
import Entite.Enclos;
import Entite.*;

import java.util.Map;
import java.util.Scanner;

public class GererZoo {
    private static Scanner clavier = new Scanner(System.in);


    protected static void gererZoo() {
        while (true) {
            System.out.println("Sélectionnez une option :");
            System.out.println("1. Gérer le Zoo");
            System.out.println("2. Visiter le Zoo");
            System.out.println("3. Partir");
            System.out.println("4. Afficher tous les animaux");
            System.out.println("5. Modifier le prix du billet");
            System.out.println("6. Afficher le solde");
            System.out.println("7. Ajouter un enclos");
            System.out.println("8. Ajouter un soigneur");
            System.out.println("9. Ajouter un animal à un enclos");
            System.out.println("10. Ajouter un animal");
            System.out.println("11. Entretenir la santé des Animaux ");
            System.out.print("Choisissez une option (1-10) : ");

            int action1 = clavier.nextInt();
            clavier.nextLine();

            switch (action1) {
                case 1:
                    GererZoo.gererZoo();
                    break;
                case 2:
                    visiterZoo.visiterZoo();
                    break;
                case 3:
                    System.out.println("Merci de votre visite !");
                    return;
                case 4:
                    GestionZoo.afficherTousLesAnimaux();
                    break;
                case 5:
                    modifPrixBillet();
                    break;
                case 6:
                    GestionZoo.afficherSolde();
                    break;
                case 7:
                    ajouterEnclos();
                    break;
                case 8:
                    ajouterSoigneur();
                    break;
                case 9:
                    ajouterAnimalEnclos();
                    break;
                case 10:
                    ajouterAnimaux();
                    break;
                case 11:
                    diagnostiquerTousLesAnimaux(GestionZoo.getAnimaux() , GestionZoo.getPersonnel());
                    break;
                default:
                    System.out.println("Option invalide. Veuillez choisir parmi les options disponibles (1-10).");
                    break;
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

        System.out.print("Entrez la capacité de l'enclos : ");
        int capacite = clavier.nextInt();

        System.out.print("Quelle est la superficie de l'enclos en m² : avec 2 chiffres apres la virgule ");
        double superficie = clavier.nextDouble();

        System.out.println("Quelle est le type d'animal de l'enclos ? lion / serpent / oiseau");
        String typeAnimal = clavier.nextLine().trim().toLowerCase();

        Enclos enclo = null;
        int salete = 0;

        enclo = new Enclos(idEnclos, capacite, superficie , typeAnimal , salete );

        if (enclo != null) {
            String cle = clavier.nextLine().trim().toLowerCase();
            GestionZoo.ajouterEnclo(cle, enclo);
            System.out.println("L'enclos " + enclo.getIdEnclos() + " a bien été ajouté au zoo avec la clé " + cle);
        } else {
            System.out.println("Type d'enclos inconnu, l'enclos n'a pas pu être ajouté.");
        }
        GestionZoo.afficherTousLesEnclos();
    }

    public static void ajouterSoigneur() {
        System.out.println("Vous ajoutez ici un soigneur");

        System.out.print("Entrez le nom du soigneur : ");
        String nom = clavier.nextLine().trim();

        System.out.print("Entrez le prénom du soigneur : ");
        String prenom = clavier.nextLine().trim();

        System.out.print("Entrez l'âge du soigneur : ");
        int age = clavier.nextInt();
        clavier.nextLine(); // Pour éviter les problèmes avec nextInt()

        System.out.print("Entrez la spécialité du soigneur (ex: Lion, Oiseau, Serpent) : ");
        String specialite = clavier.nextLine().trim();

        Soigneur soigneur = new Soigneur(nom, prenom, age, specialite);

        System.out.print("Entrez une clé pour identifier ce soigneur dans le zoo : ");
        String cle = clavier.nextLine().trim();

        GestionZoo.ajouterSoigneur(cle, soigneur);
        System.out.println("Le soigneur " + soigneur.getNom() + " a bien été ajouté avec la clé " + cle);

        GestionZoo.afficherTousLesSoigneurs();
    }


    public static void modifPrixBillet() {
        System.out.print("Nouveau prix du billet enfant : ");
        GestionZoo.prixbilletEnfant = clavier.nextDouble();

        System.out.print("Nouveau prix du billet adulte : ");
        GestionZoo.prixbilletAdulte = clavier.nextDouble();

        System.out.println("Les nouveaux prix ont été mis à jour !");
        System.out.println("les Prix enfant sont :" + GestionZoo.prixbilletEnfant + "les Prix Adultes sont : " + GestionZoo.prixbilletAdulte);
    }
    public static void ajouterAnimalEnclos() {

        GestionZoo.afficherTousLesAnimaux();
        GestionZoo.afficherTousLesEnclos();

        System.out.println("Entrez le nom de l'animal que vous voulez lier à un enclos : ");
        String nomAnimal = clavier.nextLine().trim();


        if (GestionZoo.getAnimaux().containsKey(nomAnimal)) {

            System.out.println("Entrez l'ID de l'enclos auquel vous souhaitez lier l'animal : ");
            String idEnclos = clavier.nextLine().trim();


            if (GestionZoo.getEnclos().containsKey(idEnclos)) {

                GestionZoo.getAnimalEnclos().put(nomAnimal, idEnclos);
                System.out.println("L'animal " + nomAnimal + " a bien été lié à l'enclos " + idEnclos);
            } else {
                System.out.println("L'enclos avec l'ID " + idEnclos + " n'existe pas.");
            }
        } else {
            System.out.println("L'animal avec le nom " + nomAnimal + " n'existe pas.");
        }
        afficherAnimalEnclos();
    }
    public static void afficherAnimalEnclos() {

        if (GestionZoo.getAnimalEnclos().isEmpty()) {
            System.out.println("Aucun animal n'est actuellement lié à un enclos.");
        } else {
            for (String nomAnimal : GestionZoo.getAnimalEnclos().keySet()) {

                String idEnclos = GestionZoo.getAnimalEnclos().get(nomAnimal);
                Enclos enclosObj = GestionZoo.getEnclos().get(idEnclos);


                System.out.println("Animal : " + nomAnimal + " -> Enclos : " + enclosObj.getIdEnclos() + ", Capacite : " + enclosObj.getCapacite() + ", Superficie : " + enclosObj.getSuperficie() + "m²");
            }
        }

    }
    public static void diagnostiquerTousLesAnimaux(Map<String, Animaux> animauxMap, Map<String, Soigneur> personnel) {
        for (Animaux animal : animauxMap.values()) {
            String espece = animal.getClass().getSimpleName();

            Soigneur soigneurTrouve = null;


            for (Soigneur soigneur : personnel.values()) {
                if (soigneur.getSpecialite().equalsIgnoreCase(espece)) {
                    soigneurTrouve = soigneur;
                    break;
                }
            }

            if (soigneurTrouve != null) {
                soigneurTrouve.diagnostiquer(animal);
            } else {
                System.out.println("Aucun soigneur n'est spécialisé pour s'occuper d'un " + espece + " !");
            }
        }
    }

}



