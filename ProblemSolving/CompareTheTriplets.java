package SampleWorks.ProblemSolving;

import java.util.*;

public class CompareTheTriplets {

    public static ArrayList<Integer> compare(int[] a, int[]b){
        int p1 = 0;
        int p2 = 0;
        ArrayList<Integer> results = new ArrayList<Integer>();

        int counter = a.length;

        for (int i = 0; i < counter; i++){
            if (a[i] < b[i]){
                p2 += 1;
            }
            else if (a[i] > b[i]){
                p1 += 1;
            }
            else{

            }
        }

        results.add(p1);
        results.add(p2);


        return results;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] a = new int[n];
        int[] b = new int[n];

        ArrayList<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for (int x = 0; x < n; x++){
            b[x] = sc.nextInt();
        }

        results = compare(a, b);

        for (int num = 0; num < results.size(); num++) {
            System.out.print(results.get(num)+ " ");
        }

    }
}