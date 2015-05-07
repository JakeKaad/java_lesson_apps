public class Insurance {
  public static void main(String[] args) {
    String gender = "Female";
    Integer age = 30;

    Boolean young = age < 26;
    Boolean male = gender == "Male";

    if ( !(young && male) ) {
      System.out.println("You are going to get the best insurance rates.")
    }
  }
}
