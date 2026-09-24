package fr.efrei.java;

import java.util.Scanner;

public class HelloEfrei {

    static void main() {

        Programmeur alice =
                new Programmeur("Martin", "Alice", "Java", 100);
        Programmeur alex =
                new Programmeur("Dupont", "Alex", "Python", 45000);


        Scanner scanner = new Scanner(System.in);

            while (true) {
                init_menu();
                int choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        alice.afficher();
                        System.out.println("augmentation de 5%");
                        alice.augmenterSalaire(5);
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
                        scannerProgrammeur.close();
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
            System.out.println("""
                    ========================
                    GESTION DES PROGRAMMEURS
                    ========================
                    
                    1- Afficher Alice
                    2- Afficher Alex
                    3- Ajouter Programmeur
                    0- Quitter
                    
                    Votre Choix :\s""");
        }
}
