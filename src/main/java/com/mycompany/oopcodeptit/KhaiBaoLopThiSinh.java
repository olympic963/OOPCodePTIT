package com.mycompany.oopcodeptit;

import java.util.*;

class ThiSinh{
    private String hoTen;
    private String ngaySinh;
    private float diem1, diem2, diem3;

    public ThiSinh(String hoTen, String ngaySinh, float diem1, float diem2, float diem3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f",hoTen.trim(), ngaySinh.trim(), (diem1 + diem2 + diem3));
    }
}
public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        System.out.println(ts);
    }
}