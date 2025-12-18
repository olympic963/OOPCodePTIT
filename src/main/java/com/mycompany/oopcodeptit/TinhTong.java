package com.mycompany.oopcodeptit;

import java.io.File;
import java.util.*;

public class TinhTong {
    public static void main(String[] args) {
        try{
            File  input = new File("DATA.in");
            Scanner sc = new Scanner(input);
            long sum=0;
            while(sc.hasNext()){
                if(sc.hasNextInt()){
                    sum+=sc.nextInt();
                }else{
                    sc.next();
                }
            }
            System.out.println(sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}