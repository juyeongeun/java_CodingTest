import java.util.Scanner;

public class max {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max=0, row=0, col=0;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                arr[i][j]=s.nextInt();
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(max <= arr[i][j]){
                    max=arr[i][j];
                    row=i+1;
                    col=j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+col);

        s.close();
    }
}
