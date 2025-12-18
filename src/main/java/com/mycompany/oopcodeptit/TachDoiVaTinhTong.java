package com.mycompany.oopcodeptit;

import java.io.File;
import java.math.BigInteger;
import java.util.*;

public class TachDoiVaTinhTong {
    public static void main(String[] args) {
        try{
            File  input = new File("DATA.in");
            Scanner sc = new Scanner(input);
            BigInteger n= sc.nextBigInteger();
            while(n.toString().length()!=1){
                BigInteger part1 = new BigInteger(n.toString().substring(0,n.toString().length()/2));
                BigInteger part2 = new BigInteger(n.toString().substring(n.toString().length()/2));
                n = part1.add(part2);
                System.out.println(n);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}