package fr.isep.Alexia;

// Classe Pilote qui hérite de Employe
public class Pilote extends Employe {
    private String licence;
    private int heuresDeVol;

    // Constructeur
    public Pilote(String licence, int heuresDeVol, String nom, int identifiant, String adresse, String contact) {
        super(adresse, contact, identifiant, nom); // Appelle le constructeur de la classe Employe
        this.licence = licence;
        this.heuresDeVol = heuresDeVol;
    }

    // Getter pour licence
    public String getLicence() {
        return licence;
    }

    // Setter pour licence
    public void setLicence(String licence) {
        this.licence = licence;
    }

    // Getter pour heuresDeVol
    public int getHeuresDeVol() {
        return heuresDeVol;
    }

    // Setter pour heuresDeVol
    public void setHeuresDeVol(int heuresDeVol) {
        this.heuresDeVol = heuresDeVol;
    }

    // Méthode pour afficher les informations du pilote
    public void afficher() {
        System.out.println("Nom : " + super.getNom());
        System.out.println("Identifiant : " + super.getIdentifiant());
        System.out.println("Adresse : " + super.getAdresse());
        System.out.println("Contact : " + super.getContact());
        System.out.println("Licence : " + this.licence);
        System.out.println("Heures de vol : " + this.heuresDeVol);
    }
}
