public class User {
  String mName;
  String mChoice;

  public User(String name) {
    mName = name;
  }

  public void setChoice(String choice) {
    if (choice.equals("p")) {
      mChoice = "Paper";
    } else if (choice.equals("s")) {
      mChoice = "Scissors";
    } else if (choice.equals("r")) {
      mChoice = "Rock";
    }
  }
}
