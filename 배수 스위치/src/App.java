import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String lightstr = s.next();
        char[] cur = lightstr.toCharArray();
        int N = cur.length;
        int[] btn=new int[N];

        for(int i=0; i<N; i++){
            if(cur[i]=='Y'){
                btn[i]=1;
            }
            else{
                btn[i]=0;
            }
        }
        int answer = 0;
        for(int i=0; i<N; i++){
            if(btn[i]==0){
                continue;
            }
            else{
                answer++;
                for(int j=i; j<N; j+=i+1){
                    if(btn[j]==0) btn[j]=1;
                    else btn[j]=0;
                }
            }
        }
       System.out.println(answer);
       s.close();
    }
}
