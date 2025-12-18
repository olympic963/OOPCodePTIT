package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;
class Pair<T1,T2>{
    private T1 first;
    private T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }
    public boolean isPrime() {
        return isPrimeNumber((Integer)first) && isPrimeNumber((Integer)second);
    }

    private boolean isPrimeNumber(int x) {
        if (x < 2 || (x>2 && x%2==0)) return false;
        for (int i = 3; i <= Math.sqrt(x); i+=2)
            if (x % i == 0) return false;
        return true;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
public class LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
    public static void main7397596(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
