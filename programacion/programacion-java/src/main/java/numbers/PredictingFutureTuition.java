package numbers;

public class PredictingFutureTuition {

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
}
