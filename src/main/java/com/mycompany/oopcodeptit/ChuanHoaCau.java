package com.mycompany.oopcodeptit;

import java.util.*;
import java.io.*;

public class ChuanHoaCau {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String rawLine = sc.nextLine();
            if (rawLine == null) break;
            if (rawLine.trim().isEmpty()) {
                // Nếu muốn in dòng trống, bỏ continue; ở đây ta bỏ qua dòng rỗng
                continue;
            }

            // Tách các phần kết thúc bằng dấu chấm, chấm hỏi, chấm than (nếu có nhiều câu trong 1 dòng)
            String[] parts = rawLine.split("(?<=[.!?])");

            for (String part : parts) {
                if (part.trim().isEmpty()) continue;

                // Tìm ký tự cuối không phải khoảng trắng
                int j = part.length() - 1;
                while (j >= 0 && Character.isWhitespace(part.charAt(j))) j--;

                char endMark = '.'; // mặc định thêm dấu chấm nếu không có
                String bodyRaw;
                if (j >= 0 && (part.charAt(j) == '.' || part.charAt(j) == '!' || part.charAt(j) == '?')) {
                    endMark = part.charAt(j);
                    bodyRaw = part.substring(0, j); // lấy phần trước dấu chấm cuối
                } else {
                    bodyRaw = part;
                }

                // Chuẩn hóa khoảng trắng: nhiều khoảng trắng -> 1 và bỏ đầu-cuối
                String body = bodyRaw.replaceAll("\\s+", " ").trim();

                if (body.isEmpty()) continue;

                // Xóa khoảng trắng trước các dấu câu nội bộ (ví dụ "word , other" -> "word, other")
                body = body.replaceAll("\\s+([,\\.:;\\?!])", "$1");

                // Đảm bảo sau dấu , ; : có đúng một khoảng trắng (nếu không phải cuối câu)
                body = body.replaceAll("([,;:])\\s*", "$1 ");

                // Viết thường toàn bộ, sau đó viết hoa chữ cái chữ cái đầu tiên (nếu là chữ)
                body = body.toLowerCase();

                // Tìm chữ cái đầu tiên và viết hoa nó (nếu có)
                int idxFirstLetter = -1;
                for (int k = 0; k < body.length(); k++) {
                    if (Character.isLetter(body.charAt(k))) {
                        idxFirstLetter = k;
                        break;
                    }
                }
                if (idxFirstLetter != -1) {
                    char up = Character.toUpperCase(body.charAt(idxFirstLetter));
                    body = body.substring(0, idxFirstLetter) + up + body.substring(idxFirstLetter + 1);
                }

                // In câu: không có khoảng trắng trước dấu kết thúc
                System.out.println(body + endMark);
            }
        }
        sc.close();
    }   
}
