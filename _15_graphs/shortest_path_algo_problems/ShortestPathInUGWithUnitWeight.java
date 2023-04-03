package _15_graphs.shortest_path_algo_problems;

import java.util.*;

public class ShortestPathInUGWithUnitWeight {
    public static void main(String[] args) {

    }

    public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) {
        // create adj list
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for(int i = 1 ; i<=n ; i++) adj.put(i, new LinkedList<>());

        for (int i = 0; i < m; i++) {
            int to = edges[i][0];
            int from = edges[i][1];
            adj.get(to).add(from);
            adj.get(from).add(to);
        }

        Map<Integer, Boolean> visited = new HashMap<>();

        for(int i = 1 ; i<=n ; i++) {
            visited.put(i, false);
        }

        // do bfs
        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> parent = new HashMap<>();

        q.add(s);
        parent.put(s, -1);
        visited.put(s, true);

        while(!q.isEmpty()) {
            int front = q.poll();

            for(Integer i: adj.get(front)) {
                if(!visited.get(i)) {
                    visited.put(i, true);
                    parent.put(i, front);
                    q.add(i);
                }
            }
        }

        // prepare shortest path
        LinkedList<Integer> ans = new LinkedList<>();

        int currNode = t;   // destination
        ans.add(t);

        while (currNode != s) {
            currNode = parent.get(currNode);
            ans.add(currNode);
        }

        Collections.reverse(ans);

        return ans;
    }
}

// https://www.codingninjas.com/codestudio/problems/shortest-path-in-an-unweighted-graph_981297