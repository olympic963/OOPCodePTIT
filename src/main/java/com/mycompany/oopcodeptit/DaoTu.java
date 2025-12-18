package com.mycompany.oopcodeptit;

import java.util.*;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine().trim();
            String[] part = s.split("\\s+");
            for(String i:part){
                for(int j= i.length()-1; j>=0;j--){
                    System.out.print(i.charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}