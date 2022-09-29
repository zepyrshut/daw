package proyecto1;

import java.math.BigDecimal;
import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("Introduzca una cantidad expresadas en euros: ");
		double quantity = kb.nextFloat();
		
		Math.ceil(quantity);

		int remainingAmount = (int) (quantity * 100);
		
		int numberOfTwoEuros = remainingAmount / 200;
		remainingAmount = remainingAmount % 200;
		int numberOfOneEuro = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		int numberOfFiftyCents = remainingAmount / 50;
		remainingAmount = remainingAmount % 50;
		int numberOfTwentyCents = remainingAmount / 20;
		remainingAmount = remainingAmount % 20;
		int numberOfTenCents = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		int numberOfFiveCents = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		int numberOfTwoCents = remainingAmount / 2;
		remainingAmount = remainingAmount % 2;
		int numberOfOneCent = remainingAmount;
		
		System.out.println(numberOfTwoEuros + " 2");
		System.out.println(numberOfOneEuro + " 1");
		System.out.println(numberOfFiftyCents + " 0.50");
		System.out.println(numberOfTwentyCents + " 0.20");
		System.out.println(numberOfTenCents + " 0.10");
		System.out.println(numberOfFiveCents + " 0.05");
		System.out.println(numberOfTwoCents + " 0.02");
		System.out.println(numberOfOneCent + " 0.01");


		System.out.println(quantity);

	}

}
