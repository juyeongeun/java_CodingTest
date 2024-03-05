import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int[][] map = new int[101][101];
        int area=0;
        int a, b, c, d;
        for(int i=0;i<4;i++){
            a=s.nextInt();
            b=s.nextInt();
            c=s.nextInt();
            d=s.nextInt();

            for(int j=a+1; j<=c; j++){
                for(int k=b+1; k<=d; k++){
                    map[j][k]=1;
                }
            }
        }
        for(int i=1;i<=100;i++){
            for(int j=1;j<=100;j++){
                area+=map[i][j];
            }
        }
        System.out.println(area);
        s.close();
    }
}