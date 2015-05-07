public class EvenOrOdd {
  public static void main(String[] args) {
    evenOrOdd(2);
    evenOrOdd(51);
    evenOrOdd(23);
    evenOrOdd(92);
    evenOrOdd(1925780);
  }

  public static void evenOrOdd(Integer yourNumber) {
    if ( yourNumber % 2 == 0 ) {
      System.out.println( Integer.toString(yourNumber) + " is even!" );
    } else {
      System.out.println( Integer.toString(yourNumber) + " is odd!");
    }
  }
}
