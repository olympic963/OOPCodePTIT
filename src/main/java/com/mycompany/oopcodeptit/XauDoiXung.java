package com.mycompany.oopcodeptit;

import java.util.*;

public class XauDoiXung {
    public static boolean dx(String s){
        int count = 0;
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) count++;
            if(count>1) return false;
        }
        if((count==1 && s.length()%2==0)||(count<=1 && s.length()%2==1)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(dx(s)?"YES":"NO");
        }
    }
}