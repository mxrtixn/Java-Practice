package CompteBancaire;
public class CompteBancaire {
    private double solde;

    // Constructeur
    public CompteBancaire(double montantInitial) {
        this.solde = montantInitial;
    }

    // Méthode pour obtenir le solde
    public double getSolde() {
        return solde;
    }

    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        solde += montant;
    }

    // Méthode pour retirer de l'argent
    public void retirer(double montant) {
        if (solde >= montant) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant !");
        }
    }
}

