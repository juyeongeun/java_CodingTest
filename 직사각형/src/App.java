import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        for(int i=0; i<4; i++){
            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int p1 = s.nextInt();
            int q1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();
            int p2 = s.nextInt();
            int q2 = s.nextInt();

            if (p1 < x2 || q1 < y2 || p2 < x1 || q2 < y1) {
				System.out.println("d");
			}
			else if ((x1 == p2 && y1 == q2) || (x1 == p2 && q1 == y2) || (p1 == x2 && q1 == y2) || (p1 == x2 && y1 == q2)) {
				System.out.println("c");
			}
			else if (p1 == x2 || q1 == y2|| p2 == x1 || y1 == q2){
				System.out.println("b");
			}
			else {
				System.out.println("a");
			}
        }

    }
}
