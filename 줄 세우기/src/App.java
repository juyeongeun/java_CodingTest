import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

       ArrayList<Integer> result= new ArrayList<>(); //학생 순서 결과
       int scnt=s.nextInt(); //학생 수
       int[] std=new int[scnt]; // 학생 번호 순차 매김
       int[] list = new int[scnt]; //학생 줄 뽑기 번호
       
       for(int i=0; i<scnt; i++){
            std[i]=i+1;     // 학생 번호 순차 매김
            list[i]=s.nextInt();        // 학생 줄 뽑기 번호
       }

       for(int i=0; i<scnt; i++){
            if(list[i]==0){
                result.add(i, std[i]);
            }
            else{
                result.add(i-list[i],std[i]);
            }
       }
       for(int i=0; i<scnt; i++){
        System.out.print(result.get(i)+" ");
       }
    }
}
