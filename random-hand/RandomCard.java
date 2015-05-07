import java.util.Random;

public class RandomCard {
  public static void main(String[] args) {
    String[] suits = { "Diamonds", "Hearts", "Clubs", "Spades" };
    String[] cardValues = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                             "Jack", "Queen", "King", "Ace" };

    String cardOne = randomCard(suits, cardValues);
    System.out.println(cardOne);
  }

  public static String randomCard(String[] suits, String[] values) {
    Random myRandomGenerator = new Random();
    Integer randomSuitIndex = myRandomGenerator.nextInt(4);
    Integer randomValueIndex = myRandomGenerator.nextInt(13);

    String card = values[randomValueIndex] + " of " + suits[randomSuitIndex];
    return card;
  }
}
