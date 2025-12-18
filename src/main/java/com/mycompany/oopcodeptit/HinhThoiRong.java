package com.mycompany.oopcodeptit;

import java.util.Scanner;
public class HinhThoiRong {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        if (N <= 0) return;

        // Nửa trên (kể cả dòng giữa)
        for (int i = 1; i <= N; i++) {
            printChars(' ', N - i); // khoảng trắng trước
            if (i == 1) {
                System.out.println("*"); // đỉnh trên
            } else {
                System.out.print("*");
                printChars(' ', 2 * i - 3); // khoảng trống giữa
                System.out.println("*");
            }
        }

        // Nửa dưới (không in lại dòng giữa)
        for (int i = N - 1; i >= 1; i--) {
            printChars(' ', N - i);
            if (i == 1) {
                System.out.println("*"); // đỉnh dưới
            } else {
                System.out.print("*");
                printChars(' ', 2 * i - 3);
                System.out.println("*");
            }
        }
    }

    // Hàm phụ in ký tự ch lặp lại count lần
    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) System.out.print(ch);
    }
}
