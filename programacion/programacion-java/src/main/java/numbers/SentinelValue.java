package numbers;

import java.util.Scanner;

public class SentinelValue {

    public static void sentinelValue() {
        System.out.println("The program finish when you enter 0");
        System.out.println("Enter a various numbers: ");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = scanner.nextInt();
        while (input != 0) {
            sum += input;
            input = scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
    }

}
