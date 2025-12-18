package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class TinhSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long fibo_1=1, fibo_2=1, fibo_n = 0;
            if(n==1 || n==2 ) System.out.println(1);
            else{
                for(int i=3; i<=n; i++){
                    fibo_n = fibo_1+ fibo_2;
                    fibo_1=fibo_2;
                    fibo_2=fibo_n;
                }
                System.out.println(fibo_n);
            }
        }
    }
}
