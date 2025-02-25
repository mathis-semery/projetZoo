package Zoo;

import Entite.Lion;
import Entite.Soigneur;

import java.util.HashMap;
import java.util.Map;

public class GestionZoo {
    private static Map<String, Lion> animaux = new HashMap<>();
    private  static Map<String, Soigneur> personnel = new HashMap<>();



     static void initialiserAnimaux() {
        animaux.put("lion", new Lion("Lion", "Carnivore", 4.0, "Mâle", "Marche"));

    }

     static void initialiserPersonnel() {
        personnel.put("Soigneur1", new Soigneur("Dena" , "Paul" , 20 , "Lion" ));
    }


    public static Map<String, Soigneur> getPersonnel() {
        return personnel;
    }

    public static Map<String, Lion> getAnimaux() {
        return animaux;
    }
}
