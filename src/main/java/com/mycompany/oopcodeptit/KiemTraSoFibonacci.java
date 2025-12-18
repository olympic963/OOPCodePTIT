package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class KiemTraSoFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            long fibo_1=0, fibo_2=1, fibo_n = 0;
            if(n==0 || n==1 ) System.out.println("YES");
            else{
                boolean check=false;
                for(int i=3; i<=93; i++){
                    fibo_n = fibo_1+ fibo_2;
                    if(fibo_n == n){
                        check= true;
                        break;
                    }
                    if(fibo_n > n) break;
                    fibo_1=fibo_2;
                    fibo_2=fibo_n;
                }
                if(check) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
