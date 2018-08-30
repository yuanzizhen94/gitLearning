package test;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] str = new String[t];
        for (int i = 0; i<str.length; i++) {
            str[i] = scanner.next();
        }
        for (int i = 0; i < str.length; i++) {

            char[] chars = str[i].toCharArray();
            List<Integer> list = new ArrayList<>();
            Arrays.sort(chars);
            int count = 0;
            int k  = 0;
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] != chars[k]) {
                    count = j - k;
                    k = j;
                    list.add(count);
                }
                if (j == chars.length && chars[j] == chars[k]) {
                    count = j - k;
                    list.add(count);
                }
            }
            Collections.sort(list);
            int num1 = list.get(list.size() - 1);
            if (num1 == str[i].length() - num1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
       // System.out.println(list);
    }
}
