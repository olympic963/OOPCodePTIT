package com.mycompany.oopcodeptit;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class DayConTangDan {
    public static void init(int n, int a[]){
        for(int i=0; i<n; i++) a[i]=0;
    }
    public static void xuat(int n, int a[], int b[],ArrayList<String> res){
        String s="";
        for(int i=0; i<n; i++){
            if(a[i]==1){
                s+=b[i]+" ";
            }
        }
        res.add(s);
    }
    public static boolean check(int n, int a[], int b[]){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i]==1){
                if(res. isEmpty()){
                    res.add(b[i]);
                }else{
                    if(res.get(res.size()-1)>b[i]){
                        return false;
                    }else{
                        res.add(b[i]);
                    }
                }

            }
        }
        if(res.size()<2) return false;
        return true;
    }
    public static boolean gen_next(int n, int a[]){
        int i = n-1;
        while(i>= 0 && a[i]==1){
            a[i]=0;
            i--;
        }
        if (i < 0) return false;
        a[i] = 1;
        return true;
    }

    public static void main(String[] args) throws IOException {
        File input = new File("DAYSO.in");
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        ArrayList<String> res = new ArrayList<>();
        init(n, a);
        while(gen_next(n, a)){
            if(check(n, a, b)){
                xuat(n, a, b, res);
            }
        }
        Collections.sort(res);
        for(String s : res){
            System.out.println(s);
        }
    }
}