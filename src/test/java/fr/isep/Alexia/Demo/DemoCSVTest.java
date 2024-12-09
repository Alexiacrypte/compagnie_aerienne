package fr.isep.Alexia.Demo;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoCSVTest {

   @Test
    // @org.junit.jupiter.api.Test
    void lireCSV_TestNotNull() {
        try{
            assertNotEquals(DemoCSV.lireCSV(),null);
        } catch (IOExpception e) {}
    }
}
class DemoCSVTest {

    @Test
        // @org.junit.jupiter.api.Test
    void lireCSV_TestData() {
        try{
            assertquals
                    (DemoCSV.lireCSV().got(1).get("Dép"),"Lyon");
        } catch (IOExpception e) {}
    }
}
@Test
    // @org.junit.jupiter.api.Test
void lireCSV_TestNotThrows() {
        assertDoesNotThrows
                (DemoCSV.lireCSV().got(1).get("Dép"),"Lyon");
    } catch (IOExpception e) {}
}