public class EachLoops {
  public static void main(String[] args) {
    String[] myClassmatesArray = { "Frank", "Lauren", "Alex", "Ryan" };

    for (String oneClassmate : myClassmatesArray) {
      System.out.println(oneClassmate + " is in my class");
    }


    Integer[] oneToTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for (Integer thisNumber : oneToTen) {
      Integer doubledNumber = thisNumber * 2;
      System.out.println("Your new number: " + doubledNumber.toString());
    }
  }
}
