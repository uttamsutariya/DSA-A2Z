package _15_graphs.bfs_dfs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CycleDetectionInDirectedGraph {
    public static void main(String[] args) {

    }

    public static Boolean isCyclic(int[][] edges, int v, int e)
    {
        // create adj list
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for(int i = 0 ; i<v ; i++) adj.put(i, new LinkedList<>());

        for (int i = 0; i < edges.length; i++) {
            int to = edges[i][0];
            int from = edges[i][1];
            adj.get(to).add(from);
        }

        Map<Integer, Boolean> visited = new HashMap<>();
        Map<Integer, Boolean> inDfsCall = new HashMap<>();

        for(int i = 0 ; i<v ; i++) {
            visited.put(i, false);
            inDfsCall.put(i, false);
        }

        // call dfs
        for (int i = 0; i <v; i++) {
            if(!visited.get(i)) {
                boolean cycleFound = checkCycleDFS(i, visited, inDfsCall, adj);
                if(cycleFound) return true;
            }
        }

        return false;
    }

    public static boolean checkCycleDFS(int node, Map<Integer, Boolean> visited, Map<Integer, Boolean> inDfsCall, Map<Integer, List<Integer>> adj) {
        visited.put(node, true);
        inDfsCall.put(node, true);

        for(Integer i: adj.get(node)) {
            if(!visited.get(i)) {
                boolean isCycle = checkCycleDFS(i, visited, inDfsCall, adj);
                if(isCycle) return true;
            }
            else if(inDfsCall.get(i)) {
                return true;
            }
        }

        inDfsCall.put(node, false);
        return false;
    }
}

// https://www.codingninjas.com/codestudio/problems/detect-cycle-in-a-directed-graph_920545