package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HELLOFILE {
    public static void main(String[] args) {
        try{
            File hello = new File("Hello.txt");
            Scanner sc = new Scanner(hello);
            while (sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch( FileNotFoundException e){
            System.out.println("An error occur");
            e.printStackTrace();
        }
    }
}
