package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String maMH, tenMon;
    private short soTinChi;

    public MonHoc(String maMH, String tenMon, short soTinChi) {
        this.maMH = maMH;
        this.tenMon = tenMon;
        this.soTinChi = soTinChi;
    }

    @Override
    public int compareTo(MonHoc o) {
        return this.tenMon.compareTo(o.tenMon);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", maMH, tenMon, soTinChi);
    }
}
public class DanhSachMonHoc {
    public static void main(String[] args) throws IOException {
        File input = new File("MONHOC.in");
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        MonHoc[] monHocs = new MonHoc[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            monHocs[i] = new MonHoc(sc.nextLine(), sc.nextLine(),sc.nextShort());
        }
        Arrays.sort(monHocs);
        for(MonHoc mh : monHocs) {
            System.out.println(mh);
        }
    }
}
