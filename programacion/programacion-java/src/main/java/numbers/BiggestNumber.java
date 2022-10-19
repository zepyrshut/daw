package numbers;

public class BiggestNumber {

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


}
