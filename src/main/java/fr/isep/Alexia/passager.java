package fr.isep.Alexia;

// La classe Passager hérite de Personne
public class Passager extends Personne {
    private String passeport;

    // Constructeur
    public Passager(String nom, int identifiant, int adresse, int contact, String passeport) {
        super(nom, identifiant, contact, adresse);
        this.passeport = passeport;
    }

    // Getter pour le passeport
    public String getPasseport() {
        return passeport;
    }

    // Setter pour le passeport
    public void setPasseport(String passeport) {
        this.passeport = passeport;
    }

    // Méthode pour afficher les informations du passager
    @Override
    void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Adresse : " + adresse);
        System.out.println("Contact : " + contact);
        System.out.println("Passeport : " + passeport);
    }
}
