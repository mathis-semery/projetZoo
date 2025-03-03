package Zoo;

import Entite.Animaux;

import java.util.Scanner;





public class visiterZoo {
    private static Scanner clavier = new Scanner(System.in);


protected static void visiterZoo() {
    System.out.println("vous devez payer votre billet d'entrer .");
     prixZoo();



    System.out.println("Quel animal souhaitez-vous observer ?");
    String nomAnimal = clavier.nextLine().trim().toLowerCase();

    if (GestionZoo.getAnimaux().containsKey(nomAnimal)) {

        Animaux animal = GestionZoo.getAnimaux().get(nomAnimal);
        animal.afficher();
    } else {
        System.out.println("Cet animal n'est pas disponible.");
    }
}










static void  prixZoo () {

    System.out.println("Quel âge avez vous");
    String ageVisiteurStr = clavier.nextLine().trim();
    double ageVisiteur = Double.parseDouble(ageVisiteurStr);
    if (ageVisiteur < 16) {
        System.out.println("vous devez payez la somme de" + GestionZoo.prixbilletEnfant + " euros");
        GestionZoo.soldeZoo = GestionZoo.soldeZoo + GestionZoo.prixbilletEnfant;
    }else
        System.out.println("vous devez payez la somme de " + GestionZoo.prixbilletAdulte + " euros");
    GestionZoo.soldeZoo = GestionZoo.soldeZoo + GestionZoo.prixbilletAdulte;

}
}