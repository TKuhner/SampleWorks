package SampleWorks.Java;

import java.util.*;

public class StdInOut2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer;
        double aDouble;
        String aString = "";

        integer = sc.nextInt();
        aDouble = sc.nextDouble();
        sc.nextLine();
        aString = sc.nextLine();


        System.out.println("String: " + aString);
        System.out.println("Double: " + aDouble);
        System.out.println("Int: " + integer);
    }
}
