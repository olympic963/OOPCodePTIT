package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class SoTamPhan {
    public static boolean isTri(String s){
        for(char i :s.toCharArray()){
            if(i-'0'>2) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            System.out.println(isTri(s)?"YES":"NO");
            t--;
        }
    }
}