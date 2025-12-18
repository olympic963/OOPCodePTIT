package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;
public class SoNguyenToLonNhatTrongFile {
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
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> input = (ArrayList<Integer>) ois.readObject();
        sang();
        int[] f = new int[max_range];
        int max = 0;
        for(Integer i : input){
            if(snt[i]==0){
                f[i]++;
                if(i>=max && f[i]>0) max=i;
            }
        }
        int count = 0;
        for(int i=max;i>=0;i--){
            if(f[i]>0 && count<10 ){
                System.out.println(i+" "+f[i]);
                count++;
            }
        }
    }
}