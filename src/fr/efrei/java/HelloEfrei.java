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
                new Programmeur("Dupont", "Alex", "Python", 45000);

        //alice.afficher();

        Scanner scanner = new Scanner(System.in);

            while (true) {
                init_menu();
                int choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        alice.afficher();
                        break;
                    case 2:
                        alex.afficher();
                        break;
                    case 3: {
                        Scanner scannerProgrammeur = new Scanner(System.in);

                        System.out.println("Entrez le nom");
                        String nom = scannerProgrammeur.nextLine();

                        System.out.println("Entrez le prenom");
                        String prenom = scannerProgrammeur.nextLine();

                        System.out.println("Entrez le language préféré");
                        String language = scannerProgrammeur.nextLine();

                        System.out.println("Entrez le salaire");
                        double salaire = scannerProgrammeur.nextDouble();

                        Programmeur progrmmeur = new Programmeur(nom, prenom, language, salaire);
                        progrmmeur.afficher();
                        break;
                    }
                    case 0:
                        return;
                    default:
                        System.out.println("Choix invalide");
                        break;

                }

            }
        }
        public static void init_menu(){
            System.out.println("================" +
                    "\nGESTION DES PROGRAMMEURS" +
                    "\n================" +
                    "\n\n1- Afficher Alice" +
                    "\n2- Afficher Alex" +
                    "\n3- Ajouter Programmeur" +
                    "\n0- Quitter" +
                    "\n\nVotre Choix : ");
        }
}
