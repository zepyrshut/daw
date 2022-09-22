package proyecto1;

import java.util.Scanner;

public class ComputeArea {
	
	

	public static void main(String[] args) {
		
		//double radius = Double.parseDouble(args[0]);
		double radius = 20;
		double area;
	
		
		area = Math.pow(radius, 2) * Math.PI;
		
		
		
		System.out.println("Di algo jeje: ");
		Scanner input = new Scanner(System.in);
		String something = input.next();
		
		
		System.out.println(area);
		System.out.println(something);
	
		

		
	}
	

}
