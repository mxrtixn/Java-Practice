package exercice1;
public class CompteBancaire {
    private double solde;

    // Constructeur
    public CompteBancaire(double montantInitial) {
        if (montantInitial >= 0) {
            this.solde = montantInitial;
        } else {
            System.out.println("Montant initial invalide, solde mis à 0.");
            this.solde = 0;
        }
    }

    // Accesseur (getter)
    public double getSolde() {
        return solde;
    }

    // Mutateur (setter) avec vérification
    public void setSolde(double solde) {
        if (solde >= 0) {
            this.solde = solde;
        } else {
            System.out.println("Le solde ne peut pas être négatif.");
        }
    }

    // Déposer de l'argent
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println(montant + "MAD déposé. Nouveau solde : " + solde + "MAD");
        } else {
            System.out.println("Montant invalide pour le dépôt.");
        }
    }

    // Retirer de l'argent
    public void retirer(double montant) {
        if (montant > 0 && montant <= solde) {
            solde -= montant;
            System.out.println(montant + "MAD retiré. Nouveau solde : " + solde + "MAD");
        } else {
            System.out.println("Retrait impossible. Solde insuffisant ou montant invalide.");
        }
    }
}
