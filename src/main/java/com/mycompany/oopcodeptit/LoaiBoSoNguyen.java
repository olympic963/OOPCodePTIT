package com.mycompany.oopcodeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                sc.next();
            }else res.add(sc.next());
        }
        Collections.sort(res);
        for(String s : res){
            System.out.print(s+" ");
        }
    }
}