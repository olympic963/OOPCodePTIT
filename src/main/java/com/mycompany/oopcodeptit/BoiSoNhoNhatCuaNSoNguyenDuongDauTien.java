package com.mycompany.oopcodeptit;

import java.util.*;

public class BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static ArrayList<Long> bsnn = new ArrayList<>();
    public static long gcd(long a, long b) {
        while(b!=0){
            long tmp = a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static long lcm(long a, long b) {
        return a*b/gcd(a,b);
    }
    public static void sangboi(){
        bsnn.add(0L);
        bsnn.add(1L);
        bsnn.add(2L);
        for(int i=3; i<101;i++){
            bsnn.add(lcm((long)i,bsnn.get(i-1)));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sangboi();
        //System.out.println(bsnn);
        int t =sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(bsnn.get(n));
        }
    }
}