package com.mycompany.oopcodeptit;

import java.util.*;

public class DiemCanBang {
    public static int process(int n, int a[]){
        int left = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        for (int i = 0; i < n-1; i++) {
            int right = sum -left- a[i];
            if(right==left) return i+1;
            else left+=a[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n =sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) a[i] = sc.nextInt();
            System.out.println(process(n, a));
            t--;
        }
    }
}