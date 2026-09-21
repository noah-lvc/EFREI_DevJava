public class HelloEfrei {

    static void main() {

        String nomAlice = "Martin";
        String prenomAlice = "Alice";
        String languePreferee = "Java";
        double salaire = 42000;

        //System.out.println("Prénom " + prenomAlice + " Nom " + nomAlice);

        Programmeur alice = new Programmeur("Martin", "Alice", "Java", 42000);
        Programmeur alex = new Programmeur("Dupont", "Aex", "Python", 45000);


        alice.afficher(alex);
    }
}
