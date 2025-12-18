package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;

public class LietKeTuKhacNhau {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        try{
            File input = new File("VANBAN.in");
            Scanner sc = new Scanner(input);
            while(sc.hasNext()){
                String word = sc.next().toLowerCase();
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}