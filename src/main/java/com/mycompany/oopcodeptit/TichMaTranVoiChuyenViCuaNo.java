package com.mycompany.oopcodeptit;

import java.util.*;

public class TichMaTranVoiChuyenViCuaNo {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt=1;
        while(t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] input = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    input[i][j] = sc.nextInt();
                }
            }
            int[][] input_t = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    input_t[i][j] = input[j][i];
                }
            }
            int[][] output_t = new int[n][n];
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    for(int k = 0; k < n; k++) {
                        output_t[i][k]+=input[i][j]*input_t[j][k];
                    }
                }
            }
            System.out.println("Test "+ cnt+":" );
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    System.out.print(output_t[i][j]+" ");
                }
                System.out.println();
            }
            cnt++;
            t--;
        }
    }
}