package fr.isep.Alexia;

abstract class Personne {
    // Attributs protégés
    protected String nom;
    protected int identifiant;
    protected int adresse;
    protected int contact;

    // Constructeur
    protected Personne(String nom, int identifiant, int contact, int adresse) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.contact = contact;
        this.adresse = adresse;
    }

    // Getters
    protected String getNom() {
        return nom;
    }

    protected int getAdresse() {
        return adresse;
    }

    protected int getIdentifiant() {
        return identifiant;
    }

    protected int getContact() {
        return contact;
    }

    // Setters
    protected void setNom(String nom) {
        this.nom = nom;
    }

    protected void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    protected void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    protected void setContact(int contact) {
        this.contact = contact;
    }

    // Méthode abstraite pour l'affichage
    abstract void afficher();
}
