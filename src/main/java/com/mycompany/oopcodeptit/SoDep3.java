package com.mycompany.oopcodeptit;

import java.util.*;

public class SoDep3 {
    public static boolean sodep(String s){
        String csnt = "2357";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i) || !csnt.contains(s.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(sodep(s)?"YES":"NO");
        }
    }
}