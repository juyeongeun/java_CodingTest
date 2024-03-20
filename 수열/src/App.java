import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N, K; //온도를 잰 날짜 수, 합을 구하기 위한 연속적인 날짜 수
        int[] degree; // 온도 배열
        int max=Integer.MIN_VALUE; //합의 최대값이 음수일 수도 있기 때문에 초기화는 저렇게 함
        int sum=0; // 합 구하기
        N=s.nextInt();
        K=s.nextInt();
        degree= new int[N];
        // 온도 입력
        for(int i=0; i<N; i++){
            degree[i]=s.nextInt();
        }
        // 연속적인 날짜 합 (날짜 수 - 연속적인 날짜)+1 하면 총 합 개수 나옴
        for(int i=0; i<(N-K)+1;i++){
            sum=0; // 합 초기화
            for(int j=0; j<K; j++){
                sum+=degree[i+j];
            }
            // 합이 최대값 보다 크면 최대값 변경
            if(max<sum){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
