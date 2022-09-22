package proyecto1;

import java.util.Scanner;

public class RemainingSeconds {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca el tiempo en segundos: ");
		int time = input.nextInt();

		int minutes = time / 60;
		int seconds = time % 60;

		
		System.out.printf("The time is %d:%d\n", minutes, seconds);
		
	}

}
