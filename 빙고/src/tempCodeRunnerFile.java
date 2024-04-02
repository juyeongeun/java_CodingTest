import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int map[][] = new int[5][5]; // 빙고판
        int num = 0; // 사회자가 부르는 수
        int cnt = 0; // 25개 숫자
        int bingo = 0; // 빙고 개수
        int numcnt = 0; // 빙고 3줄된 차례

        // 빙고판 숫자 채우기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                map[i][j] = s.nextInt();
            }
        }

        // 빙고 게임
        for (int k = 0; k < 25; k++) {
            num = s.nextInt(); // 사회자 숫자
            cnt++; // 카운트
            // 빙고판 숫자 지우기
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (map[i][j] == num) {
                        map[i][j] = 0;
                    }
                }
            }

            bingo = 0;
            for (int i = 0; i < 5; i++) {
                if ((map[i][0] == 0) && (map[i][1] == 0) && (map[i][2] == 0) && (map[i][3] == 0) && (map[i][4] == 0)) {
                    bingo++;
                }
                if ((map[0][i] == 0) && (map[1][i] == 0) && (map[2][i] == 0) && (map[3][i] == 0) && (map[4][i] == 0)) {
                    bingo++;
                }
            }
            if ((map[0][4] == 0) && (map[1][3] == 0) && (map[2][2] == 0) && (map[3][1] == 0) && (map[4][0] == 0)) {
                bingo++;
            }
            if ((map[0][0] == 0) && (map[1][1] == 0) && (map[2][2] == 0) && (map[3][3] == 0) && (map[4][4] == 0)) {
                bingo++;
            }
            if (bingo == 3 && numcnt == 0) {
                numcnt = cnt;
            }
        }
        System.out.println(numcnt);
    }
}
