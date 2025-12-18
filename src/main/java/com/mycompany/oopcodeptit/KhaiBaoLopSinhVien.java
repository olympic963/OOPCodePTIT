package com.mycompany.oopcodeptit;

import java.util.*;

class SinhVien{
    private String maSV, hoTen, lop, ngaySinh;
    private float diemGPA;

    public SinhVien() {
        this.maSV="";
        this.hoTen="";
        this.lop="";
        this.ngaySinh="";
        this.diemGPA=0;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemGPA() {
        return diemGPA;
    }

    public void setDiemGPA(float diemGPA) {
        this.diemGPA = diemGPA;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f",maSV, hoTen, lop, ngaySinh, diemGPA);
    }
}
public class KhaiBaoLopSinhVien {
    public static String chuanHoaNgay(String s){
        String[] part = s.trim().split("/");
        if(part[0].length()<2) part[0] = "0"+part[0];
        if(part[1].length()<2) part[1] = "0"+part[1];
        return part[0]+"/"+part[1]+"/"+part[2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien2 sv = new SinhVien2();
        sv.setMaSV("B20DCCN001");
        sv.setHoTen(sc.nextLine());
        sv.setLop(sc.nextLine());
        sv.setNgaySinh(chuanHoaNgay(sc.nextLine()));
        sv.setDiemGPA(sc.nextFloat());
        System.out.println(sv);
    }
}