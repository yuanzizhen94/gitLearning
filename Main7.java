package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] data = new int[n * t];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < t; j++){
                data[n * j + i] = arr[i];
            }
        }
        String str = search_max_asc1_1(arr);
        String[] str1 = str.split(",");
        int[] data2 = new int[str1.length];
        for (int i = 0; i < str1.length; i++) {
            data2[i] = Integer.valueOf(str1[i]);
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > data2[data2.length - 1]) {
                list.add(arr[i]);
            }
        }
        int sum = 0;
        if (list.size() < t) {
            int size = list.size();
            while(size > 0) {
                sum += list.size();
                size --;
            }
            //sum = sum + (t - list.size());
        } else {
            int size = list.size();
            while(size > 0) {
                sum += list.size();
                size --;
            }
        }
        if (list.size() <= 1) {
            System.out.println((t - 1) + data2.length);
        } else {
            System.out.println(sum + (t - list.size()) + data2.length);
        }
    }
    private static String search_max_asc1_1(int[] arry) {
        int[] lis = new int[arry.length];
        String[] str = new String[arry.length];
        for (int i = 0; i < arry.length; i++) {
            str[i] = arry[i] + "";
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arry[i] > arry[j] && lis[j] + 1 > lis[i]) {
                    lis[i] = lis[j] + 1;
                    str[i] = str[j];
                    str[i] += "," + arry[i];
                }
            }
        }
        int n = max_num(lis);
        return str[n];
    }
    private static int max_num(int[] lis) {
        int max = lis[0];
        int num = 0;
        for (int i = 1; i < lis.length; i++) {
            if (lis[i] > max) {
                max = lis[i];
                num = i;
            }
        }
        return num;
    }
}
