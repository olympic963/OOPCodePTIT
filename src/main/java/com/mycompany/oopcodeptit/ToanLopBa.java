package com.mycompany.oopcodeptit;

import java.util.*;
public class ToanLopBa {
    // Sinh tất cả các số có thể từ một chuỗi chứa '?'
    static List<String> genNumberCandidates(String token) {
        List<String> res = new ArrayList<>();
        char[] chars = token.toCharArray();
        dfs(chars, 0, res);
        return res;
    }

    private static void dfs(char[] chars, int idx, List<String> res) {
        if (idx == chars.length) {
            String s = new String(chars);
            // chỉ nhận số nguyên dương 2 chữ số, không bắt đầu bằng 0
            if (s.length() == 2 && s.charAt(0) != '0') {
                int val = Integer.parseInt(s);
                if (val >= 10 && val <= 99) {
                    res.add(s);
                }
            }
            return;
        }
        if (chars[idx] == '?') {
            for (char d = '0'; d <= '9'; d++) {
                chars[idx] = d;
                dfs(chars, idx + 1, res);
            }
            chars[idx] = '?'; // backtrack
        } else {
            dfs(chars, idx + 1, res);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine().trim());
        for (int tc = 0; tc < T; tc++) {
            String line;
            do {
                line = sc.nextLine();
            } while (line.trim().isEmpty());

            String[] toks = line.trim().split("\\s+");
            if (toks.length < 5) {
                System.out.println("WRONG PROBLEM!");
                continue;
            }

            String A_t = toks[0];
            String op_t = toks[1];
            String B_t = toks[2];
            String eq_t = toks[3];
            String C_t = toks[4];

            if (!eq_t.equals("=")) {
                // tìm "=" trong tokens
                int idx = -1;
                for (int i = 0; i < toks.length; i++) {
                    if (toks[i].equals("=")) {
                        idx = i;
                        break;
                    }
                }
                if (idx == -1 || idx + 1 >= toks.length) {
                    System.out.println("WRONG PROBLEM!");
                    continue;
                }
                A_t = toks[0];
                op_t = toks[1];
                B_t = toks[2];
                C_t = toks[idx + 1];
            }

            List<String> As = genNumberCandidates(A_t);
            List<String> Bs = genNumberCandidates(B_t);
            List<String> Cs = genNumberCandidates(C_t);

            List<Character> ops = new ArrayList<>();
            if (op_t.equals("?")) {
                ops.add('+');
                ops.add('-');
                ops.add('*');
                ops.add('/');
            } else if (op_t.length() == 1 && "+-*/".indexOf(op_t.charAt(0)) >= 0) {
                ops.add(op_t.charAt(0));
            } else {
                System.out.println("WRONG PROBLEM!");
                continue;
            }

            boolean found = false;
            String outA = "", outB = "", outC = "";
            char outOp = '?';

            outer:
            for (String sa : As) {
                int a = Integer.parseInt(sa);
                for (String sb : Bs) {
                    int b = Integer.parseInt(sb);
                    for (String scs : Cs) {
                        int c = Integer.parseInt(scs);
                        for (char op : ops) {
                            boolean ok = false;
                            switch (op) {
                                case '+': ok = (a + b == c); break;
                                case '-': ok = (a - b == c); break;
                                case '*': ok = (a * b == c); break;
                                case '/': ok = (b != 0 && a % b == 0 && a / b == c); break;
                            }
                            if (ok) {
                                found = true;
                                outA = sa; outB = sb; outC = scs; outOp = op;
                                break outer;
                            }
                        }
                    }
                }
            }

            if (found) {
                System.out.println(outA + " " + outOp + " " + outB + " = " + outC);
            } else {
                System.out.println("WRONG PROBLEM!");
            }
        }

        sc.close();
    }
}

