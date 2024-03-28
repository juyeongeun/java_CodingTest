import java.util.Arrays;
import java.util.Scanner;

public class App {

	static int C,R;
	static int K;
	static int map[][];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt(); //가로
		R = sc.nextInt(); //세로
		K = sc.nextInt(); //관객의 대기번호
		
		map = new int[R][C]; //좌석 수

		int num = 1;
		int row = R, col = 0; //행=마지막 수, 열=0
		int i;
		int Result[] = new int[2];
		boolean isTrue =true;
		while(isTrue) {
			//대기 번호가 넘어가면
			if(K > R*C) break;
			if(row-1>=0 && row+1<R && col-1>=0 && col+1>C && 
					map[row-1][col] !=0 && map[row+1][col] !=0 && map[row][col-1] !=0 && map[row][col+1] !=0) break;

			//상
			for(i=row-1;i>=0;i--) {
				if(map[i][col] != 0) break;
				map[i][col] = num++;
				if(map[i][col] == K) {
					Result[0] = i;
					Result[1] = col;
					isTrue = false;
				}
			}
			row = i+1;

			//우
			for(i=col+1;i<C;i++) {
				if(map[row][i] !=0) break;
				map[row][i] = num++;
				if(map[row][i] == K) {
					Result[0] = row;
					Result[1] = i;
					isTrue = false;
				}
			}
			col = i-1;

			//하
			for(i=row+1;i<R;i++) {
				if(map[i][col] !=0) break;
				map[i][col] = num++;
				if(map[i][col] == K) {
					Result[0] = i;
					Result[1] = col;
					isTrue = false;
				}
			}
			row = i-1;
            
			//좌
			for(i=col-1;i>=0;i--) {
				if(map[row][i] !=0) break;
				map[row][i] = num++;
				if(map[row][i] == K) {
					Result[0] = row;
					Result[1] = i;
					isTrue = false;
				}
			}
			col = i+1;
		}

		if(K>(R*C)) System.out.println(0);
		else
			System.out.println((Result[1]+1)+" "+(R-Result[0]));
    }
}
	