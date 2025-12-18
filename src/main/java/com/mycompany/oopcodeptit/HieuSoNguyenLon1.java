package com.mycompany.oopcodeptit;

import java.math.BigInteger;
import java.util.*;

public class HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            String res = a.subtract(b).abs().toString();
            String max = a.max(b).toString();
            while(res.length() < max.length()){
                res = "0" + res;
            }
            System.out.println(res);
        }
    }
}