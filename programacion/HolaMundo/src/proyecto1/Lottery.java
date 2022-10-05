package proyecto1;

import java.util.Scanner;

public class Lottery {

  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);

    int user = kb.nextInt();
    int computer = (int) (Math.random() * 100);

    if (user == computer) {
      System.out.println("primer premio");
    } else {
      int digit1pc = computer / 10;
      int digit2pc = computer % 10;

      int digit1user = user / 10;
      int digit2user = user % 10;

      if (digit1pc == digit2user && digit2pc == digit1user) {
        System.out.println("segundo premio");
      } else if (digit1pc == digit1user || digit1pc == digit2user || digit2pc == digit1user || digit2pc == digit2user) {
        System.out.println("tercer premio");
      } else {
        System.out.println("no hay premio");
      }

    }

  }

  
  
}
