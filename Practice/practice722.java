package SampleWorks.Practice;

import java.util.*;

public class practice722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for(int ii = 0; ii <= i; ii++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}