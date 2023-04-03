package _15_graphs.shortest_path_algo_problems;

import java.util.*;

class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

// find the shortest distance to all other nodes from the source node

public class ShortestPathInDAG {
    public static void main(String[] args) {
        int n = 6, m = 7;
        int[][] edge = {{0,1,2},{0,4,1},{4,5,4},{4,2,2},{1,2,3},{2,3,6},{5,3,1}};
        shortestPath(n, m, edge);
    }

    public static int[] shortestPath(int N, int M, int[][] edges) {

        Map<Integer, List<Pair>> adj = new HashMap<>();

        for (int i = 0; i < N; i++) adj.put(i, new ArrayList<Pair>());

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int weight = edges[i][2];
            adj.get(u).add(new Pair(v, weight));
        }

        Map<Integer, Boolean> visited = new HashMap<>();

        for (int i = 0; i < N; i++) visited.put(i, false);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < N; i++) {
            if(!visited.get(i)) {
                dfs(i, adj, visited, st);
            }
        }

        int[] distance = new int[N];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        while(!st.isEmpty()) {
            int top = st.pop();

            if(distance[top] != Integer.MAX_VALUE) {
                for(Pair neighbour: adj.get(top)) {
                    if(distance[top] + neighbour.second < distance[neighbour.first]) {
                        distance[neighbour.first] = distance[top] + neighbour.second;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(distance));

        return distance;
    }

    private static void dfs(int node, Map<Integer, List<Pair>> adj, Map<Integer, Boolean> visited, Stack<Integer> st) {
        visited.put(node, true);

        for(Pair p: adj.get(node)) {
            if(!visited.get(p.first)) {
                dfs(p.first, adj, visited, st);
            }
        }

        st.push(node);
    }
}

// https://takeuforward.org/data-structure/shortest-path-in-directed-acyclic-graph-topological-sort-g-27/