import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int N = s.nextInt();
       int K = s.nextInt();
       int[][] S=new int[2][N];
       int cnt1=0, cnt2=0,cnt3=0,cnt4=0,cnt5=0,cnt6=0;
       int cnt11=0, cnt12=0,cnt13=0,cnt14=0,cnt15=0,cnt16=0;
       int totalcnt=0;
        //학생 정보 입력 0=성별, 1=학년
        for(int i=0; i<N; i++){
            S[0][i]=s.nextInt();
            S[1][i]=s.nextInt();
        }

        //학생 성별 구분 후 학년 카운트
        for(int i=0; i<N; i++){
            if(S[0][i]==0){
                if(S[1][i]==1){
                    cnt1++;
                }
                else if(S[1][i]==2){
                    cnt2++;
                }
                else if(S[1][i]==3){
                    cnt3++;
                }
                else if(S[1][i]==4){
                    cnt4++;
                }
                else if(S[1][i]==5){
                    cnt5++;
                }
                else if(S[1][i]==6){
                    cnt6++;
                }
            }
            else{
                if(S[1][i]==1){
                    cnt11++;
                }
                else if(S[1][i]==2){
                    cnt12++;
                }
                else if(S[1][i]==3){
                    cnt13++;
                }
                else if(S[1][i]==4){
                    cnt14++;
                }
                else if(S[1][i]==5){
                    cnt15++;
                }
                else if(S[1][i]==6){
                    cnt16++;
                }
            }
        }
        //최대 인원수 별 방 개수
        if(cnt1>K){
            if(cnt1%K==0){
                cnt1=cnt1/K;
            }
            else{
                cnt1=(cnt1/K)+1;
            }
        }
        else if(cnt1==0){
            cnt1=0;
        }
        else{
            cnt1=1;
        }
        if(cnt2>K){
            if(cnt2%K==0){
                cnt2=cnt2/K;
            }
            else{
                cnt2=(cnt2/K)+1;
            }
        }
        else if(cnt2==0){
            cnt2=0;
        }
        else{
            cnt2=1;
        }
        if(cnt3>K){
            if(cnt3%K==0){
                cnt3=cnt3/K;
            }
            else{
                cnt3=(cnt3/K)+1;
            }
        }
        else if(cnt3==0){
            cnt3=0;
        }
        else{
            cnt3=1;
        }
        if(cnt4>K){
            if(cnt4%K==0){
                cnt4=cnt4/K;
            }
            else{
                cnt4=(cnt4/K)+1;
            }
        }
        else if(cnt4==0){
            cnt4=0;
        }
        else{
            cnt4=1;
        }
        if(cnt5>K){
            if(cnt5%K==0){
                cnt5=cnt5/K;
            }
            else{
                cnt5=(cnt5/K)+1;
            }
        }
        else if(cnt5==0){
            cnt5=0;
        }
        else{
            cnt5=1;
        }
        if(cnt6>K){
            if(cnt6%K==0){
                cnt6=cnt6/K;
            }
            else{
                cnt6=(cnt6/K)+1;
            }
        }
        else if(cnt6==0){
            cnt6=0;
        }
        else{
            cnt6=1;
        }

        if(cnt11>K){
            if(cnt11%K==0){
                cnt11=cnt11/K;
            }
            else{
                cnt11=(cnt11/K)+1;
            }
        }
        else if(cnt11==0){
            cnt11=0;
        }
        else{
            cnt11=1;
        }
        if(cnt12>K){
            if(cnt12%K==0){
                cnt12=cnt12/K;
            }
            else{
                cnt12=(cnt12/K)+1;
            }
        }
        else if(cnt12==0){
            cnt12=0;
        }
        else{
            cnt12=1;
        }
        if(cnt13>K){
            if(cnt13%K==0){
                cnt13=cnt13/K;
            }
            else{
                cnt13=(cnt13/K)+1;
            }
        }
        else if(cnt13==0){
            cnt13=0;
        }
        else{
            cnt13=1;
        }
        if(cnt14>K){
            if(cnt14%K==0){
                cnt14=cnt14/K;
            }
            else{
                cnt14=(cnt14/K)+1;
            }
        } 
        else if(cnt14==0){
            cnt14=0;
        }
        else{
            cnt14=1;
        }
        if(cnt15>K){
            if(cnt15%K==0){
                cnt15=cnt15/K;
            }
            else{
                cnt15=(cnt15/K)+1;
            }
        }
        else if(cnt15==0){
            cnt15=0;
        }
        else{
            cnt15=1;
        }
        if(cnt16>K){
            if(cnt16%K==0){
                cnt16=cnt16/K;
            }
            else{
                cnt16=(cnt16/K)+1;
            }
        }
        else if(cnt16==0){
            cnt16=0;
        }
        else{
            cnt6=1;
        }
       totalcnt=cnt1+cnt2+cnt3+cnt4+cnt5+cnt6+cnt11+cnt12+cnt13+cnt14+cnt15+cnt16;
       System.out.println(totalcnt);
    }
}
