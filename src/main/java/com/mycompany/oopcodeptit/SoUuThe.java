package com.mycompany.oopcodeptit;

import java.util.*;

public class SoUuThe {
    public static short dx(String s){
        int leOrChan = 0;
        if(s.length()%2!=0) leOrChan = 1;
        int cntLe=0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)) || s.charAt(0)=='0') {
                return -1;
            }
            if((s.charAt(i)-'0')%2==1) cntLe++;
        }
        if((leOrChan==0 && cntLe<s.length()-cntLe) || (leOrChan==1 && cntLe>s.length()-cntLe) ) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            if(dx(s)==-1) System.out.println("INVALID");
            else if(dx(s)==0) System.out.println("NO");
            else System.out.println("YES");

        }
    }
}