package dynamic;

public class FloydWarshall {
    static  int INF = 9999;
    public static void main (String[] args)
    {
        /* Let us create the following weighted graph
           10
        (0)------->(3)
        |         /|\
      5 |          |
        |          | 1
       \|/         |
       (1)------->(2)
           3           */
        int graph[][] = { {0,   5,  INF, 10},
                          {INF, 0,   3, INF},
                          {INF, INF, 0,   1},
                          {INF, INF, INF, 0}};
        int V = 4;
        FloydWarshall a = new FloydWarshall();
        a.floydWarshall(graph, V);
    }

    public static void floydWarshall(int  graph[][], int V){
        int result[][] = new int [V][V];
        // copying current graph to result graph as result will be altered in final answer
        for(int i=0;i<V;i++)
            for(int j=0;j<V;j++)
                result[i][j] = graph[i][j];

            // performing warshall calculation
            for(int k=0;k<V;k++){
                for(int i=0;i<V;i++){
                    for(int j=0;j<V;j++){
                        if((result[i][k]+result[k][j]) < result[i][j])
                            result[i][j] = result[i][k] + result[k][j];
                    }
                }
            }

            //printing the answer
        for(int i=0;i<V;i++) {
            for (int j = 0; j < V; j++)
                System.out.print(result[i][j] + "\t");
            System.out.println();
        }
    }

}
