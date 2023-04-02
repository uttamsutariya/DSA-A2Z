package _15_graphs.topological_sort_problems;

import java.util.*;

public class TopologicalSortKahnsAlgo {
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

        // find in degree of all nodes

        Map<Integer, Integer> indegree = new HashMap<>();
        
        for(int i = 0 ; i<v ; i++)
            indegree.put(i, 0);

        for(Integer key: adj.keySet()) {
            for(Integer i: adj.get(key)) {
                indegree.put(i, indegree.getOrDefault(i, 0) + 1);
            }
        }

        // push all 0 degree node to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if(indegree.get(i) == 0) q.offer(i);
        }


        // do bfs
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()) {
            int front = q.poll();

            // store ans
            ans.add(front);

            for(Integer neighbour: adj.get(front)) {
                indegree.put(neighbour, indegree.get(neighbour)-1);
                if(indegree.get(neighbour) == 0) {
                    q.offer(neighbour);
                }
            }
        }

        return ans;
    }
}
// https://www.codingninjas.com/codestudio/problems/topological-sort_982938