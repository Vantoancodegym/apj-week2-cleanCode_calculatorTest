import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    int firstOperand;
    int secondOperand;
    char ADDITION='+';
    char SUBTRACTION='-';
    char MULTIPLICATION='*';
    char DIVISION='/';

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        firstOperand = 1;
        secondOperand = 1;
        char operator = ADDITION;
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        firstOperand = 2;
        secondOperand = 1;
        char operator = SUBTRACTION;
        int expected = 1;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        firstOperand = 2;
        secondOperand = 2;
        char operator = MULTIPLICATION;
        int expected = 4;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        firstOperand = 6;
        secondOperand = 3;
        char operator = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        firstOperand = 2;
        secondOperand = 0;
        char operator = DIVISION;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand , secondOperand, operator);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        firstOperand = 2;
        secondOperand = 0;
        char operator = '=';

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstOperand, secondOperand, operator);});
    }
}