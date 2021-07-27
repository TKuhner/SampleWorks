package SampleWorks.Java;

import java.util.*;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try{
            n = sc.nextInt();
        }catch(Exception ex){
            System.out.println(ex);
        }

        for (int i = 1; i < 11; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}