package com.mycompany.oopcodeptit;

import java.util.*;

public class SoDep2 {
    public static boolean sodep(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
            sum+=s.charAt(i)-'0';
        }
        if(sum%10!=0 || s.charAt(0)!='8') return false;
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