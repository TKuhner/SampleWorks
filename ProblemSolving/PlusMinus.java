package SampleWorks.ProblemSolving;

import java.util.*;

public class PlusMinus {
    public static double zRat(int n, int[] arr){
        double counter = 0;
        double number = n;

        for (int i = 0; i < n; i++){
            if (arr[i] == 0){
                counter += 1;
            }
        }

        double zRatio = counter/number;

        return zRatio;
    }

    public static double nRat(int n, int[] arr){
        double nRatio;
        double counter = 0;
        double number = n;

        for (int i = 0; i < n; i++){
            if (arr[i] < 0){
                counter += 1;
            }
        }

        nRatio = counter / number;

        return nRatio;
    }

    public static double pRat(int n, int[] arr){
        double pRatio;
        double counter = 0;
        double number = n;

        for (int i = 0; i < n; i++){
            if (arr[i] > 0){
                counter += 1;
            }
        }

        pRatio = counter / number;

        return pRatio;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n;
        double zRatio;
        double pRatio;
        double nRatio;

        // receive input to define length of array
        n = sc.nextInt();

        // array declared at length n
        int[] arr = new int[n];

        // receive elements for the array
        for (int i = 0; i <n; i++){
            arr[i] = sc.nextInt();
        }

        // methods to get ratios of positive, negative, and zeros within array
        zRatio = zRat(n, arr);
        pRatio = pRat(n, arr);
        nRatio = nRat(n, arr);



        System.out.println(String.format("%.6f", pRatio));
        System.out.println(String.format("%.6f", nRatio));
        System.out.println(String.format("%.6f", zRatio));



    }
}