package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class SoKhongLienKe {
    public static boolean checklk(String n){
        int sum = n.charAt(0)-'0';
        for(int i=1; i<n.length() ;i++){
            if(Math.abs(n.charAt(i)- n.charAt(i-1))!=2){
                return false;
            }
            sum+=n.charAt(i)-'0';
        }
        return sum%10==0;
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