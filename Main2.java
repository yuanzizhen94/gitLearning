package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
俄罗斯方块
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for (int j = 1; j <= n; j++){
            int count = 0;
            for(int i = 0; i < arr.length; i++) {
                if (arr[i] == j){
                    count += 1;
                }
            }
            list.add(count);
        }
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if(list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println(min);
    }
}
