import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n                                          <-----Welcome to Rock, Paper, Scissors Game!----->");

        boolean playAgain = true;

        while (playAgain) {
            playRound(scanner, random);

            System.out.println("\nDo you want to play again? (yes/no)");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("Thanks for playing!");
    }

    private static void playRound(Scanner scanner, Random random) {
        System.out.println("\nEnter your choice: rock, paper, or scissors");
        String userChoice = scanner.next().toLowerCase();

        String[] choices = {"rock", "paper", "scissors"};
        int computerChoiceIndex = random.nextInt(choices.length);
        String computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer choice: " + computerChoice);
        
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("Awesome! You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
