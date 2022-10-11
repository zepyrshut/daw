package strings;

public class Strings {

    public boolean checkIsPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
