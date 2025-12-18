package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class BoiSoChungUocSoChung {
    private static long USCLN(long a, long b){
        while(b!=0){
            long tmp = a;
            a=b;
            b=tmp%b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.print(a*b/USCLN(a,b)+" ");
            System.out.println(USCLN(a,b));
        }
    }
 
}
