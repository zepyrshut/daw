package proyecto1;

import java.util.Scanner;

public class SimpleMathLearningTool {

	public static void main(String[] args) {


		int numberA = (int)(Math.random() * 10);
		int numberB = (int)(Math.random() * 10);
		
		int result = numberA + numberB;
		
		System.out.printf("Cuánto es %s + %s\n", numberA, numberB);
		
		Scanner kb = new Scanner(System.in);
		int userResult = kb.nextInt();
		
		if (result != userResult) {
			System.out.println("Incorrecto");
		} else {
			System.out.println("Correcto");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
