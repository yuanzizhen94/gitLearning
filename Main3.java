package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
塔
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int[] moves = new int[2 * k];
        while(count < k) {
            int maxIndex = maxIndex(arr);
            int minIndex = minIndex(arr);
            if(arr[maxIndex] - arr[minIndex] > 1) {
                arr[maxIndex]--;
                arr[minIndex]++;
                moves[2 * count] = maxIndex + 1;
                moves[2 * count + 1] = minIndex + 1;
                count++;
            } else {
                break;
            }
        }
        System.out.println(arr[maxIndex(arr)] - arr[minIndex(arr)] + " " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(moves[2*i]+" "+moves[2*i+1]);
        }
    }
    public static int maxIndex(int[] arr) {
        int max = arr[0];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }
    public static int minIndex(int[] arr) {
        int min = arr[0];
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                result = i;
            }
        }
        return result;
    }
}
