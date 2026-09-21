public class Programmeur {

    String nomAlice;
    String prenomAlice;
    String languePreferee;
    double salaire;

    public Programmeur(String nomAlice, String prenomAlice, String languePreferee, double salaire) {
        this.nomAlice = nomAlice;
        this.prenomAlice = prenomAlice;
        this.languePreferee = languePreferee;
        this.salaire = salaire;
    }

    void afficher(){
        System.out.println("Prénom : " + prenomAlice);
    }
}
