package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            System.out.println(Math.abs(Math.sqrt(n)-(int)Math.sqrt(n))<10e-9?"YES":"NO");
            t--;
        }
    }
}