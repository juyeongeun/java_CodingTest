import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int cnt = s.nextInt(); //색종이 수
        int[][] rec = new int[cnt][2]; //색종이 좌표
        int[][] map = new int[101][101]; // 도화지 크기
        int size=0; //색종이 면적합
        int i=0, k=0;

        for(i=0; i<cnt; i++){
            rec[i][0]=s.nextInt();
            rec[i][1]=s.nextInt();
        }
        i=0;//i초기화
        k=0;

        for(int t=0; t<cnt;t++){
            for(i=rec[t][0]; i<rec[t][0]+10; i++){
                for(k=rec[t][1]; k<rec[t][1]+10; k++){
                    map[i][k]=1;
                }
            }
        }

        for(int j=0; j<map.length; j++){
            for(int t=0;t<map.length;t++){
                size+=map[j][t];
            }
        }
        System.out.println(size);
        s.close();
    }
}
