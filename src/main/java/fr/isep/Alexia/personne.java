package fr.isep.Alexia;
abstract class Personne {
    protected String nom;
    int identifiant;
    int adresse;
    int contact;

    protected Personne(String nom, int identifiant, int contact, int adresse) {
        this.nom = nom;
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.contact = contact;
    }

    protected String getNom() {
        return nom;
    }

    protected int Adresse() {
        return adresse;
    }

    protected int Identifiant() {
        return identifiant;
    }

    protected int Contact() {
        return contact;
    }

    protected void setNom(String nom) {
        this.nom = nom;
    }

    ;

    protected void setAdresse(int adresse) {
        this.adresse = adresse;
    }

    ;

    protected void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    ;

    protected void setContact(int contact) {
        this.contact = contact;
    }

    ;

    //alexia
    abstract void Afficher();
}