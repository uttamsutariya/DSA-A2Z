package _15_graphs.topological_sort_problems;

import java.sql.Statement;
import java.util.*;

public class TopologicalSortDFS {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> edges, int v, int e) {
        
        Map<Integer, List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < v; i++) adj.put(i, new LinkedList<>());

        for (int i = 0; i < e; i++) {
            int to = edges.get(i).get(0);
            int from = edges.get(i).get(1);

            adj.get(to).add(from);
        }

        Map<Integer, Boolean> visited = new HashMap<>();

        for(int i = 0 ; i<v ; i++)  visited.put(i, false);

        Stack<Integer> st = new Stack<>();

        // call dfs for all components
        for (int i = 0; i < v; i++) {
            if(!visited.get(i))
                dfs(i, adj, st, visited);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (!st.isEmpty())
            ans.add(st.pop());

        return ans;
    }

    public static void dfs(int node, Map<Integer, List<Integer>> adj, Stack<Integer> st, Map<Integer, Boolean> visited) {

        visited.put(node, true);

        for(Integer neighbour: adj.get(node)) {
            if(!visited.get(neighbour)) dfs(neighbour, adj, st, visited);
        }

        st.push(node);
    }
}

// https://www.codingninjas.com/codestudio/problems/topological-sort_982938