package com.mycompany.oopcodeptit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//Trick lỏ: bài bắt dùng hàm main có sẵn chứ không bắt dùng Scanner có sẵn
// -> tạo Scanner giả sử dụng BufferedReader để scan input nhanh nhất
// Bài này MLE do bản thân java.util.Scanner ngốn khá nhiều bộ nhớ
// Regex engine : ~10-15 MB
//Charset + Locale: ~5 MB
//Char buffer: ~1-2 MB
//Object phụ: ~5-10 MB
//Tổng: 25-35MB
//Tính thêm JVM + Số lượng Object input => MLE
//=> Cần tối ưu Scanner để có thể chứa được input lớn
// Đã check AC: 0.17s 46596Kb
class Scanner {
    private BufferedReader br;
    private StringTokenizer st;
    public Scanner(InputStream in) {
        br = new BufferedReader(new InputStreamReader(in));
    }
    public int nextInt() {
        try {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        } catch (IOException e) {
            return 0;
        }
    }
}
class Point3D{
    private int x,y,z;

    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        // 4 điểm ABCD cùng 1 mặt phẳng -> 3 vector AB, AC, AD đồng phẳng
        //3 vector đồng phẳng <=> tích hỗn hợp (vô hướng) của:
        // (AB x AC là vector pháp tuyến của mặt phẳng ABC) với AD bằng 0
        // (vector pháp tuyến của mặt phẳng vuông góc với AD => đồng phẳng):
        // (AB x AC) * AD = 0
        // Lưu ý các vector AB, AC, AD khi tính toán phải chung gốc A
        //Vector p1p2
        long x1 = p2.x - p1.x;
        long y1 = p2.y - p1.y;
        long z1 = p2.z - p1.z;

        //Vector p1p3
        long x2 = p3.x - p1.x;
        long y2 = p3.y - p1.y;
        long z2 = p3.z - p1.z;

        //Vector p1p4
        long x3 = p4.x - p1.x;
        long y3 = p4.y - p1.y;
        long z3 = p4.z - p1.z;

        //Tích có hướng p1p2 x p1p3
        long x4 = y1*z2 - y2 *z1;
        long y4 = z1 *x2 - z2 *x1;
        long z4 = x1 *y2 - x2 *y1;

        //Tích vô hướng của (p1p2 x p1p3) * p1p4
        return  (x3 *x4 + y3 *y4 + z3 *z4) == 0L;
    }
}
public class BonDiemTrenMatPhang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
