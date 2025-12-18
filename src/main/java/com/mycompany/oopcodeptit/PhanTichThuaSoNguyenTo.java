package com.mycompany.oopcodeptit;
import java.util.Scanner;


public class PhanTichThuaSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ct =1;
        while(ct<=t){
            int n = sc.nextInt();
            System.out.print("Test " + ct + ": " );
            for(int i=2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    int count = 0;
                    while(n%i == 0){
                        n/=i;
                        count++;
                    }
                    System.out.print(i + "(" + count + ") ");
                }
            }
            if(n>1) System.out.print(n+ "(1)"); 
            System.out.println("");
            ct++;
        }
    }
    
}
