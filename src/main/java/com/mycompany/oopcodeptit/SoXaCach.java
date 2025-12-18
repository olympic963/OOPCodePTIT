package com.mycompany.oopcodeptit;

import java.util.*;

import static java.util.Collections.reverse;
import static java.util.Collections.swap;

public class SoXaCach {
    public static void init(int n, Integer[] digits){
        for(int i=0; i<n; i++){
            digits[i]= (i+1);
        }
    }
    public static void xuat(int n, Integer[] digits){
        for(int i=0; i<n; i++){
            System.out.print(digits[i]);
        }
        System.out.println();
    }
    public static boolean check(int n, Integer[] digits){
        for(int i=0;i<n-1;i++){
            if(Math.abs(digits[i]-digits[i+1])==1 || digits[i]==0 || digits[i+1]==0) {
                return false;
            }
        }
        return true;
    }
    public static boolean gen_next(int n, Integer[] digits){
        int i=n-1;
        while(i>0 && digits[i]<=digits[i-1]) i--;
        if(i==0) return false;
        i--;
        int j=n-1;
        while(digits[j]<=digits[i]) j--;
        swap(Arrays.asList(digits), i, j);
        reverse(Arrays.asList(digits).subList(i+1,n));
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            Integer[] digits = new Integer[n];
            init(n,digits);
            while(gen_next(n,digits)){
                if(check(n,digits)){
                    xuat(n,digits);
                }
            }
            t--;
        }
    }
}