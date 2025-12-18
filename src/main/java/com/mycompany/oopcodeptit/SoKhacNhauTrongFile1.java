package com.mycompany.oopcodeptit;

import java.io.File;
import java.math.BigInteger;
import java.util.*;

public class SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        try{
            File  input = new File("DATA.in");
            Scanner sc = new Scanner(input);
            Map<Integer, Integer> map = new TreeMap<>();
            while(sc.hasNextInt()){
                int key = sc.nextInt();
                if(map.containsKey(key)){
                    map.put(key, map.get(key) + 1);
                }else{
                    map.put(key,1);
                }
            }
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}