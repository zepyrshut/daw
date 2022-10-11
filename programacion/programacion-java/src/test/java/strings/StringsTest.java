package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringsTest {

    Strings str = new Strings();

    @Test
    void checkIsPalindrome() {
        assertTrue(str.checkIsPalindrome("aba"));
        assertTrue(str.checkIsPalindrome("aabbaa"));
        assertFalse(str.checkIsPalindrome("abb"));
    }
}