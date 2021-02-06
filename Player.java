import java.util.Scanner;
public class Player {
  private String name;
  //a constructor is a method without a return type that shares the class's name
  public Player(String name)
  {
    this.name = name;
  }
  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }
}