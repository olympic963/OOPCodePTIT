package com.mycompany.oopcodeptit;

import java.util.*;

class GiaoVien {
    private String maNgach, hoTen;
    private long luongCoBan,bacLuong, phuCap;

    public GiaoVien(String maNgach, String hoTen, long luongCoBan) {
        this.maNgach = maNgach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;
        String chucVu = this.maNgach.substring(0,2);
        this.bacLuong = Long.parseLong(this.maNgach.substring(2));
        if(chucVu.equals("HT")) this.phuCap = 2000000L;
        else if(chucVu.equals("HP")) this.phuCap = 900000L;
        else this.phuCap = 500000L;
    }
    public long tinhThuNhap(){
        return this.luongCoBan * this.bacLuong + this.phuCap;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d %d", maNgach, hoTen, bacLuong, phuCap, tinhThuNhap());
    }
}
public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien gv = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.println(gv);
    }
}