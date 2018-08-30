package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        List<Integer> list = new ArrayList<>();
        int min = arr[0][0];
        int max = arr[0][0];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] < min) {
                    min = arr[j][i];
                }
                if (arr[j][i] > max) {
                    max = arr[j][i];
                }
            }
            list.add(min);
            list.add(max);
        }
        System.out.println(list);
        int data1 = list.get(1) - list.get(0);
        int data2 = list.get(3) - list.get(2);
        int result = Math.max(data1, data2);
        System.out.println(result * result);
        /*if (list.get(0) == list.get(1)) {
            System.out.println(data2 * data2);
        } else if (list.get(2) == list.get(3)) {
            System.out.println(data1 * data1);
        } else {
            System.out.println(data1 * data2);
        }*/
    }
}
