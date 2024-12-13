package fr.isep.Alexia;

// La classe Reservation hérite de Passager
public class Reservation extends Passager {
    // Attributs de la classe Reservation
    private int numeroReservation;
    private String dateReservation; // Utilisation d'une chaîne de caractères pour représenter la date (ou LocalDate si possible)
    private String statut;

    // Constructeur
    public Reservation(int numeroReservation, String dateReservation, int identifiant, String adresse, String contact, String passeport, String nom, String statut) {
        super(identifiant, adresse, contact, passeport, nom); // Appel du constructeur de la classe Passager
        this.numeroReservation = numeroReservation;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    // Getters
    public int getNumeroReservation() {
        return numeroReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public String getStatut() {
        return statut;
    }

    // Setters
    public void setNumeroReservation(int numeroReservation) {
        this.numeroReservation = numeroReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    // Méthode pour afficher les informations de la réservation
    public void afficher() {
        System.out.println("Numéro de réservation : " + numeroReservation);
        System.out.println("Date de réservation : " + dateReservation);
        System.out.println("Statut : " + statut);
        System.out.println("Passager : ");
        super.afficher(); // Affiche les informations du passager
    }
}

