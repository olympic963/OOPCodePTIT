package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;

public class LietKeTheoThuTuXuatHien {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream( new BufferedInputStream(new FileInputStream("NHIPHAN.in")));
        ArrayList<String> input1 = (ArrayList<String>) ois.readObject();
        Set<String> words1 = new HashSet<>();
        for(String str : input1) {
            for(String word : str.trim().toLowerCase().split("\\s+")) {
                words1.add(word);
            }
        }
        Set<String> words2 = new LinkedHashSet<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()) {
            words2.add(sc.next().toLowerCase());
        }
        for (String word : words2) {
            if(words1.contains(word)) {
                System.out.println(word);
            }
        }
    }
}
