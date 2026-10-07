package fr.efrei.java;

import java.util.Scanner;

public class Adresse {
    private String rue;
    private int codePostal;
    private String ville;
    private String pays;

    public Adresse(String rue, int codePostal, String ville, String pays){
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
        this.pays = pays;
    }

    public Adresse(Scanner scanner){
        scanner.nextLine();
        System.out.println("Entrez la rue : ");
        this.rue = scanner.nextLine();

        System.out.println("Entrez le code postal : ");
        this.codePostal = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entrez la ville : ");
        this.ville = scanner.nextLine();

        System.out.println("Entrez le pays");
        this.pays = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue  +
                ", codePostal=" + codePostal +
                ", ville='" + ville +
                ", pays='" + pays +
                '}';
    }
}
