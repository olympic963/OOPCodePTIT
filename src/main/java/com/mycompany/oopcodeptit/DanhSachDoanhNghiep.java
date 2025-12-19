package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class DoanhNghiep implements Comparable<DoanhNghiep> {
    private String maDN, tenDN;
    private short soSV;

    public DoanhNghiep(String maDN, String tenDN, short soSV) {
        this.maDN = maDN.trim();
        this.tenDN = tenDN.trim();
        this.soSV = soSV;
    }

    @Override
    public int compareTo(DoanhNghiep o) {
        return this.maDN.compareTo(o.maDN);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", maDN, tenDN, soSV);
    }
}
public class DanhSachDoanhNghiep {
    public static void main(String[] args) throws IOException {
        File input = new File("DN.in");
        Scanner sc = new Scanner(input);
        int n = sc.nextInt();
        DoanhNghiep[] dn = new DoanhNghiep[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            dn[i] = new DoanhNghiep(sc.nextLine(), sc.nextLine(),sc.nextShort());
        }
        Arrays.sort(dn);
        for(DoanhNghiep d : dn) {
            System.out.println(d);
        }
    }
}
