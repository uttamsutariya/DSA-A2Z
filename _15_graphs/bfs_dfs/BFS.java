package _15_graphs.bfs_dfs;

import java.util.*;

public class BFS {
    public static void main(String[] args) {

        Map<Integer, List<Integer>> adj = new HashMap<>();

        Map<Integer, Boolean> visited = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            adj.put(i, new ArrayList <>());
            visited.put(i, false);
        }

        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            if(!visited.get(i)) bfs(5, adj, visited, ans, i);
        }

        for (Integer it : ans) {
            System.out.print(it + " ");
        }
    }

    public static void bfs(int V, Map<Integer, List<Integer>> adj, Map<Integer, Boolean> visited, List<Integer> ans, int node) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(node);
        visited.put(node, true);

        while(!q.isEmpty()) {

            int frontNode = q.poll();
            ans.add(frontNode);
            for(Integer it: adj.get(frontNode)) {
                if(!visited.get(it)) {
                    visited.put(it, true);
                    q.offer(it);
                }
            }
        }
    }
}

// https://takeuforward.org/graph/breadth-first-search-bfs-level-order-traversal/