import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner s =new Scanner(System.in);

        String cheolsu;
        String younghei;

        System.out.print("철수 >> ");
        cheolsu=s.next();
        System.out.print("영희 >> ");
        younghei=s.next();

        if(cheolsu.equals(younghei)){
            System.out.println("비겼습니다.");
        }
        else if(cheolsu.equals("가위") && younghei.equals("바위")){
            System.out.println("영희가 이겼습니다.");
        }
        else if(cheolsu.equals("가위") && younghei.equals("보")){
            System.out.println("철수가 이겼습니다.");
        }
        else if(cheolsu.equals("바위") && younghei.equals("보")){
            System.out.println("영희가 이겼습니다.");
        }
        else if(cheolsu.equals("바위") && younghei.equals("가위")){
            System.out.println("철수가 이겼습니다.");
        }
        else if(cheolsu.equals("보") && younghei.equals("가위")){
            System.out.println("영희가 이겼습니다.");
        }
        else if(cheolsu.equals("보") && younghei.equals("가위")){
            System.out.println("철수가 이겼습니다.");
        }
        s.close();
    }
}
