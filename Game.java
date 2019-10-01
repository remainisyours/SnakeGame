public class Game
{
  int origin;
  public Game(int a)
  {
    this.origin = a;
    System.out.println("Game is Starting");
  }
  
  public void Left()
  {
    this.origin--;
  }
  
  public static void main(String[] args)
  {
    System.out.println("Hello Snake");
  }
}
