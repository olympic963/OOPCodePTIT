package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class TongUocSo1 {
    private static int TongUoc(int n){
        int sum=0;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                while(n%i==0){
                    n=n/i;
                    sum+=i;
                }
            }
        }
        if(n>1) sum+=n;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        while(t-- >0){
            int n = sc.nextInt();
            sum+=TongUoc(n);
        }
        System.out.println(sum);
    }
}
