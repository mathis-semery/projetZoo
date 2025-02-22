package Entite;

public class Lion extends Animaux {
    public Lion(String nom, String type, Double age, String sexe , String deplacement) {
        super(nom, type, age, sexe , deplacement);

    }

    public void afficherLion() {
        System.out.println("Animal : " + getNom());
        System.out.println("Régime alimentaire : " + getType());
        System.out.println("Âge : " + getAge() + " ans");
        System.out.println("Sexe : " + getSexe());
        System.out.println("Mode de déplacement : " + getDeplacement());

        System.out.println("   \\|\\||\n" +
                "  -' ||||/\n" +
                " /7   |||||/\n" +
                "/    |||||||/`-.____________\n" +
                "\\-' |||||||||               `-._\n" +
                " -|||||||||||               |` -`.\n" +
                "   ||||||               \\   |   `\\\\\n" +
                "    |||||\\  \\______...---\\_  \\    \\\\\n" +
                "       |  \\  \\           | \\  |    ``-.__--.\n" +
                "       |  |\\  \\         / / | |       ``---'\n" +
                "     _/  /_/  /      __/ / _| |\n" +
                "    (,__/(,__/      (,__/ (,__/\n");

    }
    public void SeReproduire() {
        System.out.println("                       \\|\\||    \n" +
                "                      -' ||||/     \n" +
                "                     /7   |||||/       \n" +
                "         |\\_        /    |||||||/`-.____________\n" +
                "       -' | \\       \\-' |||||||||               `-._\n" +
                "      /7     \\       -|||||||||||               `` -`.\n" +
                "     /        `-_      ||||||               \\   |   `\\\\\n" +
                "     \\-'_        `-.____|||||\\  \\______...---\\_  \\    \\\\\n" +
                "      -- \\                 |  \\  \\           | \\  |    ``-.__--.\n" +
                "         /                 |  |\\  \\         / / | |       ``---'\n" +
                " _______/    /_       ____/  /_/  /|_______/ /-_| |\n" +
                "(,__________/  `-.___(,_(,__/(,__/_-----(,__/-(,__/\n");

        System.out.println("ohh il y a un bébé lion !!!");
        System.out.println("     ,-. __ .-,\n" +
                "    --;`. '   `.'\n" +
                "     / (  ^__^  )\n" +
                "    ;   `(_`'_)' \\\n" +
                "    '  ` .`--'_,  ;\n" +
                "  ~~`-..._)))(((.'     Felix Lee \n");

    }
    public void manger(){
        System.out.println("le lion mange de la viande");
        System.out.println("   \\\\|\\\\||\n" +
                "  -' ||||/\n" +
                " /7   |||||/\n" +
                " /    |||||||/`-.____________\n" +
                " \\\\-' |||||||||               `-._\n" +
                "  -|||||||||||               |` -`.\\  \n" +
                "    ||||||               \\\\   |   `\\\\\\\\\n" +
                "     |||||\\\\  \\\\______...---\\\\_  \\\\    \\\\\\\\\n" +
                "        |  \\\\  \\\\           | \\\\  |    ``-.__--.\n" +
                "        |  |\\\\  \\\\         / / | |       ``---'\n" +
                "      _/  /_/  /      __/ / _| |\n" +
                "     (,__/(,__/      (,__/ (,__/\n" +
                "         \uD83C\uDF56\n");
    }
    public void Sedeplacer() {
        System.out.println("le lion marche et court ");
    }
    public void bruit() {
    System.out.println("le lion rugit");
    }
}
