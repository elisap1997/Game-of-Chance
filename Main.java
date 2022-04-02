import java.util.Scanner;
import java.util.*;


class Main {
  public static void main(String[] args) {

    // setting up keyboard
    Scanner keyboard = new Scanner(System.in);

    // setting up random number function
    Random randomMaker = new Random();

    // set up variables
    int rolls = 2;
    int bet = 0;
    String guess = "";
    int score = 0;
    int totalScore = 0;
    

    //setting up prompt to roll dice
    System.out.println();
    System.out.println("Welcome to Dice Game. I will roll two standard six-sided dice. Guess if the sum of the rolls is odd or even. If you guess correctly, you win the bet. If not, I win.");
    System.out.println();
    System.out.print("First, please enter how much you are willing to bet. ");
    bet = Integer.parseInt(keyboard.nextLine());

    System.out.print("Great! Do you think the sum of the dice will be even or odd. ");
    guess = keyboard.nextLine(); 

    // starting loop
    for (int i = 0; i < rolls; i++) {
      score = randomMaker.nextInt(6) + 1;
      System.out.println("Dice " + (i + 1) + " is: " + score);
      totalScore = totalScore + score;
      System.out.println();
      
    }

    System.out.println("Total score: " + totalScore);
    System.out.println();

    if (totalScore % 2 == 0 && guess.toLowerCase() == "even") {
      System.out.println("You win " + bet);
    } 
    else {
      if (totalScore % 2 != 0 && guess.toLowerCase() == "odd"){
        System.out.println("You win " + bet);
      }
      else{
        System.out.println("You lose " + bet + ". I win! ");
      }
    }

      
  }
}