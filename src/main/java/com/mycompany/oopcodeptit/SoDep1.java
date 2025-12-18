package com.mycompany.oopcodeptit;

import java.util.*;

public class SoDep1 {
    public static boolean sodep(String s){
        for(int i=0;i<s.length()/2;i++){
            if((int)s.charAt(i)%2==1 || s.charAt(i)!=s.charAt(s.length()-1-i)){
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