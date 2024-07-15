package calculator;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }
    @Test
    public void testThatCalculatorCanAddTwoNumbers() {
        int result = calc.add(2,3);
        assertEquals(result,5);
    }

    @Test
    public void testThatCalculatorCanAddFourNumbers() {
        int result = calc.add(4,5,2,5);
        assertEquals(result,16);
    }

    @Test
    public void testThatCalculatorCanAddPositiveAndNegativeNumbers() {
    int result = calc.add(2,-3,2,-3);
    assertEquals(result,-2);
    }

//    @Test
////    public void testThatCalculatorCanAddFloatingNumbers() {
////        int result = calc.add(2.5,3.5,2.5,3.5);
////    }
//
}
