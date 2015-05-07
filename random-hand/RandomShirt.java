import java.util.Random;

public class RandomShirt {
  public static void main(String[] args) {
    String[] colors = { "blue", "red", "yellow", "green", "orange", "purple" };
    String[] shirts = {  "T-shirt", "sweatshirt", "tank-top", "sweater" };

    String shirtOfTheDay = randomShirt(colors, shirts);
    System.out.println("Your shirt for today is: " + shirtOfTheDay);
  }

  public static String randomShirt(String[] colors, String[] shirts) {
    Random myRandomGenerator = new Random();

    Integer randomColorIndex = myRandomGenerator.nextInt(6);
    Integer randomShirtIndex = myRandomGenerator.nextInt(4);

    String randomShirtColor = colors[randomColorIndex];
    String randomShirtType = shirts[randomShirtIndex];

    String newShirt = randomShirtColor + " " + randomShirtType;
    return newShirt;
  }
}
