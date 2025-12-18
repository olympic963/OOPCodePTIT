package com.mycompany.oopcodeptit;

import java.util.*;

class Rectangle{
    private double width;
    private double height;
    private String color;

    public Rectangle() {
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        color = color.toLowerCase().trim();
        color = color.substring(0,1).toUpperCase()+ color.substring(1);
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color.toLowerCase();
        color = color.substring(0,1).toLowerCase()+ color.substring(1);
        this.color = color;
    }

    public double findArea() {
        return width * height;
    }
    public double findPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("%.0f %.0f %s",findPerimeter(), findArea(), color);
    }
}
public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        String c = sc.nextLine();
        if(w<=0 ||h<=0 ) System.out.println("INVALID");
        else{
            Rectangle r = new Rectangle(w, h, c);
            System.out.println(r.toString());
        }

    }
}