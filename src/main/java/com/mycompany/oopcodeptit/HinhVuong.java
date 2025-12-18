package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class HinhVuong {
    public static int area(int xtd1, int ytd1, int xpt1, int ypt1, int xtd2, int ytd2, int xpt2, int ypt2 ){
        int dai = Math.max(xpt2,xpt1) -  Math.min(xtd2, xtd1);
        int rong = Math.max(ypt1, ypt2) - Math.min(ytd2, ytd1);
        return Math.max(dai, rong)*Math.max(dai,rong);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xtd1 = sc.nextInt();
        int ytd1 = sc.nextInt();
        int xpt1 = sc.nextInt();
        int ypt1 = sc.nextInt();
        int xtd2 = sc.nextInt();
        int ytd2 = sc.nextInt();
        int xpt2 = sc.nextInt();
        int ypt2 = sc.nextInt();
        System.out.println(area(xtd1, ytd1, xpt1, ypt1, xtd2, ytd2, xpt2, ypt2));
    }
}
