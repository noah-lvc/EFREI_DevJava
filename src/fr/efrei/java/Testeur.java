package fr.efrei.java;

public class Testeur extends Collaborateur{

    public Testeur(String nom, String prenom, double salaire, Adresse adresse){
        super(nom, prenom, salaire, adresse);
    }

    @Override
    public void travailler(){
        System.out.println(prenom + " exécute une campagne de tests.");
    }
}
