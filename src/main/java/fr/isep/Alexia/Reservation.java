package fr.isep.Alexia;

public class Reservation extends Passager{
    private int numeroReservation,
    int dateReservation, String statut
    public class Reservation{
        int numeroReservation, int dateReservation,
        int identifiant, int adresse, int contact,
        String passeport, String nom, String statut
    }
    super(numeroReservation, dateReservation, nom, identifiant,
    adresse, contact, passeport, statut )
}
public intNumeroReservation  getintNumeroReservation(){
    return NumeroReservation
}
public intReservation getintReservation(){
    return Reservation
}
public Stringstatut getStringstatut(){
    return statut
}
public void setintNumeroReservation(intNumeroReservation){
    this.intNumeroReservation = intNumeroReservation
}
public void seetintReservation(intResevation intReservation){
    this.intReservation = intReservation
}
public void setStringstatut(Stringstatut Stringstatut){
    this.Stringstatut = Stringstatut
}
void Afficher(){
    System.out.println();
    System.out.println();
    System.out.println();
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
        var reservations = lireCSV();
        //ecrireCSV(reservaions);
        ecrireCSV_try(reservation);
    }

    private static void ecrireCSV(List<Map<String, String>> reservations) throws IOException {
        FileWriter fch = new FileWriter("nv_reservations.csv");

        CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                .setHeader(new String[]{"jour", "de", "à", "id", "prévu à"})
                .build();

        CSVPrinter printer = new CSVPrinter(fch, csvFormat);
        for (var reservation : reservations) {
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

    private static void ecrireCSV_try(List<Map<String, String>> reservations) {

        try (FileWriter fch = new FileWriter("nv_reservations.csv")) {

            CSVFormat csvFormat = CSVFormat.DEFAULT.builder()
                    .setHeader(new String[]{"jour", "de", "à", "id", "prévu à"})
                    .build();

            CSVPrinter printer = null;
            printer = new CSVPrinter(fch, csvFormat);
            for (var reservation : reservations) {
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

        Reader in = new FileReader("./reservations.csv");

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
            vols.add(reservation);
        }

        in.close();
        //System.out.println(reservations);
        return reservations;
    }

}

