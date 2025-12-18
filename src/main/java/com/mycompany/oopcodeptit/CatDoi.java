package com.mycompany.oopcodeptit;

import java.util.Scanner;

public class CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String num = sc.nextLine();
            StringBuilder sb = new StringBuilder(num);
            boolean check =true;
            for(int i=0; i<num.length(); i++){
                if(sb.charAt(i) == '1') sb.setCharAt(i, '1');
                else if(sb.charAt(i) == '0' ||sb.charAt(i) == '8'||sb.charAt(i) == '9') sb.setCharAt(i,'0');
                else{
                    check =false;
                    break;
                }
            }
            if(check && Long.parseLong(sb.toString())!=0) System.out.println(Long.parseLong(sb.toString()));
            else System.out.println("INVALID");
        }
        
    }
}
