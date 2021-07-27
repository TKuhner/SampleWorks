package SampleWorks.Practice;

import java.util.*;

public class practice722part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean flag = false;
        try {
            n = sc.nextInt();
        } catch (Exception ex){
            System.out.println(ex);
        }

        for (int i = 2; i <= n/2; i++){
            if (n %i == 0){
                flag = true;
                break;
            }
        }

        if (flag == false){
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.println(n + " is not a prime number.");
        }


    }
}
