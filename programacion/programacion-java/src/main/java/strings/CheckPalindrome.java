package strings;

public class CheckPalindrome {

    public static boolean checkIfPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i - 1))
                return false;
        }
        return true;
    }



}
