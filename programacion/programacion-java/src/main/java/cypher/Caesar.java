package cypher;

public class Caesar {

    public static String caesarEncrypt(String str, int offset) {
        String encrypted = "";
        offset = offset % 26;
        for (int i = 0; i < str.length(); i++) {
            encrypted += (char) (str.charAt(i) + offset);
        }
        return encrypted;
    }

    public static String caesarDecrypt(String str, int offset) {
        String decrypted = "";
        offset = offset % 26;
        for (int i = 0; i < str.length(); i++) {
            decrypted += (char) (str.charAt(i) - offset);
        }
        return decrypted;
    }
}
