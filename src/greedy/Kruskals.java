package greedy;

import java.util.Arrays;

public class Kruskals{
    static class Edge{
        int src;
        int dest;
        int weight;
        public Edge(int s,int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    static class Subset{
        int parent;
        int rank;
    }

    public static void kruskals(Edge edges[]){
        int v = 4;
        // resultant edge matrix
        Edge result[] = new Edge[v];
        // creating parent table for find and union operation
        Subset set[] = new Subset[edges.length];
        for(int i=0;i<set.length;i++){
            set[i] = new Subset();
            set[i].parent = i;
            set[i].rank = 0;
        }
        // sorting the edges with their weights
        for(int k=0;k<edges.length;k++)
            for(int l=0;l<edges.length-k-1;l++){
                if(edges[l].weight > edges[l+1].weight){
                    Edge temp = edges[l];
                    edges[l] = edges[l+1];
                    edges[l+1] = temp;
                }
            }

        int e=1;
            // minCount is used to retreizve the smallest weight edge from the sorted edge array
            int minCount=0;
        while(e<=v-1){
            //System.out.println("edge loop ");
            Edge minEdge = edges[minCount++];
            int x = find(minEdge.src, set);
            int y = find(minEdge.dest, set);
            if(x!=y){
                result[e++] = minEdge;
                union(x, y, set);
            }
        }
        for(e=1; e<=v-1;e++)
            System.out.println(result[e].src + " - " + result[e].dest + "--> " + result[e].weight);
    }

    public static int find(int x, Subset set[]){
        if(set[x].parent!=x)
            set[x].parent = find(set[x].parent, set);
        return set[x].parent;
    }

    public static void union(int x, int y, Subset set[]){
        // rank is used to make a tree like structure of union thus reducing time for find operation
        if(set[x].rank < set[y].rank)
            set[y].parent = x;
        else if(set[x].rank > set[y].rank)
            set[x].parent = y;
        else {
            set[y].parent = x;
            set[y].rank++;
        }
    }

    public static void main(String[] args) {
        Edge edges[] = new Edge[5];
        edges[0] = new Edge(0, 1, 10 );
        edges[1] = new Edge(0, 2, 6 );
        edges[2] = new Edge(2, 3, 4 );
        edges[3] = new Edge(1, 3, 15 );
        edges[4] = new Edge(0, 3, 5 );
        kruskals(edges);
    }
}
