package com.mycompany.oopcodeptit;

import java.util.Scanner;
public class TamGiacRong {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int N = sc.nextInt();
        sc.close();

        if (N <= 0) return;

        // Dòng 1 (đỉnh)
        if (N >= 1) {
            printChars(' ', N - 1);
            System.out.println('*');
        }

        // Các dòng giữa (2 .. N-1)
        for (int i = 2; i <= N - 1; i++) {
            printChars(' ', N - i);        // khoảng trắng đầu
            System.out.print('*');         // cạnh trái
            printChars(' ', 2 * i - 3);    // phần rỗng giữa
            System.out.println('*');       // cạnh phải
        }

        // Dòng cuối (nếu N >= 2) in đầy
        if (N >= 2) {
            int total = 2 * N - 1;
            printChars('*', total);
            System.out.println();
        }
    }

    // Hàm phụ in ký tự ch repeated count lần (nếu count <= 0 thì không in)
    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) System.out.print(ch);
    } 
}
