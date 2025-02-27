public class Employe {
    private String nom;
    private String matricule;
    private double indiceSalarial;
    private static final double SALAIRE_FIXE = 1500; // Salaire de base

    // Constructeur
    public Employe(String nom, String matricule, double indiceSalarial) {
        this.nom = nom;
        this.matricule = matricule;
        this.indiceSalarial = indiceSalarial;
    }

    // Méthode pour calculer le salaire
    public double calculerSalaire() {
        return indiceSalarial * SALAIRE_FIXE;
    }

    // Méthode pour afficher les caractéristiques de l'employé
    public void afficherCaracteristiques() {
        System.out.println("Nom : " + nom);
        System.out.println("Matricule : " + matricule);
        System.out.println("Indice Salarial : " + indiceSalarial);
        System.out.println("Salaire : " + calculerSalaire() + "€");
    }
}
