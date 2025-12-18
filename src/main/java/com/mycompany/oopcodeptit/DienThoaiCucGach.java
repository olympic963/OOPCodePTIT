package com.mycompany.oopcodeptit;

import java.util.*;

public class DienThoaiCucGach {
    public static boolean dx(List<Integer> s){
        for(int i = 0; i < s.size()/2; i++){
            if(s.get(i)!=s.get(s.size()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            s = s.toLowerCase();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='b'||s.charAt(i)=='c') list.add(2);
                if(s.charAt(i)=='d'||s.charAt(i)=='e'||s.charAt(i)=='f') list.add(3);
                if(s.charAt(i)=='g'||s.charAt(i)=='h'||s.charAt(i)=='i') list.add(4);
                if(s.charAt(i)=='j'||s.charAt(i)=='k'||s.charAt(i)=='l') list.add(5);
                if(s.charAt(i)=='m'||s.charAt(i)=='n'||s.charAt(i)=='o') list.add(6);
                if(s.charAt(i)=='p'||s.charAt(i)=='q'||s.charAt(i)=='r'||s.charAt(i)=='s') list.add(7);
                if(s.charAt(i)=='t'||s.charAt(i)=='u'||s.charAt(i)=='v') list.add(8);
                if(s.charAt(i)=='w'||s.charAt(i)=='x'||s.charAt(i)=='y'||s.charAt(i)=='z') list.add(9);
            }
            System.out.println(dx(list)?"YES":"NO");
        }
    }
}