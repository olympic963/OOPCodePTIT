package com.mycompany.oopcodeptit;

import java.util.*;

public class XauKhacNhauDaiNhat {
    public static int process(String a, String b){
        if(a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(process(a,b));
        }
    }
}