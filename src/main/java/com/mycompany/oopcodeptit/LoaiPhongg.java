package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class LoaiPhong implements Comparable<LoaiPhong>{
    private String loai, tenLoai;
    private float donGia, phiPhucVu;

    public LoaiPhong(String input) {
        String[] parts = input.trim().split("\\s+");
        this.loai = parts[0];
        this.tenLoai = parts[1];
        this.donGia = Float.parseFloat(parts[2]);
        this.phiPhucVu = Float.parseFloat(parts[3]);
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.tenLoai.compareTo(o.tenLoai);
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.2f", loai, tenLoai, donGia, phiPhucVu);
    }
}
public class LoaiPhongg {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
