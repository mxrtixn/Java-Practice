import java.util.ArrayList;

public class Responsable extends Employe {
    private ArrayList<Employe> inferieurs;

    // Constructeur
    public Responsable(String nom, String matricule, double indiceSalarial) {
        super(nom, matricule, indiceSalarial);
        this.inferieurs = new ArrayList<>();
    }

    // Ajouter un employé sous la supervision du responsable
    public void ajouterInferieur(Employe e) {
        inferieurs.add(e);
    }

    // Méthode pour afficher les employés sous la supervision
    public void afficherInferieursDirects() {
        if (inferieurs.isEmpty()) {
            System.out.println("Aucun employé sous la supervision de ce responsable.");
        } else {
            System.out.println("Employés sous la supervision de ce responsable :");
            for (Employe e : inferieurs) {
                System.out.println("- " + e.getNom() + " (Matricule : " + e.getMatricule() + ")");
            }
        }
    }

    // Redéfinition de la méthode afficherCaracteristiques()
    @Override
    public void afficherCaracteristiques() {
        super.afficherCaracteristiques();
        System.out.println("Rôle : Responsable");
        afficherInferieursDirects();
    }

    // Getters pour accéder aux informations des employés dans la sous-classe
    public String getNom() {
        return super.toString().split(":")[1].split(",")[0].trim();
    }

    public String getMatricule() {
        return super.toString().split(":")[2].split(",")[0].trim();
    }
}
