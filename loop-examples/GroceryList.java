public class GroceryList {
  public static void main(String[] args) {
    String[] myGroceryList = { "eggs", "milk", "bread", "bananas", "cereal", "rice" };

    System.out.println("My grocery list:");
    for ( String groceryItem : myGroceryList ) {
      System.out.println( groceryItem );
    }
  }
}
