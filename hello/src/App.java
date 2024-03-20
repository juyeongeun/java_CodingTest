import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요. ");
        int first = s.nextInt();

        System.out.println("두 번째 숫자를 입력하세요. ");
        double second = s.nextDouble();

        double added = first + second;
        
        System.out.println("두 숫자의 합은 " + added + " 입니다.");

        System.out.println("이름을 입력하세요. ");

        String name = s.next();

        System.out.println("이름은 " + name + " 입니다.");

        s.close();

    }
}
