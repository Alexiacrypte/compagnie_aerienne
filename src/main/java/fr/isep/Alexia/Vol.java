package fr.isep.Alexia;

public class Vol extends (Reservation, Avion){
    private int NumeroVol, String Origine,
    String Destination, int DateHeureDepart, String Etat,
    int numeroReservation, int dateReservation, String Statut
    String nom, int identification, int adresse, int contact,
    String passeport,
}
      super(NumeroVol,Origine,Destination,
       DateHeureDepart, Etat, Statut, nom, identification, dateReservation,
       numeroReservation, adresse, contact, passeport)

public intNumeroVol  getintNumeroVol(){
    return NumeroVol
}
public StringOrignine getStringOrigine(){
    return Origine
}
public StringDestination getStringDestination(){
    return Destination
}
public intDateHeureDepart getintDateHeureDepart(){
    return DateHeureDepart
}
public intDateHeureArrivee getintDateHeureArrivee(){
    return DateHeueArrivee
}
public StringEtat getStringEtat(){
    return Etat
}
public void setStringOrigine(StringOrigine StringOrigine){
    this.StringOrigine = StringOrigine
}
public void setintNumeroVol(intNumeroVol intNumeroVol){
    this.intNumeroVol = intNumeroVol
}
public void setintDateHeureArrivee(intDateHeureArrivee intDateHeureArrivee){
    this.intDateHeureArrivee = int DateHeureArrivee
}
public void setintDateHeureDepart( intDateHeureDepart intDateHeureDepart){
    this.intDateHeureDepart = IntDateHeureDepart
}
public void setStringDestination( StringDestination StringDestination){
    this.StringDestination = StringDestination
}
public void setStringEtat(StringEtat StringEtat){
    this.StringEtat = StringEtat
}
void Afficher(){
    System.out.println();
    System.out.println();
    Sustem.out.println();
}

package fr.isep.hal;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoCSV {
    public static void main(String[] args) throws IOException {
        var vols = lireCSV();
        //ecrireCSV(vols);
        ecrireCSV_try(vols);
    }

    private static void ecrireCSV(List<Map<String, String>> vols) throws IOException {
        FileWriter fch = new FileWriter("nv_vols.csv");

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(new String[]{"jour", "de", "à", "id", "prévu à"})
        CSVPrinter printer = new CSVPrinter(fch, csvFormat);
        for (var vol : vols) {
            printer.printRecord(
                    vol.get("Date"),
                    vol.get("Dép"),
                    vol.get("Arriv"),
                    vol.get("Code"),
                    vol.get("Heure")
            );
        }

        fch.close(); // Attention, fichier EN ECRITURE non fermé si exception

    }

    private static void ecrireCSV_try(List<Map<String, String>> vols) {

        try (FileWriter fch = new FileWriter("nv_vols.csv")) {

            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .setHeader(new String[]{"jour", "de", "à", "id", "prévu à"})
                    .build();

            CSVPrinter printer = null;
            printer = new CSVPrinter(fch, csvFormat);
            for (var vol : vols) {
                printer.printRecord(
                        vol.get("Date"),
                        vol.get("Dép"),
                        vol.get("Arriv"),
                        vol.get("Code"),
                        vol.get("Heure")
                );
            }

        } catch (IOException e) {
            throw new RuntimeException("Problème...",e);
        }
        // "Close" automatique...
    }

    public static List<Map<String, String>> lireCSV() throws IOException {

        Reader in = new FileReader("./vols.csv");

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(new String[]{"Code", "Dép", "Arriv", "Date", "Heure"})
                .setSkipHeaderRecord(true)
                .setDelimiter('|')
                .setIgnoreSurroundingSpaces(true)
                .build();

        Iterable<CSVRecord> records = csvFormat.parse(in);

        List<Map<String,String>> vols = new ArrayList<>();
        for (CSVRecord record : records) {
            Map<String,String> vol = new HashMap<>();
            vol.put("Code", record.get("Code"));
            vol.put("Dép", record.get("Dép"));
            vol.put("Arriv", record.get("Arriv"));
            vol.put("Date", record.get("Date"));
            vol.put("Heure", record.get("Heure"));
            vols.add(vol);
        }

        in.close();
        //System.out.println(vols);
        return vols;
    }

}
