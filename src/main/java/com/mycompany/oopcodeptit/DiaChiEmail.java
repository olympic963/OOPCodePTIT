package com.mycompany.oopcodeptit;

import java.util.*;

public class DiaChiEmail {
    public static Map<String, Integer> email = new HashMap<>();
    public static String chuanhoa(String s) {
        s = s.toLowerCase().trim();
        String[] words = s.split("\\s+");
        String res = words[words.length - 1];
        for (int i = 0; i < words.length-1; i++) {
            res += words[i].substring(0,1);
        }
        if(!email.containsKey(res)) {
            email.put(res, 1);
        } else{
            email.put(res, email.get(res) + 1);
            res+=email.get(res);
        }
        res+="@ptit.edu.vn";
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(chuanhoa(s));
        }
    }
}
