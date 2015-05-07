import java.io.Console;

public class FavoriteColor {
  public static void main(String[] args) {
    Console console = System.console();

    // First Application
    System.out.println("What is your favorite color?");
    String favoriteColor = console.readLine();
    System.out.println("Your favorite color is " + favoriteColor + "? Me too!");

    // Second half of lesson change println to printf for formatted strings
    console.printf("My favorite color is %s, too! \n", favoriteColor);
    
    // Second Application
    System.out.println("What is your favorite number?");
    String favoriteNumber = console.readLine();

    // Second half of lesson change println to printf for formatted strings
    console.printf("My favorite number is %s, too! \n", favoriteNumber);

    // Make the lesson a little bit more dynamic
    Integer intNumber = Integer.parseInt(favoriteNumber);
    console.printf("My favorite number is %d, so close! \n", (intNumber + 1));
  }
}
