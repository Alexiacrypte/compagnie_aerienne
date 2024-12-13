import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PiloteTest {

    @Test
    void testGettersAndSetters() {
        // Création d'un objet Pilote
        Pilote pilote = new Pilote("ABC123", 1500, "John Doe", 1, "10 Rue Exemple", "0123456789");

        // Test des getters
        assertEquals("ABC123", pilote.getLicence());
        assertEquals(1500, pilote.getHeuresDeVol());
        assertEquals("John Doe", pilote.getNom());
        assertEquals(1, pilote.getIdentifiant());
        assertEquals("10 Rue Exemple", pilote.getAdresse());
        assertEquals("0123456789", pilote.getContact());

        // Test des setters
        pilote.setLicence("DEF456");
        pilote.setHeuresDeVol(2000);

        assertEquals("DEF456", pilote.getLicence());
        assertEquals(2000, pilote.getHeuresDeVol());
    }

    @Test
    void testAfficher() {
        // Création d'un objet Pilote
        Pilote pilote = new Pilote("ABC123", 1500, "John Doe", 1, "10 Rue Exemple", "0123456789");

        // Test visuel de la méthode afficher (tu peux remplacer par un mock si besoin)
        pilote.afficher();
    }
}
