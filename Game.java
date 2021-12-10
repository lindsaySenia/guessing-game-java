/*

A number-guessing game.

*/

import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    System.out.println("Time to play a game. I'm thinking of a number 1-100.");

    Random random = new Random();
    Scanner input = new Scanner(System.in);
    int upperbound = 100;
    String replay;

    do {
      int randomNumber = random.nextInt(upperbound);
      int guessCount = 0;
      int guessInt = -1;
// variable of random number as string
      // compare
// include guess counter
      do {
        System.out.println("What is your guess?");
        String guess = input.nextLine();
        try {
          guessInt = Integer.parseInt(guess);
        } catch (Exception e) {
          System.out.println("Please enter a valid number.");
          continue;
        }

        guessCount++;

        if (guessInt < randomNumber) {
          System.out.println(guessInt + " is too low!");
        } else if (guessInt > randomNumber)
          System.out.println(guessInt + " is too high!");

      } while (guessInt != randomNumber);

      System.out.println("You're right! The number was " + randomNumber + "! You got it in " + guessCount + " guesses!");

      System.out.println("Would you like to play again? (Y/N)");
      replay = input.nextLine();
    } while (replay.equals("Y"));
  }
}
