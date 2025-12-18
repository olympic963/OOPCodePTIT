package com.mycompany.oopcodeptit;

import java.util.*;

public class TapTuRiengCuaHaiXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            Set<String> set1 = new TreeSet<>(Arrays.asList(s1.split("\\s+")));
            Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("\\s+")));
            set1.removeAll(set2);
            for(String res: set1) {
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}