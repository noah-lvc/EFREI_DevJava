package fr.efrei.java;

import java.util.*;

public class HelloEfrei {

    static void main(String[] args) {

        Adresse adresse =
                new Adresse("12 Rue des Lilas", 75000, "Paris", "France");

        Map<String, Collaborateur> collaborateurs = new HashMap<>();

        Programmeur alice =
                new Programmeur("Martin", "Alice", "Java", 100, adresse);

        Programmeur alex =
                new Programmeur("Dupont", "Alex", "Python", 45000, adresse);

        Testeur chloe =
                new Testeur("Femme", "Chloé", 55000, adresse);

        collaborateurs.put("C001",alice);
        collaborateurs.put("C002", alex);
        collaborateurs.put("C003", chloe);

        afficherCollaborateurs(collaborateurs);
        Collaborateur resultat;
        resultat = rechercherParId(collaborateurs, "C001");
        resultat.afficher();
        /*
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
                        Programmeur programmeur = new Programmeur(scanner);
                        programmeur.afficher();
                        break;
                    }
                    case 4: {

                    }
                    case 0:
                        return;
                    default:
                        System.out.println("Choix invalide");
                        break;

                }
            }
            */
        }

    public static Collaborateur rechercherParId(Map<String, Collaborateur> collaborateurs, String id) {
        return collaborateurs.get(id);
    }

    public static void afficherCollaborateurs(Map<String, Collaborateur> collaborateurs) {
        for (Collaborateur c : collaborateurs.values()) {
            c.afficher();
        }
    }



    public static void init_menu(){
            System.out.println("""
                    ========================
                    GESTION DES PROGRAMMEURS
                    ========================
                    
                    1- Afficher Alice
                    2- Afficher Alex
                    3- Ajouter Collaborateur
                    4- Augmenter Salaire
                    0- Quitter
                    
                    Votre Choix :\s""");
        }
}
