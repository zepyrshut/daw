package proyecto1;

import java.math.BigDecimal;
import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		System.out.println("Introduzca una cantidad expresadas en euros: ");
		BigDecimal quantityBuiBigDecimal = kb.nextBigDecimal();
		double quantityDouble = quantityBuiBigDecimal.doubleValue();

		double quantity = quantityDouble * 100;
		int remainingAmount = (int) quantity;

		int[] denominations = { 200, 100, 50, 20, 10, 5, 2, 1 };

		for (int denomination : denominations) {
			int numberOfCoins = remainingAmount / denomination;
			remainingAmount = remainingAmount % denomination;
			System.out.println(numberOfCoins + " " + denomination / 100.0);
		}
	}
}
