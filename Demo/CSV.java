import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
public class CSV {
    public static void main(String[] args) throws FilenotFoundException {
        lireCVS();
    }

    public static void lireCVS()  throws IOException{
        reader in = new FileReader("./vols.csv");

        CVSFormat cvsformart = CVSFormat.DEFAULT.builder()
                .setHeader(new String[]{"code", "Dép", "Arriv", "Date", "Heure"})
                .setSkipHeaderRecord(true)
                .setDeLimiter('|')
                .setIgnoreSurroundingSpaces(true)
                .build();
        Iterable<CSVRecord> records = cvsFormat.parse(in);

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

        System.out.println(vols);
    }

}





