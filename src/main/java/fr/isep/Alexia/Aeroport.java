public class Main {
    public static void main(String[] args) {
        // Création d'un aéroport
        Aeroport aeroport = new Aeroport("Charles de Gaulle", "Paris", "Le plus grand aéroport de France", 12345, "95700 Roissy-en-France", "+33 1 70 36 39 50", "Ouvert");

        // Affichage des informations de l'aéroport
        aeroport.afficher();

        // Mise à jour du statut
        aeroport.setStatut("Fermé temporairement");

        // Affichage après mise à jour
        System.out.println("\nAprès mise à jour :");
        aeroport.afficher();
    }
}
