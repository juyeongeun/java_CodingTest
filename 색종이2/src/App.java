import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); // 색종이 장수
        int[][] map = new int[1001][1001];
        int a=1;
        int[] sum=new int[N];
        int t=0;

        for(int i=0; i<N; i++){
            int x =s.nextInt();
            int y=s.nextInt();
            int w=s.nextInt();
            int h=s.nextInt();

            for(int j=x; j<x+w; j++){
                for(int k=y; k<y+h; k++){
                    map[j][k]=a;
                }
            }
            a++;
        }

        while (t<N) {
            for(int i=0; i<1001; i++){
                for(int j=0; j<1001; j++){
                    if(map[i][j]==t+1){
                        sum[t]+=1;
                    }
                }
            }
            t++;
        }
        for(int i=0; i<sum.length; i++){
            System.out.println(sum[i]);
        }
    }
}
