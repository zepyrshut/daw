package numbers;

import java.util.Scanner;

public class SentinelValue {

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

}
