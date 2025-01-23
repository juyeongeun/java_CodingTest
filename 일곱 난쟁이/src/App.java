import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int[] tall = new int[9];
        int sum=0;

        for(int i=0; i<9; i++){
            tall[i]=s.nextInt();
            sum+=tall[i];
        }

        for(int i=0; i<8;i++){
            for(int j=i+1; j<9; j++){
                if((sum-tall[i]-tall[j])==100){
                    tall[i]=0;
                    tall[j]=0;
                    Arrays.sort(tall);
                    for(int k=2; k<9;k++){
                        System.out.println(tall[k]);
                    }
                    return;
                }
               
            }
        }
    }
}
