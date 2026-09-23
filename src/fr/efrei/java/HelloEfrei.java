package fr.efrei.java;

import java.util.Scanner;

public class HelloEfrei {

    static void main() {

        //String nomAlice = "Martin";
        //String prenomAlice = "Alice";
        //String languePreferee = "Java";
        //double salaire = 42000;

        //System.out.println("Prénom " + prenomAlice + " Nom " + nomAlice);

        Programmeur alice =
                new Programmeur("Martin", "Alice", "Java", 42000);
        Programmeur alex =
                new Programmeur("Dupont", "Aex", "Python", 45000);

        //alice.afficher();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le nom");
        String nom = scanner.nextLine();

        System.out.println("Entrez le prenom");
        String prenom = scanner.nextLine();

        System.out.println("Entrez le language préféré");
        String language = scanner.nextLine();

        System.out.println("Entrez le salaire");
        double salaire = scanner.nextDouble();

        Programmeur progrmmeur = new Programmeur(nom, prenom, language, salaire);
        progrmmeur.afficher();
    }
}
