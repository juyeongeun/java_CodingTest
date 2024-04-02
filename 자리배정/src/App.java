import java.util.Scanner;

public class App {

    static int C, R;
    static int K;
    static int map[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C = sc.nextInt(); // 가로 길이 입력
        R = sc.nextInt(); // 세로 길이 입력
        K = sc.nextInt(); // 관객의 대기번호 입력
        
        map = new int[R][C]; // 좌석 배치를 나타내는 배열 생성

        int num = 1; // 좌석 번호
        int row = R, col = 0; // 현재 좌석의 행과 열
        int Result[] = new int[2]; // 결과값을 담을 배열

        // 대기번호가 좌석의 수를 초과하면 0 출력, 아니면 해당 좌석 출력
        if (K > R * C) {
            System.out.println(0);
            return;
        }

        while (true) {
            // 상하좌우에 숫자가 채워져 있는지 확인하여, 채워지지 않았다면 해당 방향으로 이동하고 숫자를 채웁니다.
            while (row - 1 >= 0 && map[row - 1][col] == 0) {
                map[--row][col] = num++;
                if (map[row][col] == K) {
                    Result[0] = row;
                    Result[1] = col;
                    System.out.println((Result[1] + 1) + " " + (R - Result[0]));
                    return;
                }
            }
            while (col + 1 < C && map[row][col + 1] == 0) {
                map[row][++col] = num++;
                if (map[row][col] == K) {
                    Result[0] = row;
                    Result[1] = col;
                    System.out.println((Result[1] + 1) + " " + (R - Result[0]));
                    return;
                }
            }
            while (row + 1 < R && map[row + 1][col] == 0) {
                map[++row][col] = num++;
                if (map[row][col] == K) {
                    Result[0] = row;
                    Result[1] = col;
                    System.out.println((Result[1] + 1) + " " + (R - Result[0]));
                    return;
                }
            }
            while (col - 1 >= 0 && map[row][col - 1] == 0) {
                map[row][--col] = num++;
                if (map[row][col] == K) {
                    Result[0] = row;
                    Result[1] = col;
                    System.out.println((Result[1] + 1) + " " + (R - Result[0]));
                    return;
                }
            }
        }
    }
}
