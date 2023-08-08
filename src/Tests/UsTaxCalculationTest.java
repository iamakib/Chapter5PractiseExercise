package Tests;

import TaxCalculation.UsTaxCalculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsTaxCalculationTest {

    UsTaxCalculation usTaxCalculation;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        usTaxCalculation = new UsTaxCalculation(80000,2);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    void tes1(){
        assertEquals(10400.0,usTaxCalculation.getTax());
    }
}