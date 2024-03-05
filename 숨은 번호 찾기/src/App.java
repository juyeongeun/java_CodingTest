import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String re;
        boolean run=true;
    
        while(run){
            int num, max=99, min=0;
            Random r = new Random();
            int k = r.nextInt(100);
            
            System.out.println("Up & Down게입입니다. 숨겨진 수를 맞추어 보세요");
            System.out.println("0-99");

            for(int i=1; i<100; i++){

                System.out.print(i+">>");
                num=s.nextInt();

                if(k==num){
                    System.out.println("맞았습니다.");
                    System.out.print("다시하시겠습니까(y/n) >>");
                    re=s.next();
                    if(re.equals("y")){
                        break;
                    }
                    else{
                        run=false;
                        break;
                    }
                }
                else if(k<num){
                    System.out.println("더 낮게");
                    max=num;
                    System.out.println(min+"-"+num);
                }
                else{
                    System.out.println("더 높게");
                    min=num;
                    System.out.println(num+"-"+max);
                }
                continue;
            }
        }
    }
}
