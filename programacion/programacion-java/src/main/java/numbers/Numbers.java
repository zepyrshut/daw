package numbers;

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

}
