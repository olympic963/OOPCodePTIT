package com.mycompany.oopcodeptit;

import java.util.*;

public class ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            s = s.toLowerCase().trim();
            String[] name_part = s.split("\\s+");
            for(int i = 0; i < name_part.length; i++) {
                name_part[i] = name_part[i].substring(0,1).toUpperCase()+ name_part[i].substring(1);
                System.out.print(name_part[i].trim()+" ");
            }
            System.out.println();
        }
    }
}