package proyecto1;

import java.util.Scanner;

public class PaperRockScissors {

  public static void main(String[] args) {

    while (true) {
      int machine = (int) (Math.random() * 3);

      Scanner kb = new Scanner(System.in);
      System.out.println("Choose one: paper, rock or scissors!");

      String user = kb.nextLine();

      if (user.equals("paper")) {
        if (machine == 0) {
          System.out.println("draw");
        } else if (machine == 1) {
          System.out.println("you win!");
        } else {
          System.out.println("machine wins");
        }
      } else if (user.equals("rock")) {
        if (machine == 0) {
          System.out.println("machine wins");
        } else if (machine == 1) {
          System.out.println("draw");
        } else {
          System.out.println("you win!");
        }
      } else if (user.equals("scissors")) {
        if (machine == 0) {
          System.out.println("you win!");
        } else if (machine == 1) {
          System.out.println("machine wins");
        } else {
          System.out.println("draw");
        }
      } else {
        System.out.println("input no valid");
      }
    }
  }

}