package fr.efrei.java;

import java.util.Objects;

public abstract class Collaborateur{
    protected String nom;
    protected String prenom;
    protected double salaire;
    protected Adresse adresse;

    public Collaborateur(String nom, String prenom, double salaire, Adresse adresse) {

        verifierNom(nom);
        verifierSalaire(salaire);

        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
        this.adresse = adresse;
    }

    private void verifierNom(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom est obligatoire");
        }
    }

    private void verifierSalaire(double salaire){
        if (salaire < 0) {
            throw new IllegalArgumentException("Le salaire ne peut pas être négatif");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        verifierNom(nom);
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    abstract void travailler();

    void afficher(){
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Salaire : " + salaire);
        System.out.println("Adresse : " + adresse.toString());
        System.out.println();
    }
}
