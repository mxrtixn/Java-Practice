package CompteBancaire;
public class Main {
    public static void main(String[] args) {
        // Création d'un compte bancaire avec un solde initial de 100€
        CompteBancaire compte = new CompteBancaire(100);

        // Affichage du solde initial
        System.out.println("Solde initial : " + compte.getSolde() + "MAD");

        // Déposer 50€
        compte.deposer(50);

        // Essayer de retirer 30€
        compte.retirer(30);

        // Essayer de retirer 150€ (doit échouer)
        compte.retirer(150);

        // Affichage du solde final
        System.out.println("Solde final : " + compte.getSolde() + "MAD");
    }
}
