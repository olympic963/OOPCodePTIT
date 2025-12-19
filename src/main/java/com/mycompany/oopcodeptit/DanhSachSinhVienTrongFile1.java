package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVienn implements Comparable<SinhVienn> {
    public String maSV, hoTen, lop, email;

    public SinhVienn(String maSV, String hoTen, String lop, String email) {
        this.maSV = maSV;
        this.hoTen = chuanHoaTen(hoTen);
        this.lop = lop;
        this.email = email;
    }
    public String chuanHoaTen(String s){
        String[] part = s.trim().toLowerCase().split("\\s+");
        String res="";
        for(int i=0;i<part.length;i++){
            part[i]=part[i].substring(0,1).toUpperCase()+part[i].substring(1).toLowerCase();
            res+=part[i]+" ";
        }
        return res.trim();
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", maSV, hoTen, lop, email);
    }

    @Override
    public int compareTo(SinhVienn o) {
        return this.maSV.compareTo(o.maSV);
    }
}
public class DanhSachSinhVienTrongFile1 {
    public static void main(String[] args) throws IOException {
        File input = new File("SINHVIEN.in");
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVienn> list = new ArrayList<SinhVienn>();
        while (n-->0){
            SinhVienn sv= new SinhVienn(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(sv);
        }
        Collections.sort(list);
        for(SinhVienn sv: list){
            System.out.println(sv);
        }
    }
}
