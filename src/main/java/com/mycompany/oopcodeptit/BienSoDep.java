package com.mycompany.oopcodeptit;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

import static java.util.Collections.reverse;
import static java.util.Collections.swap;

public class BienSoDep {
    public static boolean bsd(String s){
        String main_part = s.substring(5,8)+s.substring(9);
        boolean check1=true, check2=true, check3=true,check4 =true;
        for(int i = 0; i < main_part.length()-1; i++){
            if(main_part.charAt(i)-'0'>=main_part.charAt(i+1)-'0'){
                check1=false;
            }
            if(main_part.charAt(i)-'0'!=main_part.charAt(i+1)-'0'){
                check2=false;
            }
            if((main_part.charAt(i)-'0'!=main_part.charAt(i+1)-'0' && i<2)||(main_part.charAt(i)-'0'!=main_part.charAt(i+1)-'0' && i>2)){
                check3=false;
            }
            if(main_part.charAt(i)!='6' && main_part.charAt(i)!='8'){
                check4=false;
            }
            if(!check1&&!check2&&!check3&&!check4){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s = sc.nextLine();
            System.out.println(bsd(s)?"YES":"NO");
        }
    }
}