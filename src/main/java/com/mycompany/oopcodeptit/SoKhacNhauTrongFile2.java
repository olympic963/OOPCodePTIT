package com.mycompany.oopcodeptit;

import java.io.*;
import java.util.*;

public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        try (DataInputStream di =
                     new DataInputStream(new FileInputStream("DATA.IN"))) {
            while (true) {
                int key = di.readInt();   // đọc 4 byte
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        } catch (EOFException e) {
            // KẾT THÚC FILE → ĐÚNG, KHÔNG LÀ LỖI
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}