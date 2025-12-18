package com.mycompany.oopcodeptit;

import java.util.*;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> res = new ArrayList<>(n);
        for(int i=0;i<n;i++) a[i] =sc.nextInt();
        for(int i=0;i<n;i++){
            if (res.isEmpty()) res.add(a[i]);
            else {
                if((res.get(res.size()-1)+a[i])%2==0) res.remove(res.size()-1);
                else res.add(a[i]);
            }
        }
        System.out.println(res.size());
    }
}