package com.mycompany.oopcodeptit;

import java.util.*;

public class BoSungDaySo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            input.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < input.get(n-1); i++) {
            if(!input.contains(i))
                list.add(i);
        }
        if(list.isEmpty()){
            System.out.println("Excellent!");
        }else{
            for(int i:list) System.out.println(i);
        }
    }
}