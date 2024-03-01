import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N=0, M=0;
        N=s.nextInt();
        M=s.nextInt();
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        int[][] sum = new int[N][M];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                A[i][j]=s.nextInt();
            }
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                B[i][j]=s.nextInt();
            }
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j]+B[i][j]+" ");
                if(j == M-1)
                    System.out.println();
            }
        }
        
        s.close();
    }
}