package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanToNumTest {
    @Test
    void numWithoutSubstraction(){
        int result = RomanToNum.convert("III");
        Assertions.assertEquals(3,result);
    }

    @Test
    void numWithSubstraction(){
        int result = RomanToNum.convert("IV");
        Assertions.assertEquals(4,result);
    }

    @Test
    void numWithAndWithoutSubstraction(){
        int result = RomanToNum.convert("XIV");
        Assertions.assertEquals(14,result);
    }

    @Test
    @DisplayName("Teste kritischen Wert 49 (doppelte Subtraktion)")
    void criticalValue(){
        int result = RomanToNum.convert("XLIX");
        Assertions.assertEquals(49,result);
    }
}
