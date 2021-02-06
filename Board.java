import java.util.Scanner;
public class Board {
     public String A1 = "_";
     public String A2 = "_";
     public String A3 = "_";
     public String B1 = "_";
     public String B2 = "_";
     public String B3 = "_";
     public String C1 = "_";
     public String C2 = "_"; 
     public String C3 = "_";
     
     private static int gamesPlayed;
  //constructor
  public Board()
  {
    
  }
  //print out updated board; to be called in main code
  public void printBoard()
  { 
    System.out.println(" _ _ _");
    System.out.println("|" + A1 + "|" + A2 + "|" + A3 + "|");
    System.out.println("|" + B1 + "|" + B2 + "|" + B3 + "|");
    System.out.println("|" + C1 + "|" + C2 + "|" + C3 + "|");
  }
  //function for player 1's moves
  // static public void moveItt (String move1)
  //   {
  //   //   //move1.equals(move1);
  //   //     if (move1.equals("A1"))
    //     {
    //         A1 = "x";
    //     }
    //     else if (move1.equals("A2"))
    //     {
    //         A2 = "x";
    //     }
    //     else if (move1.equals("A3"))
    //     {
    //         A3 = "x";
    //     }
    //     else if (move1.equals("B1"))
    //     {
    //         B1 = "x";
    //     }
    //     else if (move1.equals("B2"))
    //     {
    //         B2 = "x";
    //     }
    //     else if (move1.equals("B3"))
    //     {
    //         B3 = "x";
    //     }
    //     else if (move1.equals("C1"))
    //     {
    //         C1 = "x";
    //     }
    //     else if (move1.equals("C2"))
    //     {
    //         C2 = "x";
    //     }
    //     else if (move1.equals("C3"))
    //     {
    //         C3 = "x";
    //     }

    // }
    //function for Player 2's move
    public void moveIt (String move2, String letter)
    {
        if (move2.equals("A1"))
        {
            A1 = letter;
        }
        else if (move2.equals("A2"))
        {
            A2 = letter;
        }
        else if (move2.equals("A3"))
        {
            A3 = letter;
        }
        else if (move2.equals("B1"))
        {
            B1 = letter;
        }
        else if (move2.equals("B2"))
        {
            B2 = letter;
        }
        else if (move2.equals("B3"))
        {
            B3 = letter;
        }
        else if (move2.equals("C1"))
        {
            C1 = letter;
        }
        else if (move2.equals("C2"))
        {
            C2 = letter;
        }
        else 
        {
            C3 = letter;
        }
      
    }
//determines whether someone has won
  // public void Winner1()
  // {
  //   //check player 1 has won with any rows
  //       if ((A1.equals("x")) && (A2.equals("x")) && (A3.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //       else if ((B1.equals("x")) && (B2.equals("x")) && (B3.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //       else if ((C1.equals("x")) && (C2.equals("x")) && (C3.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //   //check if player 1 has won with any columns
  //       else if ((A1.equals("x")) && (B1.equals("x")) && (C1.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //       else if ((A2.equals("x")) && (B2.equals("x")) && (C2.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //       else if ((C1.equals("x")) && (C2.equals("x")) && (C3.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //   //check is player 1 has won with any rows
  //       else if ((A1.equals("x")) && (B2.equals("x")) && (C3.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //       else if ((A3.equals("x")) && (B2.equals("x")) && (C1.equals("x")))
  //       {
  //         win1 = true;
  //       }
  //       else 
  //       {
  //         win1 = false;
  //       }
  //   }
  // public void Winner2()
  // {
  //   //check player 2 has won with any rows
  //       if ((A1.equals("o")) && (A2.equals("o")) && (A3.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //       else if ((B1.equals("o")) && (B2.equals("o")) && (B3.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //       else if ((C1.equals("o")) && (C2.equals("o")) && (C3.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //   //check if player 2 has won with any columns
  //       else if ((A1.equals("o")) && (B1.equals("o")) && (C1.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //       else if ((A2.equals("o")) && (B2.equals("o")) && (C2.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //       else if ((C1.equals("o")) && (C2.equals("o")) && (C3.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //   //check is player 2 has won with any rows
  //       else if ((A1.equals("o")) && (B2.equals("o")) && (C3.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //       else if ((A3.equals("o")) && (B2.equals("o")) && (C1.equals("o")))
  //       {
  //         win2 = true;
  //       }
  //       else 
  //       {
  //         win2 = false;
  //       }
  // }
}