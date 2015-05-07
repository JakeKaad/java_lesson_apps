import java.io.Console;

public class AlwaysOne {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("Give me any number!");
    System.out.println("I will magically turn that number into 1!");
    String stringNumber = myConsole.readLine();

    Integer yourNumber = Integer.parseInt(stringNumber);
    Integer theNumberOne = yourNumber / yourNumber;

    System.out.println("Here it is: " + theNumberOne);
  }
}
