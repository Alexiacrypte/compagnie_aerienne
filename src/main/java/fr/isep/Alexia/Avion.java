package fr.isep.Alexia;

// La classe Avion hérite de Vol
public class Avion extends Vol {
    private int immatriculation;
    private String modele;
    private String capacite;

    // Constructeur
    public Avion(int immatriculation, String modele, String capacite, String destination, String origine,
                 int numeroVol, String etat, int dateHeureArrivee, int dateHeureDepart) {
        super(numeroVol, origine, destination, dateHeureDepart, dateHeureArrivee, etat);
        this.immatriculation = immatriculation;
        this.modele = modele;
        this.capacite = capacite;
    }

    // Getters
    public int getImmatriculation() {
        return immatriculation;
    }

    public String getModele() {
        return modele;
    }

    public String getCapacite() {
        return capacite;
    }

    // Setters
    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    // Méthode pour afficher les informations de l'avion
    @Override
    void afficher() {
        System.out.println("Immatriculation : " + immatriculation);
        System.out.println("Modèle : " + modele);
        System.out.println("Capacité : " + capacite);
        System.out.println("Destination : " + getDestination());
        System.out.println("Origine : " + getOrigine());
        System.out.println("Numéro de vol : " + getNumeroVol());
        System.out.println("État : " + getEtat());
        System.out.println("Date et heure d'arrivée : " + getDateHeureArrivee());
        System.out.println("Date et heure de départ : " + getDateHeureDepart());
    }
}
