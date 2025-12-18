package com.mycompany.oopcodeptit;

import java.util.*;

class NhanVien{
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong ;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) {
        this.maNV = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKyHopDong = ngayKyHopDong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s %s %s",maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKyHopDong);
    }
}
public class KhaiBaoLopNhanVien {
    public static String chuanHoaNgay(String s){
        String[] part = s.trim().split("/");
        if(part[0].length()<2) part[0] = "0"+part[0];
        if(part[1].length()<2) part[1] = "0"+part[1];
        return part[0]+"/"+part[1]+"/"+part[2];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv = new NhanVien(sc.nextLine(), sc.nextLine(), chuanHoaNgay(sc.nextLine()), sc.nextLine(), sc.nextLine(), chuanHoaNgay(sc.nextLine()));
        System.out.println(nv);
    }
}