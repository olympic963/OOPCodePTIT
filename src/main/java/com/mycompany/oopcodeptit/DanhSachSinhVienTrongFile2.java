package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;
class SinhVien2 {
    private static short count = 0;
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;

    public SinhVien2(String hoTen, String lop, String ngaySinh, float gpa) {
        this.maSV = String.format("B20DCCN%03d",++count);
        this.hoTen = hoTen;
        this.ngaySinh = chuanHoaNgay(ngaySinh);
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", maSV, hoTen, lop, ngaySinh, gpa);
    }
    public String chuanHoaNgay(String s){
        String[] part = s.trim().split("/");
        if(part[0].length()<2) part[0] = "0"+part[0];
        if(part[1].length()<2) part[1] = "0"+part[1];
        return part[0]+"/"+part[1]+"/"+part[2];
    }
}
public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) throws IOException {
        File input = new File("SV.in");
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        SinhVien2[] sv = new SinhVien2[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            sv[i] = new SinhVien2(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextFloat());
        }
        for(SinhVien2 svi : sv) {
            System.out.println(svi);
        }
    }
}