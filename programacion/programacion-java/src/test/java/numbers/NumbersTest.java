package numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    Numbers numbers = new Numbers();

    @Test
    void firstFiftyOddNumbers() {
        int[] oddNumbers = numbers.firstFiftyOddNumbers();
        assertEquals(25, oddNumbers.length);
        assertEquals(1, oddNumbers[0]);
        assertEquals(21, oddNumbers[10]);
        assertEquals(31, oddNumbers[15]);
        assertEquals(41, oddNumbers[20]);
        assertEquals(49, oddNumbers[24]);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int oddNumber = oddNumbers[25];
        });
    }

    @Test
    void firstFiftyEvenNumbers() {
        int[] evenNumbers = numbers.firstFiftyEvenNumbers();
        assertEquals(25, evenNumbers.length);
        assertEquals(2, evenNumbers[0]);
        assertEquals(10, evenNumbers[4]);
        assertEquals(20, evenNumbers[9]);
        assertEquals(30, evenNumbers[14]);
        assertEquals(40, evenNumbers[19]);
        assertEquals(50, evenNumbers[24]);
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int evenNumber = evenNumbers[26];
        });
    }

    @Test
    void isMultipleOfFive() {
        assertTrue(numbers.isMultipleOfFive(5));
        assertTrue(numbers.isMultipleOfFive(25));
        assertTrue(numbers.isMultipleOfFive(50));
        assertFalse(numbers.isMultipleOfFive(4));
        assertFalse(numbers.isMultipleOfFive(-1));
        assertTrue(numbers.isMultipleOfFive(-5));
    }
}