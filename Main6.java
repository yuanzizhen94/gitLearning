package test;

import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] str = new String[t];
        for (int i = 0; i<str.length; i++) {
            str[i] = scanner.next();
        }
        Map<Character, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            char[] chars = str[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (map.containsKey(chars[j])) {
                    int value = map.get(chars[j]);
                    map.put(chars[j], value + 1);
                } else {
                    map.put(chars[j], 1);
                }
            }
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                list.add(entry.getValue());
            }
            Collections.sort(list);
            int maxValue = list.get(list.size() - 1);
            if (2 * maxValue == str[i].length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
