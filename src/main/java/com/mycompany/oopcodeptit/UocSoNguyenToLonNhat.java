package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static long lpf(long n){
        int last = 0;
        for(int i =2; i<=Math.sqrt(n) ;i++){
            if(n%i==0){
                last=i;
                while(n%i==0){
                    n/=i;
                }
            }
        }
        if(n>1)return n;
        else return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            long a = sc.nextLong();
            System.out.println(lpf(a));
            t--;
        }
    }
}