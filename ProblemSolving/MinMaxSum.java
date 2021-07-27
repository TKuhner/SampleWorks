package SampleWorks.ProblemSolving;

import java.util.*;

public class MinMaxSum {

    public static long minSum(long[] arrValues){
        long sum = 0;
        long bigThresh = 0;

        for(int i = 0; i < 5; i++){
            sum += arrValues[i];
            if (arrValues[i] > bigThresh){
                bigThresh = arrValues[i];
            }
        }



        return sum - bigThresh;
    }

    public static long maxSum(long[] arrValues){
        long sum = 0;
        long lilThresh = 999999999;

        for(int i = 0; i < 5; i++){
            sum += arrValues[i];
            if (arrValues[i] < lilThresh){
                lilThresh = arrValues[i];
            }
        }



        return sum - lilThresh;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 5;

        long[] arrValues = new long[n];
        long[] arrSums = new long[2];

        for (int i = 0; i < n; i++){
            arrValues[i] = sc.nextLong();
        }


        arrSums[0] = minSum(arrValues);
        arrSums[1] = maxSum(arrValues);


        for (int y = 0; y < arrSums.length; y++){
            System.out.print(arrSums[y] + " ");
        }

    }
}
