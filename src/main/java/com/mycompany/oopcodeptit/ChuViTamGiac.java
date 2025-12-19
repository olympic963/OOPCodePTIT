package com.mycompany.oopcodeptit;

import java.util.*;

class Pointt {
    private double x;
    private double y;

    public Pointt() {
    }

    public Pointt(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Pointt(Pointt p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double distance(Pointt p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
    public double distance(Pointt p1, Pointt p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public String toString() {
        return "Pointt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            Pointt p1 = new Pointt(sc.nextDouble(), sc.nextDouble());
            Pointt p2 = new Pointt(sc.nextDouble(), sc.nextDouble());
            Pointt p3 = new Pointt(sc.nextDouble(), sc.nextDouble());
            double ab = p1.distance(p2);
            double bc = p2.distance(p3);
            double ac = p1.distance(p3);
            if( ab+bc<=ac|| bc+ac<=ab||ab+ac<=bc){
                System.out.println("INVALID");
            }else{
                System.out.printf("%.3f\n", ab+bc+ac);
            }
        }
    }
}