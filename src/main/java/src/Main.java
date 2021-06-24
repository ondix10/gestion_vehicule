package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {



        Scanner scanPiece = new Scanner(System.in);

        // Demande d'entrée nombre de pièce
        System.out.println("Bienvenue à Ketsia kazadi Mbuyi Corporation");
        System.out.println("Vous desirez ? :");
        System.out.println("1. Trouvez limousines conduites par un chauffeur.");
        System.out.println("2. Afficher les caracteristiques des trajets " +
                "effectués ainsi que les caracteristque de limousines utilisées");
        System.out.println("3. Quitter");

        int decision=scanPiece.nextInt();

        if(decision==2){

            lectureFichier uneRecherche= new lectureFichier();
            uneRecherche.afficherLesCarateristiquesTrajet();




        }


    }


}
