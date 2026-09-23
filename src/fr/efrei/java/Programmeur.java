package fr.efrei.java;

public class Programmeur {

    String nom;
    String prenom;
    String languePreferee;
    double salaire;

    public Programmeur(String nom, String prenom, String languePreferee, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.languePreferee = languePreferee;
        this.salaire = salaire;
    }

    void afficher(){
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Language : " + languePreferee);
        System.out.println("Salaire : " + salaire);
    }
}
