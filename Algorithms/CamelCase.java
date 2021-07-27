package SampleWorks.Algorithms;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        char c;

        for(int i = 0; i <str.length() - 1; i++){
            c = str.charAt(i);
            if (Character.isUpperCase(c) == true){
                count +=1;
            }
        }
        System.out.println(count);
    }
}