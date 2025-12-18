package com.mycompany.oopcodeptit;

import java.util.*;

public class SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        for (int i=0;i<n-1;i++) {
            int idx = i;
            for (int j = i+1;j<n;j++) {
                if (a[j] < a[idx]) {
                    idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int pt : a) System.out.print(pt + " ");
            System.out.println();
        }
    }
}