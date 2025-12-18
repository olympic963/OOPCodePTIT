package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;

public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) input.readObject();
            for(Integer i : list){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}