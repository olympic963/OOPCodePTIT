package com.mycompany.oopcodeptit;

import java.util.*;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> res= new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(res.isEmpty()){
                res.add(s.charAt(i));
            }else{
                if(res.get(res.size()-1).equals(s.charAt(i))){
                    res.remove(res.size()-1);
                }else{
                    res.add(s.charAt(i));
                }
            }
        }
        if(res.size()!=0){
            for(int i=0; i<res.size(); i++){
                System.out.print(res.get(i));
            }
        }else {
            System.out.println("Empty String");
        }
    }
}