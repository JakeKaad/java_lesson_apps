import java.io.Console;

public class PingPong {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Let's play Ping-Pong!");
    System.out.println("Give me a number:");
    String myNumber = console.readLine();
    Integer userNumber = Integer.parseInt(myNumber);

    for ( Integer num = 1 ; num < userNumber ; num++ ) {
      if ( num % 15 == 0 ) {
        System.out.println("Ping-Pong");
      } else if ( num % 3 == 0 ) {
        System.out.println("Ping");
      } else if ( num % 5 == 0 ) {
        System.out.println("Pong");
      } else {
        System.out.println(num);
      }
    }
  }
}
