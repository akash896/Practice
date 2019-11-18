package greedy;

public class Prims {

    public static void main(String[] args) {
        int V= 5;
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 },
                                    { 2, 0, 3, 8, 5 },
                                    { 0, 3, 0, 0, 7 },
                                    { 6, 8, 0, 0, 9 },
                                    { 0, 5, 7, 9, 0 } };
        prims(graph, V);
    }

    public static void prims(int graph[][], int V){
        int key[] = new int[V];
        int parent[] = new int[V];
        boolean visited[] = new boolean[V];

        for(int i=0;i<V;i++){
            key[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }
        key[0] = 0;

        int e=0;
        while(e<V-1){
            int u = findMin(key, visited, V);
            visited[u] = true;
            for(int j=0;j<V;j++){
                if(graph[u][j]!=0 && !visited[j] && graph[u][j]<key[j]){
                    key[j] = graph[u][j];
                    parent[j] = u;

                }
            }
            e++;
        }
        for(int i=1;i<V;i++)
            System.out.println(parent[i] + "-" + i + "--> " +graph[i][parent[i]]);
    }

    public static int findMin(int key[], boolean visited[], int V){
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i=0;i<V;i++){
            if(key[i]<min && visited[i]==false) {
                min = key[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);
        return minIndex;
    }

}
