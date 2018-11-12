package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {
    @ParameterizedTest(name="message={0}, shift={1}, expectedResult={2}")
    @CsvSource({"abc,0,abc","abc def,0,abc def"})
    public void shiftIsZero(String message, int shift ,String expectedResult){
        String result = new CaesarShiftCipher().caesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="message={0}, shift={1}, expectedResult={2}")
    @CsvSource({"abc,1,bcd","abc def,1,bcd efg"})
    public void shiftIsPositive(String message, int shift ,String expectedResult){
        String result = new CaesarShiftCipher().caesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="message={0}, shift={1}, expectedResult={2}")
    @CsvSource({"abc,-1,zab","abc def,-1,zab cde"})
    public void shiftIsNegative(String message, int shift ,String expectedResult){
        String result = new CaesarShiftCipher().caesarShiftCipher(message,shift);
        Assertions.assertEquals(expectedResult,result);
    }
}
