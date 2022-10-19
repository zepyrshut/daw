package numbers;

public class DecToHex {

    public static String decToHex(int number) {
        String hex = "";
        while (number != 0) {
            int hexValue = number % 16;
            //char hexDigit = (hexValue <= 9 && hexValue >= 0) ? (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');
            char hexDigit;
            if (hexValue <= 9 && hexValue >= 0) {
                hexDigit = (char)(hexValue + '0');
            } else {
                hexDigit = (char)(hexValue - 10 + 'A');
            }
            hex = hexDigit + hex;
            number = number / 16;
        }
        return hex;
    }

}
