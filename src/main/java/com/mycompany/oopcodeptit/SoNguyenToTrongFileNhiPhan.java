package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;
public class SoNguyenToTrongFileNhiPhan {
    public static int max_range = 10_000+1;
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
        ObjectInputStream ois =
                new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream("SONGUYEN.in")
                        )
                );
        ArrayList<Integer> input = (ArrayList<Integer>) ois.readObject();
        Map<Integer, Integer> map = new TreeMap<>();
        for(Integer i:input){
            if(snt[i]==0){
                map.put(i,map.getOrDefault(i,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}