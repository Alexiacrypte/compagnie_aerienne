package fr.isep.Alexia;

// La classe PersonnelCabine hérite de Employe
public class PersonnelCabine extends Employe {
    private String qualification;

    // Constructeur
    public PersonnelCabine(String nom, int identifiant, int adresse, int contact, int numeroEmploye, int dateEmbauche, String qualification) {
        super(nom, identifiant, adresse, contact, numeroEmploye, dateEmbauche);
        this.qualification = qualification;
    }

    // Getter pour la qualification
    public String getQualification() {
        return qualification;
    }

    // Setter pour la qualification
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    // Implémentation de la méthode afficher
    @Override
    void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Adresse : " + adresse);
        System.out.println("Contact : " + contact);
        System.out.println("Numéro Employé : " + numeroEmploye);
        System.out.println("Date d'embauche : " + dateEmbauche);
        System.out.println("Qualification : " + qualification);
    }
}
