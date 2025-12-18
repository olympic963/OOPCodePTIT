package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for(int i=1; i <=n; i++){
            long product = 1;
            for(int j=1; j<=i; j++){
                product*=(long)j;
            }
            sum+=product;
        }
        System.out.println(sum);
    }
}
