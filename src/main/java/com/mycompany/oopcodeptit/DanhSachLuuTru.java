package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

class KhachHangLuuTru implements Comparable<KhachHangLuuTru>{
    private static int count = 0;
    private String maKH, hoTen, maPhong;
    private LocalDate ngayDen, ngayDi;
    public KhachHangLuuTru(String hoTen, String maPhong, LocalDate ngayDen, LocalDate ngayDi) {
        this.maKH = String.format("KH%02d", ++count);
        this.hoTen = hoTen.trim();
        this.maPhong = maPhong.trim();
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d", maKH, hoTen, maPhong, ChronoUnit.DAYS.between(ngayDen, ngayDi));
    }

    @Override
    public int compareTo(KhachHangLuuTru o) {
        return (int) (ChronoUnit.DAYS.between(o.ngayDen, o.ngayDi) - ChronoUnit.DAYS.between(this.ngayDen, this.ngayDi));
    }
}
public class DanhSachLuuTru {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        KhachHangLuuTru[] khs = new KhachHangLuuTru[n];
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (int i = 0; i < n; i++) {
            khs[i] = new KhachHangLuuTru(sc.nextLine(), sc.nextLine(), LocalDate.parse(sc.nextLine(), dtf), LocalDate.parse(sc.nextLine(), dtf));
        }
        Arrays.sort(khs);
        for(KhachHangLuuTru kh : khs) {
            System.out.println(kh);
        }
    }
}
