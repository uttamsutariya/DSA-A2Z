package _15_graphs.bfs_dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {
    public static void main(String[] args) {
        Map<Integer, List<Integer>> adj = new HashMap<>();

        Map<Integer, Boolean> visited = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            adj.put(i, new ArrayList<>());
            visited.put(i, false);
        }

        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        adj.get(5).add(7);
        adj.get(7).add(8);
        adj.get(7).add(5);
        adj.get(8).add(7);
        adj.get(8).add(6);
        adj.get(6).add(8);

        List<List<Integer>> ans = new ArrayList<>();  // can have more than 1 component if graph is disconnected

        for (int i = 0; i < 9; i++) {
            if(!visited.get(i)) {
                List<Integer> component = new ArrayList<>();
                dfs(adj, visited, component , i);
                ans.add(component);
            }
        }

        System.out.println(ans);

//        StringBuilder builder = new StringBuilder();
//
//        for (Integer v : adj.keySet()) {
//            builder.append(v + ": ");
//            for (Integer w : adj.get(v)) {
//                builder.append(w + " ");
//            }
//            builder.append("\n");
//        }
//
//        System.out.println(builder.toString());
    }

    public static void dfs(Map<Integer, List<Integer>> adj, Map<Integer, Boolean> visited, List<Integer> component, int node) {
        component.add(node);
        visited.put(node, true);

        // for all connected node do recursive call
        for(Integer i: adj.get(node)) {
            if(!visited.get(i)) dfs(adj, visited, component, i);
        }
    }
}

// https://takeuforward.org/data-structure/depth-first-search-dfs/