import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); //첫번째 주어지는 수
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> tmp ;
        int first, second, last=0;

        for(int i=num/2; i<=num; i++){
            tmp = new ArrayList<>(); //새로 초기화하고 넣어야하기 때문에
            first=num;
            second=i;
            tmp.add(first);
            tmp.add(second);

            while(true){
                last=first-second;
                if(last<0){
                    break;
                }
                else{
                    tmp.add(last);
                    first=second;
                    second=last;
                }
            }
            
            if(result.size()<tmp.size()){
                result.removeAll(result);
                for(int j=0; j<tmp.size(); j++){
                    result.add(tmp.get(j));
                    
                }
            }
        }
        System.out.println(result.size());
        for(int i =0; i<result.size(); i++){
            System.out.print(result.get(i)+" ");
        }
        s.close();
    }
}
