package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(true){
            String s = sc.nextLine();
            if(s.trim().equals("END")) break;
            String[] parts = s.trim().toLowerCase().split("\\s+");
            String res="";
            for(int i=0;i<parts.length;i++){
                res+=parts[i].substring(0,1).toUpperCase()+ parts[i].substring(1)+" ";
            }
            System.out.println(res);
        }
    }
}