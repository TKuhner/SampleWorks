package SampleWorks.ProblemSolving;

import java.util.*;

public class AVeryBigSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        long sum = 0;

        try {
            n = sc.nextInt();
        } catch (Exception ex){
            System.out.println(ex);
        }

        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
            sum += arr[i];
        }

        System.out.println(sum);

    }
}