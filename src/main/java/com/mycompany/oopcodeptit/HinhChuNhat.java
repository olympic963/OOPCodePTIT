package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a<=0 || b<=0) System.out.println("0");
        else{
            System.out.print((a+b)*2 + " ");
            System.out.print((long)a*b);
        }
    }
}
