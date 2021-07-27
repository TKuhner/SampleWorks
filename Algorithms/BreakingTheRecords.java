package SampleWorks.Algorithms;
import java.util.*;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int[] scores = new int[games];
        int best = -1;
        int bt=-1;
        int worst = 999999999;
        int wt = -1;

        for(int i = 0; i < games; i++){
            scores[i] = sc.nextInt();
            if (scores[i] > best){
                best = scores[i];
                bt++;
            }
            if (scores[i] < worst){
                worst = scores[i];
                wt++;
            }
        }

        System.out.print(bt + " ");
        System.out.print(wt);

    }
}
