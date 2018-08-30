package test;

import java.util.Arrays;
import java.util.Scanner;

/*
表达式求值
 */
public class Main4 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int result = 0;
        if (arr[0] == 1) {
            if (arr[1] == 1) {
                if (arr[2] == 1) {
                    result = arr[0] + arr[1] + arr[2];
                }
                result = arr[0] + arr[1] + arr[2];
            }
            result = (arr[0] + arr[1]) * arr[2];
        } else {
            result = arr[0] * arr[1] * arr[2];
        }
        System.out.println(result);
    }
}
