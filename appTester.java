import java.util.Scanner;
public class appTester {
//Declare all variables
     static String move1;
     static String move2;
     static String p1 = "_";
     static String p2 = "_";
     static String A1 = "_";
     static String A2 = "_";
     static String A3 = "_";
     static String B1 = "_";
     static String B2 = "_";
     static String B3 = "_";
     static String C1 = "_";
     static String C2 = "_"; 
     static String C3 = "_";
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
        p1 = input.nextLine();
        System.out.println("Enter player 2's name:");
        p2 = input.nextLine();
        System.out.println("Player 1: " + p1 + "\nPlayer 2: " + p2);
//start while loop and game 
      while (noWinner == false)
      {
//player 1 plays
        System.out.println("\nGive " + p1 + "'s next move:");
        move1 = input.nextLine();
        moveItt(move1);
        printBoard();
//print a cute border to signal end of turn
    for (int i = 1; i < 51; i++)
    {
      System.out.print("*");
    }
//Checks for Player 1 having won and acts accordingly if true
        Winner1();
        if (win1 == true)
        {
          System.out.println(p1 + " has won!");
          noWinner = true;
          break;
        }
//player 2 plays
        System.out.println("\n Give " + p2 + "'s next move:");
        move2 = input.nextLine();
        moveIt(move2);
        printBoard();
//print a cute border to signal end of turn
    for (int i = 1; i < 51; i++)
    {
      System.out.print("*");
    }
//Player 2 win sequence
        Winner2();
        if (win2 == true)
        {
          System.out.println(p2 + " has won!");
          noWinner = true;
          break;
        }
        //Winner1(win1, A1, A2, A3, B1, B2, B3, C1, C2, C3);  
    }
  }
  }
}