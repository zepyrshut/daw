package numbers;

public class GreatestCommonDivisor {

    public static void findGreatestCommonDivisor(int number1, int number2) {
        int gcd = 1;
        int k = 2;
        while (k <= number1 && k <= number2) {
            if (number1 % k == 0 && number2 % k == 0) {
                gcd = k;
            }
            k++;
        }
        System.out.println("The greatest common divisor for " + number1 + " and " + number2 + " is " + gcd);
    }
}
