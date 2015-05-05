import java.io.Console;
import java.util.Random;

public class PaperRockScissors {
  public static void main(String[] args) {
    Console console = System.console();

    // initialize the user with user information and welcome them
    console.printf("Hi, there! Welcome to Paper Rock Scissors! What is your name? \n");
    String username = console.readLine();
    console.printf("Welcome %s \n", username);

    //Explain the game
    String knowHow = "Do you know how to play Paper Rock Scissors? ( y / n)";
    String rules = "Its a simple game,  We both choose Paper, Rock or Scissors.\nPaper beats Rock, Rock beats Scissors, Scissors beats Paper.\n";

    console.printf(knowHow);
    String knowResponse = console.readLine();
    if (knowResponse.equals("n")) {
      console.printf(rules);
    }

    // Choices and Random selection
    String[] choices = { "Paper", "Rock", "Scissors" };
    Random generator = new Random();
    int randomIndex = generator.nextInt(choices.length);

    // Play the Game
    String startGame = "Alright, lets play!  Choose (p)aper, (r)ock or (s)cissors:\n";
    console.printf(startGame);

    // User chooses
    String choice = console.readLine();
    if (choice.equals("p")) {
      choice = "Paper";
    } else if (choice.equals("s")) {
      choice = "Scissors";
    } else if (choice.equals("r")) {
      choice = "Rock";
    }

    // Results
    String computerChoice = choices[randomIndex];
    console.printf("You chose %s! \n", choice);
    console.printf("Computer chose %s! \n", computerChoice);

    // Evaluate Winner
    if (choice.equals(computerChoice)) {
      console.printf("Its a tie!\n");
    } else if ((choice.equals("Paper") && computerChoice.equals("Rock")) ||
               (choice.equals("Rock") && computerChoice.equals("Scissors")) ||
               (choice.equals("Scissors") && computerChoice.equals("Paper"))) {
      console.printf("You win!\n");
    } else {
      console.printf("You lose!\n");
    }
  }
}
