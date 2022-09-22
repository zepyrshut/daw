package proyecto1;

public class ConvertingTemperatures {

  public static void main(String[] args) {

    float temperatureInt = Float.parseFloat(args[0]);

    if (args[1].equals("F")) {
      System.out.println((5.0 / 9) * (temperatureInt - 32));
    }
    if (args[1].equals("C")) {
      System.out.println((temperatureInt * 9.0 / 5) + 32);
    }

  }

}
