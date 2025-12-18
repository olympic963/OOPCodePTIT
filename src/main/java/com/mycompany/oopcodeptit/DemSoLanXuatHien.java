package com.mycompany.oopcodeptit;

import java.util.*;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int stt=1;
        while (t-- > 0) {
            int n = sc.nextInt();
            Map<Integer, Integer> map = new LinkedHashMap<>();
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (map.containsKey(x)) {
                    map.put(x, map.get(x) + 1);
                }else{
                    map.put(x,1);
                }
            }
            System.out.println("Test "+stt+":");
            for(Map.Entry<Integer,Integer> entry :map.entrySet()){
                System.out.printf(entry.getKey()+" xuat hien "+entry.getValue()+" lan\n");
            }
            stt++;
        }
    }
}