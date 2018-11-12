package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource({"abXYba,ab", "aXYa,a"})
    public void evenCharsAndNonOverlapping(String input, String expectedResult){
        Mirror m = new Mirror();
        String result = m.mirrorEnds(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource({"abXYZba,ab", "aXYZa,a"})
    public void oddCharsAndNonOverlapping(String input, String expectedResult){
        Mirror m = new Mirror();
        String result = m.mirrorEnds(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource({"abba,abba", "aa,aa"})
    public void evenCharsAndOverlapping(String input, String expectedResult){
        Mirror m = new Mirror();
        String result = m.mirrorEnds(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "input={0}, expectedResult={1}")
    @CsvSource({"aba,aba", "a,a"})
    public void oddCharsAndOverlapping(String input, String expectedResult){
        Mirror m = new Mirror();
        String result = m.mirrorEnds(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
