import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[] arr=new int[N];
        int incnt = 1, discnt=1;
        int max=1;
        int min = 1;

        for(int i=0; i<N; i++){
            arr[i]=s.nextInt();
        }
 

        //연속해서 커지는 수
        for(int i=0; i<N-1; i++){
            if(arr[i]<=arr[i+1]){
                incnt++;
                if(incnt>max){
                    max=incnt;
                }
            }
            else{incnt=1;}     
        }

        //연속해서 작아지는 수
        for(int i=0; i<N-1; i++){
            if(arr[i]>=arr[i+1]){
                discnt++;
                if(discnt>min){
                    min=discnt;
                }
            }
            else{discnt=1;}     
        }

        if(max>min){
            System.out.println(max);
        }
        else{System.out.println(min);}
    }
}
