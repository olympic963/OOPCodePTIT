package com.mycompany.oopcodeptit;

import java.math.BigInteger;
import java.util.*;

class PhanSo2{
    private BigInteger tu;
    private BigInteger mau;

    public PhanSo2(BigInteger tu, BigInteger mau) {
        BigInteger tmp = tu.gcd(mau);
        this.tu = tu.divide(tmp);
        this.mau = mau.divide(tmp);
    }
    public PhanSo2 cong(PhanSo2 p) {
        BigInteger mau_tmp = this.mau.multiply(p.mau);
        BigInteger tu_tmp = this.tu.multiply(p.mau).add(p.tu.multiply(this.mau));
        return new PhanSo2(tu_tmp, mau_tmp);
    }
    @Override
    public String toString() {
        return this.tu.toString() + '/' + this.mau.toString();
    }
}
public class TongPhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSo2 ps1 = new PhanSo2(sc.nextBigInteger(), sc.nextBigInteger());
        PhanSo2 ps2 = new PhanSo2(sc.nextBigInteger(), sc.nextBigInteger());
        System.out.println(ps1.cong(ps2));
    }
}