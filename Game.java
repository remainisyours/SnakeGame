public class Game
{
  public static void main(String[] args)
  {
    System.out.println("Hello Snake");
  }
    public static void printBFS_Route_For_Snake(int[][] graph)
  {
      int source_vertex=0;
      int[] visited=new int[n];


      Queue<Integer> q=new LinkedList<>();
      q.add(source_vertex);
      visited[source_vertex]=true;
      while(q.empty()!=true)
      {
        int a=q.pop();
        print(a)
        for(int i=0;i<graph[a].length();i++)
        {
          if(visited[graph[a][i]]==false)
          {
          q.add(graph[a][i])
          visited[graph[a][i]]=true
          }
        }

      }



  }
}
