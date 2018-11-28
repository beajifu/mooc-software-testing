package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    public void twoDigitsPerNumberUnderHundred() {
        ArrayList<Integer> firstNum = new ArrayList<>();
        firstNum.add(1);
        firstNum.add(2);
        ArrayList<Integer> secondNum = new ArrayList<>();
        secondNum.add(1);
        secondNum.add(3);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum,secondNum);

        ArrayList<Integer> expectedNum = new ArrayList<>();
        expectedNum.add(2);
        expectedNum.add(5);
        Assertions.assertEquals(expectedNum, result);
    }

    @Test
    public void twoDigitsPerNumberOverHundred() {
        ArrayList<Integer> firstNum = new ArrayList<>();
        firstNum.add(4);
        firstNum.add(5);
        ArrayList<Integer> secondNum = new ArrayList<>();
        secondNum.add(6);
        secondNum.add(0);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum,secondNum);

        ArrayList<Integer> expectedNum = new ArrayList<>();
        expectedNum.add(1);
        expectedNum.add(0);
        expectedNum.add(5);
        Assertions.assertEquals(expectedNum, result);
    }
    @Test
    public void oneDigitPerNumUnderTen() {
        ArrayList<Integer> firstNum = new ArrayList<>();
        firstNum.add(4);
        ArrayList<Integer> secondNum = new ArrayList<>();
        secondNum.add(5);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum,secondNum);

        ArrayList<Integer> expectedNum = new ArrayList<>();
        expectedNum.add(9);
        Assertions.assertEquals(expectedNum, result);
    }

    @Test
    public void oneDigitPerNumOverTen() {
        ArrayList<Integer> firstNum = new ArrayList<>();
        firstNum.add(4);
        ArrayList<Integer> secondNum = new ArrayList<>();
        secondNum.add(7);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum,secondNum);

        ArrayList<Integer> expectedNum = new ArrayList<>();
        expectedNum.add(1);
        expectedNum.add(1);
        Assertions.assertEquals(expectedNum, result);
    }

    @Test
    public void oneDigitFirstNumTwoDigitsSecNum() {
        ArrayList<Integer> firstNum = new ArrayList<>();
        firstNum.add(4);
        ArrayList<Integer> secondNum = new ArrayList<>();
        secondNum.add(5);
        secondNum.add(5);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum,secondNum);

        ArrayList<Integer> expectedNum = new ArrayList<>();
        expectedNum.add(5);
        expectedNum.add(9);
        Assertions.assertEquals(expectedNum, result);
    }

    @Test
    public void twoDigitFirstNumOneDigitsSecNum() {
        ArrayList<Integer> firstNum = new ArrayList<>();
        firstNum.add(5);
        firstNum.add(5);
        ArrayList<Integer> secondNum = new ArrayList<>();
        secondNum.add(4);
        ArrayList<Integer> result = new TwoNumbersSum().addTwoNumbers(firstNum,secondNum);

        ArrayList<Integer> expectedNum = new ArrayList<>();
        expectedNum.add(5);
        expectedNum.add(9);
        Assertions.assertEquals(expectedNum, result);
    }
}
