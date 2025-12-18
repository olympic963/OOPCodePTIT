package com.mycompany.oopcodeptit;

import java.util.*;

public class GiaoCuaHaiDaySo {
    public static boolean check(int n, int a[]){
        for(int i =0; i<n/2; i++){
            if(a[i]!=a[n-i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        for(int i =0; i<n; i++) a[i] = sc.nextInt();
        for(int i =0; i<m; i++) b[i] = sc.nextInt();
        Set<Integer> setA = new HashSet<Integer>(Arrays.asList(a));
        Set<Integer> setB = new HashSet<Integer>(Arrays.asList(b));
        Set<Integer> res = new TreeSet<>(setA);
        res.retainAll(setB);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}