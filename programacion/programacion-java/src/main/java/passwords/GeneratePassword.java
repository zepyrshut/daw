package passwords;

public class GeneratePassword {

    public String generatePassword() {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String password = "";
        for (int i = 0; i < 10; i++) {
            //password += (char) (Math.random() * 25 + 97);
            password +=  chars.charAt((int)(Math.random() * chars.length()));
        }
        return password;
    }

}
