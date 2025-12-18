package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class UocSoChiaHetCho2 {
    private static int USCHC2(int n){
        int cnt=0;
        for(int i=1; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                cnt++;
                if(i != n/i ) cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if(n%2 == 0) System.out.println(USCHC2(n/2));
            else System.out.println(0);
        }
    }
}
