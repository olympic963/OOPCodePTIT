package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class ChuSo4VaChuSo7 {
    public static boolean check47(String n){
        int count=0;
        for(int i=0; i<n.length() ;i++){
            if(n.charAt(i)=='4' || n.charAt(i)=='7'){
                count++;
            }
        }
        return count==4 || count==7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check47(s)?"YES":"NO");
    }
}