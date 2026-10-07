package fr.efrei.java;

import java.util.Scanner;

public class Programmeur extends Collaborateur implements Formateur{

    String languePreferee;

    public Programmeur(String nom, String prenom, String languePreferee, double salaire, Adresse adresse) {
        super(nom, prenom, salaire, adresse);
        this.languePreferee = languePreferee;
    }

    public Programmeur(Scanner scanner){
        scanner.nextLine();

        System.out.println("Entrez le nom");
        String nom = scanner.nextLine();

        System.out.println("Entrez le prenom");
        String prenom = scanner.nextLine();

        System.out.println("Entrez le language préféré");
        this.languePreferee = scanner.nextLine();

        System.out.println("Entrez le salaire");
        double salaire = scanner.nextDouble();

        super(nom, prenom, salaire, new Adresse(scanner));
    }

    public void augmenterSalaire(double augmentation){
        salaire += salaire * (augmentation /100);
        if (salaire < 0) {
            salaire = 0;
        }
    }

    @Override
    public void former(){

    }

    @Override
    public void travailler(){
        System.out.println(prenom + " développe une fonctionnalité.");
    }

    public String getLanguePreferee() {
        return languePreferee;
    }

    public void setLanguePreferee(String languePreferee) {
        this.languePreferee = languePreferee;
    }
}
