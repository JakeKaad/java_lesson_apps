import java.io.Console;

public class LegalAge {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("This application requires you to be old enough to use it.");
    System.out.println("How old are you?");
    Integer userAge = Integer.parseInt( console.readLine() );

    if ( oldEnough(userAge) ) {
      System.out.println("Starting application...");
    } else {
      System.out.println("You are not old enough, shutting down...");
    }
  }

  public static Boolean oldEnough(Integer age) {
      return age > 21;
  }
}
