//DON'T FORGET TO CHECK OFF BOXES ON LIST
// CITATION

import java.util.Scanner;
public class App {
//Declare all variables
     static String move1;
     static String move2;
     static boolean noWinner = false;
     static boolean win1 = false;
     static boolean win2 = false;
     

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
//print intro
        System.out.println("Let's play a game of tic-tac-toe!" + "\nPick a slot to put your piece in using \nA1, A2, A3, B1, B2, B3, C1, C2, or C3" + "\nYou can win by claiming all A slots, all 1 slots, or A1, B2, C3 or A3, B2, or C1");
        noWinner = false;
//create users and their names
        System.out.println("Enter player 1's name:");
        Player p1 = new Player(input.nextLine());
        System.out.println("Enter player 2's name:");
        Player p2 = new Player(input.nextLine());
        System.out.println("Player 1: " + p1.getName() + "\nPlayer 2: " + p2.getName());
//start while loop and game 
      while (noWinner == false)
      {
        Board game = new Board();
//player 1 plays
        System.out.println("\nGive " + p1.getName() + "'s next move:");
        move1 = input.nextLine();
        game.moveIt(move1, "x");
        game.printBoard();
//print a cute border to signal end of turn
    printBorder();
//Checks for Player 1 having won and acts accordingly if true
        // Winner1();
        // if (win1 == true)
        // {
        //   System.out.println(p1 + " has won!");
        //   noWinner = true;
        //   break;
        // }
//player 2 plays
        System.out.println("\n Give " + p2.getName() + "'s next move:");
        move2 = input.nextLine();
        game.moveIt(move2, "o");
        game.printBoard();
//print a cute border to signal end of turn
        printBorder();
//Player 2 win sequence
        // Winner2();
        // if (win2 == true)
        // {
        //   System.out.println(p2.getName() + " has won!");
        //   noWinner = true;
        //   break;
        }
        //Winner1(win1, A1, A2, A3, B1, B2, B3, C1, C2, C3);  
    }

  //How to print a border 
  public static void printBorder()
  {
    for (int i = 1; i < 51; i++)
      {
        System.out.print ("*");
      }
  }
}

