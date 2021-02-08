import java.util.Scanner;
public class Player {
  private String name;
  //a constructor is a method without a return type that shares the class's name
  //returns name
  public Player(String name)
  {
    this.name = name;
  }
  //sets the name to what is given (setter method using overloading)
  public void setName(String name)
  {
    this.name = name;
  }
//returns name (getter method using overloading)
  public String getName()
  {
    return name;
  }
}