package com.mycompany.oopcodeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class CapSoNguyenToTrongFile1 {
    public static int max_range = 1_000_000+1;
    public static int[] snt = new int[max_range];
    public static void sang(){
        snt[0]=1;
        snt[1]=1;
        for(int i=2;i<=Math.sqrt(max_range);i++){
            if(snt[i]==0){
                for(int j=i*i;j<max_range;j+=i){
                    snt[j]=1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        sang();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> input1 = (ArrayList<Integer>) ois.readObject();
        Set<Integer> set1 = new TreeSet<>();
        for(Integer i:input1){
            if(snt[i]==0){
                set1.add(i);
            }
        }
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> input2 = (ArrayList<Integer>) ois.readObject();
        Set<Integer> set2 = new TreeSet<>();
        for(Integer i:input2){
            if(snt[i]==0){
                set2.add(i);
            }
        }
        ArrayList<String> res = new ArrayList<>();
        for(Integer i:set1){
            for(Integer j:set2){
                if(i+j==max_range-1){
                    res.add(i+" "+j);
                }
            }
            if(i>max_range/2) break;
        }
        for(String s:res){
            System.out.println(s);
        }
    }
}