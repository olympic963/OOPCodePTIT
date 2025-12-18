package com.mycompany.oopcodeptit;

import java.io.File;
import java.util.*;

class KhachHang{
    private String maKH, tenKH, gioiTinh, ngaySinh, diaChi;
    private static long count=0;

    public KhachHang( String tenKH, String gioiTinh, String ngaySinh, String diaChi) {
        this.maKH = String.format("KH%03d", ++count);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH() {
        return maKH;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.tenKH, this.diaChi);
    }
}
class MatHangg {
    private String maMH, tenMH, donViTinh;
    private long giaMua, giaBan;
    private static long count=0;

    public MatHangg(String tenMH, String donViTinh, long giaMua, long giaBan) {
        this.maMH =String.format("MH%03d", ++count);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public long getGiaBan() {
        return giaBan;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", this.tenMH, this.donViTinh, this.giaMua, this.giaBan);
    }
}
class HoaDon{
    private static long count = 0;
    private String maHD;
    private KhachHang khachHang;
    private MatHangg matHangg;
    private int soLuong;

    public HoaDon(KhachHang khachHang, MatHangg matHangg, int soLuong) {
        this.maHD = String.format("HD%03d", ++count);
        this.khachHang = khachHang;
        this.matHangg = matHangg;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d", this.maHD, this.khachHang, this.matHangg, this.soLuong, (long)this.matHangg.getGiaBan()*this.soLuong);
    }
}
public class BaiToanMatHang {
    public static String chuanHoaNgay(String s){
        String[] part = s.trim().split("/");
        if(part[0].length()<2) s = "0"+part[0];
        if(part[1].length()<2) s = "0"+part[1];
        return part[0]+"/"+part[1]+"/"+part[2];
    }
    public static void main(String[] args) {
        Scanner sc;
        try{
            File kh_in = new File("KH.in");
            sc = new Scanner(kh_in);
            int n =sc.nextInt();
            sc.nextLine();
            Map<String, KhachHang> khachHang = new HashMap<>();
            for(int i=0;i<n;i++){
                KhachHang kh = new KhachHang(sc.nextLine(), sc.nextLine(), chuanHoaNgay(sc.nextLine()), sc.nextLine());
                khachHang.put(kh.getMaKH(), kh);
            }
            sc.close();
            File mh_in = new File("MH.in");
            sc = new Scanner(mh_in);
            int m = sc.nextInt();
            Map<String, MatHangg> matHang = new HashMap<>();
            for(int i=0;i<m;i++){
                sc.nextLine();
                MatHangg mh = new MatHangg(sc.nextLine(), sc.nextLine(),sc.nextInt(),sc.nextInt());
                matHang.put(mh.getMaMH(), mh);
            }
            sc.close();
            File hd_in = new File("HD.in");
            sc = new Scanner(hd_in);
            int k = sc.nextInt();
            sc.nextLine();
            HoaDon[] hoaDon = new HoaDon[k];
            for(int i=0;i<k;i++){
                String[] hd = sc.nextLine().trim().split("\\s+");
                hoaDon[i] = new HoaDon(khachHang.get(hd[0]), matHang.get(hd[1]), Integer.parseInt(hd[2]));
            }
            for(int i=0;i<k;i++){
                System.out.println(hoaDon[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}