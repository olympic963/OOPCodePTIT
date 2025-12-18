package com.mycompany.oopcodeptit;

import java.util.*;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> res =  new HashSet<>(Arrays.asList(s.split("(?<=.)")));
        System.out.println(res.size());
    }
}