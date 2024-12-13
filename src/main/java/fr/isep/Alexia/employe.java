package fr.isep.Alexia;

// Classe abstraite Employe qui hérite de Personne
abstract class Employe extends Personne {
    protected int numeroEmploye;
    protected int dateEmbauche;

    // Constructeur
    protected Employe(String nom, int identifiant, int adresse, int contact, int numeroEmploye, int dateEmbauche) {
        super(nom, identifiant, contact, adresse);
        this.numeroEmploye = numeroEmploye;
        this.dateEmbauche = dateEmbauche;
    }

    // Getters
    protected int getDateEmbauche() {
        return dateEmbauche;
    }

    protected int getNumeroEmploye() {
        return numeroEmploye;
    }

    // Setters
    protected void setDateEmbauche(int dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    protected void setNumeroEmploye(int numeroEmploye) {
        this.numeroEmploye = numeroEmploye;
    }

    // Méthode abstraite
    @Override
    abstract void afficher();
}
