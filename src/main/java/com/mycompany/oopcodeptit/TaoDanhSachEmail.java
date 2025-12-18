package com.mycompany.oopcodeptit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TaoDanhSachEmail {
    // Chuẩn hóa tên: viết hoa chữ cái đầu mỗi phần, loại bỏ khoảng trắng thừa
    private static String chuanHoaTen(String name) {
        StringBuilder normalized = new StringBuilder();
        boolean newWord = true;
        name = name.trim().toLowerCase();
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == ' ' && normalized.length() > 0 && normalized.charAt(normalized.length() - 1) != ' ') {
                normalized.append(' ');
                newWord = true;
            } else if (c != ' ') {
                if (newWord) {
                    normalized.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    normalized.append(c);
                }
            }
        }
        return normalized.toString();
    }

    // Tạo email từ tên đã chuẩn hóa
    private static String taoEmail(String name, String[] baseEmails, int[] emailCounts, int currentIndex) {
        String[] parts = name.split("\\s+");
        StringBuilder email = new StringBuilder();
        // Lấy tên cuối cùng
        String lastName = parts[parts.length - 1].toLowerCase();
        email.append(lastName);
        // Lấy chữ cái đầu của họ và các tên đệm
        for (int i = 0; i < parts.length - 1; i++) {
            email.append(Character.toLowerCase(parts[i].charAt(0)));
        }
        String baseEmail = email.toString();
        // Kiểm tra trùng email và đếm số lần xuất hiện
        int count = 1;
        for (int i = 0; i < currentIndex; i++) {
            if (baseEmails[i].equals(baseEmail)) {
                count++;
            }
        }
        baseEmails[currentIndex] = baseEmail;
        emailCounts[currentIndex] = count;
        // Thêm số thứ tự nếu cần
        if (count > 1) {
            email.append(count);
        }
        email.append("@ptit.edu.vn");
        return email.toString();
    }

    public static void main(String[] args) {
        try {
            File inp = new File("DANHSACH.in");
            // Kiểm tra và tạo file nếu chưa tồn tại
            if (!inp.exists()) {
                inp.createNewFile();
            }
            // Lần 1: Đếm số dòng và lọc trùng lặp
            Scanner sc = new Scanner(inp);
            int maxSize = 1000; // Giả sử tối đa 1000 tên
            String[] names = new String[maxSize];
            int nameCount = 0;
            while (sc.hasNextLine() && nameCount < maxSize) {
                String rawName = sc.nextLine();
                String normalizedName = chuanHoaTen(rawName);
                // Kiểm tra trùng lặp
                boolean isDuplicate = false;
                for (int i = 0; i < nameCount; i++) {
                    if (names[i].equals(normalizedName)) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    names[nameCount] = normalizedName;
                    nameCount++;
                }
            }
            sc.close();
            // Lần 2: Tạo và in email
            sc = new Scanner(inp);
            String[] baseEmails = new String[maxSize];
            int[] emailCounts = new int[maxSize];
            int currentIndex = 0;
            while (sc.hasNextLine() && currentIndex < nameCount) {
                String rawName = sc.nextLine();
                String normalizedName = chuanHoaTen(rawName);
                // Chỉ xử lý nếu tên hợp lệ (không trùng)
                for (int i = 0; i < nameCount; i++) {
                    if (names[i].equals(normalizedName)) {
                        String email = taoEmail(normalizedName, baseEmails, emailCounts, currentIndex);
                        System.out.println(email);
                        currentIndex++;
                        break;
                    }
                }
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}