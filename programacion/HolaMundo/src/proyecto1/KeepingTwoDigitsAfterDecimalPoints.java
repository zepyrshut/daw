package proyecto1;

import java.text.DecimalFormat;

public class KeepingTwoDigitsAfterDecimalPoints {

	private static final DecimalFormat df = new DecimalFormat("0.00");

	public static void main(String[] args) {

		// con casting
		double tax = 21.00;
		double price = 12.50;

		double priceWithTax = ((price * tax) / 100) + price;
		
		//double priceWithTax = price * 1.21;

		//df.setRoundingMode(RoundingMode.UP);
		
		priceWithTax = Math.round(priceWithTax * 100.0) / 100.0;

		//System.out.println(df.format(priceWithTax));
		System.out.println(priceWithTax);
		

	}

}
