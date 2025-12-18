package com.mycompany.oopcodeptit;

import java.util.*;

class ThoiGian{
    private int gio, phut, giay;

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    public int getGiay() {
        return giay;
    }

    public void setGiay(int giay) {
        this.giay = giay;
    }

    @Override
    public String toString() {
        return gio +" "+phut+" "+ giay;
    }
}
public class SapXepThoiGian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ThoiGian[] tg = new ThoiGian[n];
        for (int i = 0; i < n; i++) {
            tg[i] = new ThoiGian(sc.nextInt(), sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(tg, new Comparator<ThoiGian>() {
            @Override
            public int compare(ThoiGian t1, ThoiGian t2) {
                if(t1.getGio() == t2.getGio()){
                    if(t1.getPhut() == t2.getPhut()){
                        return t1.getGiay() - t2.getGiay();
                    }
                    else{
                        return t1.getPhut() - t2.getPhut();
                    }
                }
                return t1.getGio() - t2.getGio();
            }
        } );
        for (ThoiGian t : tg) {
            System.out.println(t);
        }
    }
}