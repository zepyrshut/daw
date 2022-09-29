package proyecto1;

import java.util.Scanner;

public class ComputingLoanPayments {

	public static void main(String[] args) {

		double interestRate;
		int years;
		double loanAmount;
		double monthlyPayment;
		double totalPaid;

		Scanner kb = new Scanner(System.in);
		System.out.println("Interest rate: ");
		interestRate = kb.nextDouble();

		System.out.println("Years: ");
		years = kb.nextInt();

		System.out.println("Loan amount: ");
		loanAmount = kb.nextDouble();

		monthlyPayment = loanAmount * interestRate / 1200 / (1 - 1 / Math.pow(1 + interestRate / 1200, years * 12));
		totalPaid = monthlyPayment * years * 12;

		System.out.printf("Monthly payment: %.2f\n", monthlyPayment);
		System.out.printf("Total payment: %.2f\n", totalPaid);

	}

}
