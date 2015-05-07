import java.io.Console;

public class DoubleIt {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me a number, and I will double it for you!");
    String stringNumber = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber)
    Integer yourDoubledNumber = yourNumber * 2;

    System.out.println("I doubled your number for you: " + yourDoubledNumber);
  }
}
