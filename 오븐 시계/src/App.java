import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int t=s.nextInt();

        int min = 60 * A + B;

        min=min+t;

        A=(min/60) % 24;
        B=min%60;

        System.out.println(A+" "+B);
    }
}
