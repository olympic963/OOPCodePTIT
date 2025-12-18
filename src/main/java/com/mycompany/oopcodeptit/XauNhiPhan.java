package com.mycompany.oopcodeptit;

import java.util.ArrayList;
import java.util.Scanner;

public class XauNhiPhan {
    public static ArrayList<Long> len = new ArrayList<>();
    public static void sinhdodai(){
        len.add(0L);
        len.add(1L);
        len.add(1L);
        for(int i=3; i<93; i++){
            len.add(len.get(i-2)+len.get(i-1));
        }
    }
    public static char findChar(int n, long k){
        while(n>2){
            if(k<=len.get(n-2))
                n-=2;
            else{
                k -= len.get(n-2);
                n-=1;
            }
        }
        return n==1?'0':'1';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sinhdodai();
//        System.out.println(len);
        while(t>0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(findChar(n,k));
            t--;
        }
    }
}