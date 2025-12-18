package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class MangDoiXung {
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
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i =0; i<n; i++) a[i] = sc.nextInt();
            System.out.println(check(n,a)?"YES":"NO");
            t--;
        }
    }
}