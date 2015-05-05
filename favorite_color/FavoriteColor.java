import java.io.Console;

public class FavoriteColor {
  public static void main(String[] args) {
    Console console = System.console();


    System.out.println("What is your favorite color?");
    String color = console.readLine();
    System.out.println("What is your favorite number?");
    String favoriteColor = console.readLine();
    Integer intColor = Integer.parseInt(favoriteColor);

    console.printf("My favorite color is %s, too! \n", color);
    console.printf("My favorite number is %d, so close! \n", (intColor + 1));
  }
}
