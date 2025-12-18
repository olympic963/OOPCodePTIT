package com.mycompany.oopcodeptit;
import java.util.Scanner;

public class SoNguyenTo {
    public static boolean checkSNT(long n){
        if(n == 2) return true;
        else if(n!=2 && n%2 == 0) return false;
        else{
            for(int i = 3; i< Math.sqrt(n); i+=2){
                if(n%i == 0) return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            if (checkSNT(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
