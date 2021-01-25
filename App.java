import java.util.Scanner;
public class App {
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
//print out updated board; to be called in main code
  public static void printBoard()
  { 
    System.out.println(" _ _ _");
    System.out.println("|" + A1 + "|" + A2 + "|" + A3 + "|");
    System.out.println("|" + B1 + "|" + B2 + "|" + B3 + "|");
    System.out.println("|" + C1 + "|" + C2 + "|" + C3 + "|");
  }
  //function for player 1's moves
  static public void moveItt (String move1)
    {
      //move1.equals(move1);
        if (move1.equals("A1"))
        {
            A1 = "x";
        }
        else if (move1.equals("A2"))
        {
            A2 = "x";
        }
        else if (move1.equals("A3"))
        {
            A3 = "x";
        }
        else if (move1.equals("B1"))
        {
            B1 = "x";
        }
        else if (move1.equals("B2"))
        {
            B2 = "x";
        }
        else if (move1.equals("B3"))
        {
            B3 = "x";
        }
        else if (move1.equals("C1"))
        {
            C1 = "x";
        }
        else if (move1.equals("C2"))
        {
            C2 = "x";
        }
        else if (move1.equals("C3"))
        {
            C3 = "x";
        }

    }
    //function for Player 2's move
    static public void moveIt (String move2)
    {
        if (move2.equals("A1"))
        {
            A1 = "o";
        }
        else if (move2.equals("A2"))
        {
            A2 = "o";
        }
        else if (move2.equals("A3"))
        {
            A3 = "o";
        }
        else if (move2.equals("B1"))
        {
            B1 = "o";
        }
        else if (move2.equals("B2"))
        {
            B2 = "o";
        }
        else if (move2.equals("B3"))
        {
            B3 = "o";
        }
        else if (move2.equals("C1"))
        {
            C1 = "o";
        }
        else if (move2.equals("C2"))
        {
            C2 = "o";
        }
        else 
        {
            C3 = "o";
        }
      
    }
//determines whether someone has won
  static public void Winner1()
  {
    //check player 1 has won with any rows
        if ((A1.equals("x")) && (A2.equals("x")) && (A3.equals("x")))
        {
          win1 = true;
        }
        else if ((B1.equals("x")) && (B2.equals("x")) && (B3.equals("x")))
        {
          win1 = true;
        }
        else if ((C1.equals("x")) && (C2.equals("x")) && (C3.equals("x")))
        {
          win1 = true;
        }
    //check if player 1 has won with any columns
        else if ((A1.equals("x")) && (B1.equals("x")) && (C1.equals("x")))
        {
          win1 = true;
        }
        else if ((A2.equals("x")) && (B2.equals("x")) && (C2.equals("x")))
        {
          win1 = true;
        }
        else if ((C1.equals("x")) && (C2.equals("x")) && (C3.equals("x")))
        {
          win1 = true;
        }
    //check is player 1 has won with any rows
        else if ((A1.equals("x")) && (B2.equals("x")) && (C3.equals("x")))
        {
          win1 = true;
        }
        else if ((A3.equals("x")) && (B2.equals("x")) && (C1.equals("x")))
        {
          win1 = true;
        }
        else 
        {
          win1 = false;
        }
    }
  static public void Winner2()
  {
    //check player 2 has won with any rows
        if ((A1.equals("o")) && (A2.equals("o")) && (A3.equals("o")))
        {
          win2 = true;
        }
        else if ((B1.equals("o")) && (B2.equals("o")) && (B3.equals("o")))
        {
          win2 = true;
        }
        else if ((C1.equals("o")) && (C2.equals("o")) && (C3.equals("o")))
        {
          win2 = true;
        }
    //check if player 2 has won with any columns
        else if ((A1.equals("o")) && (B1.equals("o")) && (C1.equals("o")))
        {
          win2 = true;
        }
        else if ((A2.equals("o")) && (B2.equals("o")) && (C2.equals("o")))
        {
          win2 = true;
        }
        else if ((C1.equals("o")) && (C2.equals("o")) && (C3.equals("o")))
        {
          win2 = true;
        }
    //check is player 2 has won with any rows
        else if ((A1.equals("o")) && (B2.equals("o")) && (C3.equals("o")))
        {
          win2 = true;
        }
        else if ((A3.equals("o")) && (B2.equals("o")) && (C1.equals("o")))
        {
          win2 = true;
        }
        else 
        {
          win2 = false;
        }
  }
}