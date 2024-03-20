import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int N = s.nextInt();
       int K = s.nextInt();
       int[][] S=new int[7][2];
       int gender, grade;
       int totalcnt=0;
        //학생 정보 입력 0=성별, 1=학년
        for(int i=0; i<N; i++){
            gender=s.nextInt();
            grade=s.nextInt();
            S[grade][gender]+=1;
        }

        //학생 성별 구분 후 학년 카운트
        for(int i=0; i<7;i++){
            for(int j=0; j<2; j++){
                if(S[i][j]>K&&S[i][j]%K!=0){
                    S[i][j]=(S[i][j]/K)+1;
                }
                else if(S[i][j]>K&&S[i][j]%K==0){
                    S[i][j]=S[i][j]/K;
                }
                else if(S[i][j]==0){
                    S[i][j]=0;
                }
                else{
                    S[i][j]=1;
                }
                totalcnt+=S[i][j];
            }
        }
        System.out.println(totalcnt);
    }
}
