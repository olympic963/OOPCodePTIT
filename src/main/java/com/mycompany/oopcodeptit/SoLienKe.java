package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class SoLienKe {
    public static boolean checklk(String n){
        for(int i=1; i<n.length() ;i++){
            if(Math.abs(n.charAt(i)- n.charAt(i-1))!=1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t>0){
            String s = sc.nextLine();
            System.out.println(checklk(s)?"YES":"NO");
            t--;
        }

    }
}