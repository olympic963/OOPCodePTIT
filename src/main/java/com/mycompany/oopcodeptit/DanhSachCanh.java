package com.mycompany.oopcodeptit;

import java.util.*;

public class DanhSachCanh {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(input[i][j]==1){
                    System.out.println("("+(i+1)+","+(j+1)+")");
                }
            }
        }
    }
}