import java.util.*;

public class Graph {
    // number of vertices
    private int V;

    // Adjacency list
    ArrayList<Integer>[] adj;

    // constructor
   @SuppressWarnings("unchecked") Graph(int v) {
        this.V = v;
        adj = new ArrayList[V];

        // creation of list for each index or node
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
    }

    // BFS traversal
    public void bfs(int s) {
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            // Get the adjacency lsit of node s
            Iterator<Integer> itr = adj[s].listIterator();
            while (itr.hasNext()) {
                int n = itr.next();
                // check for visit
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }

            }
        }
    }

    // DFS traversal
    public void dfs(int v){
        boolean visited[]=new boolean[V];
        dfsUtil(v,visited);
    }
    public void dfsUtil(int v, boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");

        Iterator<Integer> itr=adj[v].listIterator();
        while (itr.hasNext()) {
            int n=itr.next();
            if (!visited[n]) {
                dfsUtil(n,visited);
            }
        }
    }

    // Main method
    public static void main(String argv[]) {
        // Graph graph=new Graph(3);
        // graph.addEdge(0, 1);
        // graph.addEdge(0, 2);
        // graph.addEdge(1, 2);

        // graph.bfs(0);
        // graph.dfs(0);

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // graph.bfs(0);
        graph.dfs(0);
    }

}