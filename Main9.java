package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
        }
        /*int[] a = {1,2,4,3,5};
        int[] b = {5,2,3,4,1};*/
        int p1 = 0;
        int p2 = b.length - 1;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (p1 < a.length - 1 && p2 >= 0){
            if (a[p1] == b[p2]) {
                p1 += 1;
                p2 -= 1;
                count += 1;
            } else {
                p1 += 1;
                list.add(count);
                count = 0;
            }
            if (p1 == a.length -1 || p2 == 0 ) {
                if (a[p1] != b[p2]) {
                    list.add(count);
                } else {
                    list.add(count + 1);
                }
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));
    }
}
