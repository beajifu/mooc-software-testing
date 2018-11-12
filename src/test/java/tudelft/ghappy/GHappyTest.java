package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest(name="input={0}, expectedResult={1}")
    @CsvSource({"g,false","gg,true"})
    public void justGs(String g, boolean expectedResult){
        boolean result = new GHappy().gHappy(g);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="input={0}, expectedResult={1}")
    @CsvSource({"xxgxx,false","xxggxx,true"})
    public void xAndGInAString(String g, boolean expectedResult){
        boolean result = new GHappy().gHappy(g);
        Assertions.assertEquals(expectedResult,result);
    }

    @ParameterizedTest(name="input={0}, expectedResult={1}")
    @CsvSource({"xxgxggx,false","xggxggx,true"})
    public void gIsolated(String g, boolean expectedResult){
        boolean result = new GHappy().gHappy(g);
        Assertions.assertEquals(expectedResult,result);
    }


    @ParameterizedTest(name="input={0}, expectedResult={1}")
    @CsvSource({"gxx,false","ggxx,true"})
    public void gAtFirstPosition(String g, boolean expectedResult){
        boolean result = new GHappy().gHappy(g);
        Assertions.assertEquals(expectedResult,result);
    }
}
