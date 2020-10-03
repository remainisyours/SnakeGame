import java.util.*;
public class Game
{
  int origin;
  int[][] arr;
  int row;
  int col;
  public Game(int a, int row, int col)
  {
    this.origin = a;
    this.row = row;
    this.col = col;
    this.arr = new int[row][col];
    System.out.println("Game is Starting");
  }
  public void Initialization(int row, int col)
  {
    for (int i=0; i<row; i++)
    {
      for (int j=0; j<col; j++)
      {
        this.arr[row][col] = 0;
      }
    }
  }
  public void moveLeft(int step)
  {
    if (this.cur[0] - step>=0)
    {
      this.cur[0] = this.cur[0] - step;
    }
    else
    {
      System.out.println("Invalid step. Out of Bounds");
    }
  }
  public void moveRight(int step)
  {
    if (this.cur[0] + step<this.col)
    {
      this.cur[0] = this.cur[0] + step;
    }
    else
    {
      System.out.println("Invalid step. Out of Bounds");
    }
  }
  public static void main(String[] args)
  {
    System.out.println("Hello Snake");
    Scanner jk = new Scanner(System.in);
    System.out.println("Enter Size of the board. Size of board will be N * N");
    int siz = jk.nextInt();
    
  }
}
