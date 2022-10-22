package numbers;

import java.util.Scanner;

public class Numbers {

    public int[] firstFiftyOddNumbers() {
        int[] oddNumbers = new int[25];
        int counter = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                oddNumbers[counter] = i;
                counter++;
            }
        }
        return oddNumbers;
    }

    public int[] firstFiftyEvenNumbers() {
        int[] evenNumbers = new int[25];
        int counter = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                evenNumbers[counter] = i;
                counter++;
            }
        }
        return evenNumbers;
    }

    public boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void getFirstFiftyPrimeNumbers() {
        int count = 0;
        int number = 2;
        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static void predictingFutureTuition(double tuition, double rate) {
        int year = 0;
        int doubled = (int) (tuition * 2);
        while (tuition < doubled) {
            tuition = tuition * (1 + rate / 100);
            year++;
        }
        System.out.println("Tuition will be doubled in " + year + " years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition, year);
    }

    public static void biggestNumber() {
        int number;
        int biggest = 0;
        int times = 0;
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter 40 numbers: ");
        for (int i = 0; i < 40; i++) {
            number = kb.nextInt();
            if (number > biggest) {
                biggest = number;
                times = 1;
            } else if (number == biggest) {
                times++;
            }
        }
        System.out.println("The biggest number is " + biggest);
        System.out.println("The biggest number is repeated " + times + " times");
    }

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

    public static int hexToDec(String hex) {
        int dec = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            dec = dec * 16 + hexCharToDec(hexChar);
        }
        return dec;
    }

    public static int hexCharToDec(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else {
            return ch - '0';
        }
    }

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

    public static void sentinelValue() {
        System.out.println("The program finish when you enter 0.");
        System.out.println("Enter a various numbers, one by one: ");
        Scanner kb = new Scanner(System.in);
        int sum = 0;
        int input = kb.nextInt();
        while (input != 0) {
            sum += input;
            input = kb.nextInt();
        }
        System.out.println("Total is " + sum);
    }

    // fibonacci series
    public static void fibonacciSeries(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.print(n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
