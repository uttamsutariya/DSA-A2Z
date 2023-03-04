package _3_problems_on_arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionOfSortedArrays {
    public static void main(String[] args) {
        int A[]={1,2,3,3,4,5,6,7};
        int B[]= {3,3,4,4,5,8};
        find_intersection(A, B);
        find_union(A, B);
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

    public static void find_union(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for(int i: a) set.add(i);
        for(int i: b) set.add(i);

        System.out.println(set);
    }
}
