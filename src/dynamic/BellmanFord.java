package dynamic;

public class BellmanFord {
    int V, E;
    Edge edge[];

    static class Edge{
        int src, dest, weight;
        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    BellmanFord(int v, int e){
        V = v;        E = e;
        edge = new Edge[e];
    }

    public static void BellmanFord(BellmanFord graph, int source){
        int V = graph.V;
        int E = graph.E;
        int dist[] = new int[V];
        for(int i=0;i<V;i++)
            dist[i] = Integer.MAX_VALUE;
        dist[source] = 0;
        // run a loop for v-1 times on all edges to perform relaxation of the edges
        for(int i=1;i<V;i++){
            for(int e=0;e<E;e++){
                int u = graph.edge[e].src;
                int v = graph.edge[e].dest;
                int w = graph.edge[e].weight;
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+w < dist[v])
                    dist[v] = dist[u] + w;
            }
        }

        // to check if negative weight loop is present or not
        for(int e=0;e<E;e++){
            int u = graph.edge[e].src;
            int v = graph.edge[e].dest;
            int w = graph.edge[e].weight;
            if(dist[u]!=Integer.MAX_VALUE && dist[u]+w < dist[v]) {
                System.out.println("Negative weight loop present ");
                return;
            }
        }

        for(int i=0;i<V;i++)
            System.out.println(source + "-" + i + "-->"+dist[i]);

    }

    public static void main(String[] args) {
        BellmanFord graph = new BellmanFord(5, 8);

        // add edge 0-1 (or A-B in above figure)
        graph.edge[0] = new Edge(0,1,-1);
        graph.edge[1] = new Edge(0,2,4);
        graph.edge[2] = new Edge(1,2,3);
        graph.edge[3] = new Edge(1,3,2);
        graph.edge[4] = new Edge(1,4,2);
        graph.edge[5] = new Edge(3,2,5);
        graph.edge[6] = new Edge(3,1,1);
        graph.edge[7] = new Edge(4,3,-3);
        graph.BellmanFord(graph, 0);
    }
}
