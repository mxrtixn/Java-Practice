public class Main {
    public static void main(String[] args) {
        // Création d'employés
        Employe e1 = new Employe("Alice Dupont", "E001", 1.2);
        Employe e2 = new Employe("Bob Martin", "E002", 1.5);

        // Création d'un responsable
        Responsable r1 = new Responsable("Charles Durand", "R001", 2.0);

        // Ajout d'employés sous la supervision du responsable
        r1.ajouterInferieur(e1);
        r1.ajouterInferieur(e2);

        // Affichage des caractéristiques des employés et du responsable
        System.out.println("=== Informations des employés ===");
        e1.afficherCaracteristiques();
        System.out.println();
        e2.afficherCaracteristiques();
        System.out.println();

        System.out.println("=== Informations du responsable ===");
        r1.afficherCaracteristiques();
    }
}
