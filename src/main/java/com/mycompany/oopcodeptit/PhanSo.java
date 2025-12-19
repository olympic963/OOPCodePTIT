package com.mycompany.oopcodeptit;

import java.math.BigInteger;
import java.util.*;

class PhanSoo{
    private BigInteger tu;
    private BigInteger mau;

    public PhanSoo(BigInteger tu, BigInteger mau) {
        BigInteger tmp = tu.gcd(mau);
        this.tu = tu.divide(tmp);
        this.mau = mau.divide(tmp);
    }

    @Override
    public String toString() {
        return this.tu.toString() + '/' + this.mau.toString();
    }
}
public class PhanSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhanSoo ps = new PhanSoo(sc.nextBigInteger(), sc.nextBigInteger());
        System.out.println(ps);
    }
}