package Zoo;

import Entite.Animaux;
import Entite.Visiteur;

import java.util.Scanner;

import static Zoo.GestionZoo.*;


public class visiterZoo {
    private static Scanner clavier = new Scanner(System.in);


protected static void visiterZoo() {
    System.out.println("vous devez payer votre billet d'entrer .");
     prixZoo();
visiteur();
Animalvisiteur();





}




static void visiteur (){
    System.out.println("quel est votre nom?");
    String nom = clavier.nextLine().trim();
    System.out.println("quel est votre prenom?");
    String prenom = clavier.nextLine().trim();
    int age = ageVisiteur;
    System.out.println("vous avez donc " + age + "ans");



    Visiteur visiteurr = new Visiteur(nom, prenom, age);
    String cle = nom + " " + prenom ;
    GestionZoo.ajouterVisiteur(cle, visiteurr);
    GestionZoo.affichervisiteur();
}

static void Animalvisiteur (){
    System.out.println("Quel animal souhaitez-vous observer ?");
    String nomAnimal = clavier.nextLine().trim().toLowerCase();

    if (GestionZoo.getAnimaux().containsKey(nomAnimal)) {

        Animaux animal = GestionZoo.getAnimaux().get(nomAnimal);
        animal.afficher();
    } else {
        System.out.println("Cet animal n'est pas disponible.");
    }
}

public static int ageVisiteur;

static void  prixZoo () {

    System.out.println("Quel âge avez-vous ?");
    String ageStr = clavier.nextLine();
    ageVisiteur = Integer.parseInt(ageStr);


    if (ageVisiteur < 16) {
        System.out.println("Vous devez payer la somme de " + GestionZoo.prixbilletEnfant + " euros.");
        double soldeFinal = GestionZoo.soldeVisiteur - GestionZoo.prixbilletEnfant;
        System.out.println("Il vous reste maintenant " + GestionZoo.soldeVisiteur + " - " + GestionZoo.prixbilletEnfant + " = " + soldeFinal);
        GestionZoo.soldeVisiteur = soldeFinal;
        GestionZoo.soldeZoo = GestionZoo.soldeZoo + GestionZoo.prixbilletEnfant;
    } else {
        System.out.println("Vous devez payer la somme de " + GestionZoo.prixbilletAdulte + " euros.");
        double soldeFinalAdulte = GestionZoo.soldeVisiteur - GestionZoo.prixbilletAdulte;
        System.out.println("Il vous reste maintenant " + GestionZoo.soldeVisiteur + " - " + GestionZoo.prixbilletAdulte + " = " + soldeFinalAdulte);
        GestionZoo.soldeVisiteur = soldeFinalAdulte;
        GestionZoo.soldeZoo = GestionZoo.soldeZoo + GestionZoo.prixbilletAdulte;
    }

}
}