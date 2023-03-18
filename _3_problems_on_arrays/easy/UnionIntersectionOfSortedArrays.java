package _3_problems_on_arrays.easy;

import java.util.*;

public class UnionIntersectionOfSortedArrays {
    public static void main(String[] args) {
        int[] A={1,2,3,3,4,5,6,7};
        int[] B= {3,3,4,4,5,8};
        find_intersection(A, B);
        find_union_set(A, B);
        find_union_hashmap(A, B);
        find_union_two_pointers(A, B);
    }

    public static void find_intersection(int[] a, int[] b) {
        int i = 0, j = 0;

        ArrayList<Integer> ls = new ArrayList<>();

        while(i<a.length && j<b.length) {
            if(a[i] < b[j]) i++;
            else if(a[i] > b[j]) j++;
            else {
                ls.add(a[i]);
                i++;
                j++;
            }
        }

        System.out.println(ls);
    }

    public static void find_union_set(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for(int i: a) set.add(i);
        for(int i: b) set.add(i);

        System.out.println(set);
    }

    public static void find_union_hashmap(int[] a, int[] b) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i: a)
            freq.put(i, freq.getOrDefault(i, 0) + 1);

        for(int i: b)
            freq.put(i, freq.getOrDefault(i, 0) + 1);

        ArrayList<Integer> union = new ArrayList<>(freq.keySet());

        System.out.println(union);
    }

    public static void find_union_two_pointers(int[] a, int[] b) {

        int i = 0; int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while (i<a.length && j<b.length) {
            if(a[i] == b[i]) {
                if(!isSameAsLast(union, a[i])) {
                    union.add(a[i]);
                    i++;
                    j++;
                }
            }
            else if(a[i] < b[i]) {
                if(!isSameAsLast(union, a[i])) {
                    union.add(a[i]);
                    i++;
                }
            }
            else {
                if(!isSameAsLast(union, a[j])) {
                    union.add(a[j]);
                    j++;
                }
            }
        }

        while(i<a.length) {
            if(!isSameAsLast(union, a[i])) {
                union.add(a[i]);
                i++;
            }
        }

        while(j<b.length) {
            if(!isSameAsLast(union, a[j])) {
                union.add(a[j]);
                j++;
            }
        }

        System.out.println(union);
    }

    public static boolean isSameAsLast(ArrayList<Integer> union, int x) {
        if(union.size() == 0) return false;
        return union.get(union.size() - 1) == x;
    }
}

// https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
// https://takeuforward.org/data-structure/intersection-of-two-sorted-arrays/