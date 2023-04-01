package _15_graphs.representation.adj_matrix;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Graph {
    private int vertices;
    private int[][] mat; // adj matrix

    public Graph(int v) {
        this.vertices = v;
        this.mat = new int[v][v];
    }

    public void makeEdge(int u, int v) {
        mat[u][v] = 1;
    }

    public int getEdge(int u, int v) {
        return mat[u][v];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes : ");
        int n = sc.nextInt();

        System.out.println("Enter nodes : ");

        Map<Integer, Integer> hm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int x = hm.size();
            hm.put(sc.nextInt(), x);
        }

        System.out.println(hm.keySet());
        System.out.println(hm.values());

        System.out.println("Enter the number of edges : ");
        int e = sc.nextInt();

        int to,from;

        Graph g = new Graph(n);

        System.out.println("Enter the edges : <to> <from>");
        for (int i = 0; i < e; i++) {
            to = sc.nextInt();
            from = sc.nextInt();

            if(!hm.containsKey(to) || !hm.containsKey(from)) {
                System.out.println("Entered vertex not exist");
            }
            else {
                g.makeEdge(hm.get(to), hm.get(from));
            }
        }

        System.out.println("Adjacency matrix of given graph :");
        System.out.print("  ");
        for(Integer i: hm.keySet()) System.out.print(i + " ");
        System.out.println();
        for(Integer i: hm.keySet()) {
            System.out.print(i + " ");
            for(Integer j: hm.keySet())
                System.out.print(g.getEdge(hm.get(i), hm.get(j)) + " ");
            System.out.println();
        }
    }
}
