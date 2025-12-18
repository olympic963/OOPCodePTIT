package com.mycompany.oopcodeptit;

import java.math.BigInteger;
import java.util.*;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            System.out.println((a.mod(b)==BigInteger.ZERO || b.mod(a)==BigInteger.ZERO)?"YES":"NO");
        }
    }
}