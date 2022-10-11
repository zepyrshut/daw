package proyecto1;

import java.util.Scanner;

public class ConvertHexToDec {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a number: ");

    String hex = kb.nextLine();

    System.out.println("Enter a radix: ");
    int base = kb.nextInt();
    int dec = Integer.parseInt(hex, base);
    System.out.println("The decimal value for hex number " + hex + " is " + dec);

  }
}
