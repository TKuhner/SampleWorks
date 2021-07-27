package SampleWorks.Practice;

import java.util.*;

public class practice723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = str.length() - 1;
        boolean check = true;

        for (int i = 0 ; i < str.length() -1; i++){
            if (str.charAt(i) == str.charAt(x) ){
                check = true;
                x--;
            }
            else{
                check = false;
                break;
            }
        }


        System.out.println("Palindrome = " + check);
    }
}
