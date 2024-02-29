import java.util.Scanner;

public class input_output_with_loof {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int sum=0;
        int size = s.nextInt();
        int[] score = new int[size];

        for (int i=0; i<score.length; i++){
            score[i] = s.nextInt();
            sum += score[i];
        }
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + (double)sum/score.length);
        s.close();
    }
}
