package com.mycompany.oopcodeptit;

import java.util.*;

class MatHang implements Comparable<MatHang>{
    private String maMH, tenMH, donViTinh;
    private long giaMua, giaBan;
    private static short count=0;

    public MatHang(String tenMH, String donViTinh, long giaMua, long giaBan) {
        this.maMH =String.format("MH%03d", ++count);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    @Override
    public int compareTo(MatHang o) {
        if(this.giaBan - this.giaMua == o.giaBan - o.giaMua) return this.maMH.compareTo(o.maMH);
        else if((this.giaBan - this.giaMua) > (o.giaBan - o.giaMua)) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %d %d",
                this.maMH, this.tenMH, this.donViTinh,
                this.giaMua, this.giaBan, this.giaBan-this.giaMua);
    }
}
public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        MatHang[] mh = new MatHang[n];
        for (int i = 0; i < n; i++) {
            mh[i] = new MatHang(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            sc.nextLine();
        }
        Arrays.sort(mh);
        for(MatHang m :mh ){
            System.out.println(m);
        }
    }
}