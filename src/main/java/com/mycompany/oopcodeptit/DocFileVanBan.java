package com.mycompany.oopcodeptit;

import java.io.File;
import java.util.*;

public class DocFileVanBan {
    public static void main(String[] args) {
        try{
            File  input = new File("DATA.in");
            Scanner sc = new Scanner(input);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}