package com.mycompany.oopcodeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class SoThuanNgichTrongFile {
    public static boolean check(String s){
        if(s.length()%2==0 || s.length()<2){
            return false;
        }
        for(int i=0;i<=s.length()/2;i++){
            if((s.charAt(i)!=s.charAt(s.length()-1-i)) || (s.charAt(i)-'0')%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA1.in")));
        ArrayList<Integer> input1 = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> map1 = new TreeMap<>();
        for(Integer i:input1){
            if(check(i.toString())){
                map1.put(i,map1.getOrDefault(i,0)+1);
            }
        }
        ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("DATA2.in")));
        ArrayList<Integer> input2 = (ArrayList<Integer>) ois.readObject();
        Map<Integer,Integer> map2 = new TreeMap<>();
        for(Integer i:input2){
            if(check(i.toString())){
                map2.put(i,map2.getOrDefault(i,0)+1);
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry1:map1.entrySet()){
            if( map2.containsKey(entry1.getKey())){
                res.add(entry1.getKey()+" "+(entry1.getValue()+ map2.get(entry1.getKey())));
            }
        }
        for(int i=0;i<Math.min(10, res.size());i++){
            System.out.println(res.get(i));
        }
    }
}