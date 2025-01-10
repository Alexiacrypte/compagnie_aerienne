package fr.isep.Alexia;

public class Vol {
    private int numeroVol;
    private String origine;
    private String destination;
    private String dateHeureDepart;
    private String dateHeureArrivee;
    private String etat;

    public Vol(int numeroVol, String origine, String destination, String dateHeureDepart, String dateHeureArrivee, String etat) {
        this.numeroVol = numeroVol;
        this.origine = origine;
        this.destination = destination;
        this.dateHeureDepart = dateHeureDepart;
        this.dateHeureArrivee = dateHeureArrivee;
        this.etat = etat;
    }

    // Getters et Setters
    public int getNumeroVol() { return numeroVol; }
    public void setNumeroVol(int numeroVol) { this.numeroVol = numeroVol; }

    public String getOrigine() { return origine; }
    public void setOrigine(String origine) { this.origine = origine; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    public String getDateHeureDepart() { return dateHeureDepart; }
    public void setDateHeureDepart(String dateHeureDepart) { this.dateHeureDepart = dateHeureDepart; }

    public String getDateHeureArrivee() { return dateHeureArrivee; }
    public void setDateHeureArrivee(String dateHeureArrivee) { this.dateHeureArrivee = dateHeureArrivee; }

    public String getEtat() { return etat; }
    public void setEtat(String etat) { this.etat = etat; }

    public void afficher() {
        System.out.println("Numéro de vol : " + numeroVol);
        System.out.println("Origine : " + origine);
        System.out.println("Destination : " + destination);
        System.out.println("Départ : " + dateHeureDepart);
        System.out.println("Arrivée : " + dateHeureArrivee);
        System.out.println("État : " + etat);
    }
}
package fr.isep.hal;

import fr.isep.Alexia.Vol;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class DemoCSV {
    public static void main(String[] args) throws IOException {
        List<Vol> vols = lireCSV();
        ecrireCSV(vols);
        ecrireCSV_try(vols);
    }

    // Méthode pour écrire les vols dans un fichier CSV
    private static void ecrireCSV(List<Vol> vols) throws IOException {
        FileWriter fch = new FileWriter("nv_vols.csv");

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader("Numéro", "Origine", "Destination", "Départ", "Arrivée", "État")
                .build();

        try (CSVPrinter printer = new CSVPrinter(fch, csvFormat)) {
            for (Vol vol : vols) {
                printer.printRecord(
                        vol.getNumeroVol(),
                        vol.getOrigine(),
                        vol.getDestination(),
                        vol.getDateHeureDepart(),
                        vol.getDateHeureArrivee(),
                        vol.getEtat()
                );
            }
        }
    }

    // Méthode pour lire les vols depuis un fichier CSV
    public static List<Vol> lireCSV() throws IOException {
        Reader in = new FileReader("./vols.csv");

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader("Numéro", "Origine", "Destination", "Départ", "Arrivée", "État")
                .setSkipHeaderRecord(true)
                .setDelimiter('|')
                .setIgnoreSurroundingSpaces(true)
                .build();

        Iterable<CSVRecord> records = csvFormat.parse(in);

        List<Vol> vols = new ArrayList<>();
        for (CSVRecord record : records) {
            try {
                int numero = Integer.parseInt(record.get("Numéro"));
                String origine = record.get("Origine");
                String destination = record.get("Destination");
                String depart = record.get("Départ");
                String arrivee = record.get("Arrivée");
                String etat = record.get("État");

                vols.add(new Vol(numero, origine, destination, depart, arrivee, etat));
            } catch (Exception e) {
                System.err.println("Erreur lors de la lecture d'une ligne : " + e.getMessage());
            }
        }

        in.close();
        return vols;
    }

    // Méthode pour écrire les vols avec `try-with-resources`
    private static void ecrireCSV_try(List<Vol> vols) {
        try (FileWriter fch = new FileWriter("nv_vols_try.csv");
             CSVPrinter printer = new CSVPrinter(fch, CSVFormat.DEFAULT.builder()
                     .setHeader("Numéro", "Origine", "Destination", "Départ", "Arrivée", "État")
                     .build())) {

            for (Vol vol : vols) {
                printer.printRecord(
                        vol.getNumeroVol(),
                        vol.getOrigine(),
                        vol.getDestination(),
                        vol.getDateHeureDepart(),
                        vol.getDateHeureArrivee(),
                        vol.getEtat()
                );
            }

        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture : " + e.getMessage());
        }
    }
}
volerrrrrrrr