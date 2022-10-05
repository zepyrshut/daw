package proyecto1;

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {

    // determine if year is a leap year
    Scanner kb = new Scanner(System.in);

    System.out.println("Enter a year: ");
    int year = kb.nextInt();

    boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    System.out.println(year + " is a leap year? " + isLeapYear);

  }

}
