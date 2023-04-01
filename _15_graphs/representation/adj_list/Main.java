package _15_graphs.representation.adj_list;

import java.util.*;

class Graph {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    public void addEdge(int u, int v, boolean isDirected) {

        if(!adj.containsKey(u)) addVertex(u);
        if(!adj.containsKey(v)) addVertex(v);

        // create an edge from u to v
        adj.get(u).add(v);

        if(!isDirected) {
            // create an edge also from v to u
            adj.get(v).add(u);
        }
    }

    private void addVertex(int n) {
        adj.put(n, new ArrayList<>());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        for (Integer v : adj.keySet()) {
            builder.append(v + ": ");
            for (Integer w : adj.get(v)) {
                builder.append(w + " ");
            }
            builder.append("\n");
        }

        return (builder.toString());
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of edges");
        int m = sc.nextInt();

        Graph g = new Graph();

        for(int i = 0 ; i<m ; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();

            g.addEdge(u, v, false);
        }

        System.out.println(g.toString());
    }
}
