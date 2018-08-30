package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int[] brr = new int[n];
        for(int i = 0; i< brr.length; i++) {
            brr[i] = scanner.nextInt();
        }
        int result = findData(n,arr,brr);
        System.out.println(result);
    }
    private static int findData(int n, int[] arr, int[] brr){
        int count = 0;
        if(n == 1){
           if(brr[0] > arr[0]){
               count += 1;
               return count;
           }
        }
        for(int l = 0; l < n; l++) {
            for(int r = l; r < n; r++) {
                int maxa = arr[l];
                int minb = brr[l];
                for(int i = l; i <= r; i++) {
                    if (arr[i] > maxa) {
                        maxa = arr[i];
                    }
                    if(brr[i] < minb){
                        minb = brr[i];
                    }
                }
                if(maxa < minb) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
