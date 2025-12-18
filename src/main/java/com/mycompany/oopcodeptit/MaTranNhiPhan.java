package com.mycompany.oopcodeptit;

import java.util.*;

public class MaTranNhiPhan {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                sum+=input[i][j];
                if(sum==2){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}