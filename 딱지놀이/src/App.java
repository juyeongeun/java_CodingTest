import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int round = s.nextInt();
        int[] A, B;
        int cntA=0, cntB=0; //A,B의 딱지 수/ 별, 동그라미, 네모, 세모 수

        for(int i=0; i<round; i++){
            int starA=0, rouA=0, recA=0, traA=0, starB=0, rouB=0, recB=0, traB=0;
            // 학생 A의 딱지 입력
            cntA=s.nextInt();
            A=new int[cntA];
            for(int j=0; j<cntA; j++){
                A[j]=s.nextInt();
                if(A[j]==4){
                    starA++;
                }
                else if(A[j]==3){
                    rouA++;
                }
                else if(A[j]==2){
                    recA++;
                }
                else{
                    traA++;
                }
            }
            // 학생 B의 딱지 입력
            cntB=s.nextInt();
            B=new int[cntB];
            for(int j=0; j<cntB; j++){
                B[j]=s.nextInt();
                if(B[j]==4){
                    starB++;
                }
                else if(B[j]==3){
                    rouB++;
                }
                else if(B[j]==2){
                    recB++;
                }
                else{
                    traB++;
                }
            }

            //딱지 비교
            if(starA>starB){
                System.out.println("A");
            }
            else if(starA<starB){
                System.out.println("B");
            }
            else{
                if(rouA>rouB){
                    System.out.println("A");
                }
                else if(rouA<rouB){
                    System.out.println("B");
                }
                else{
                    if(recA>recB){
                        System.out.println("A");
                    }
                    else if(recA<recB){
                        System.out.println("B");
                    }
                    else{
                        if(traA>traB){
                            System.out.println("A");
                        }
                        else if(traA<traB){
                            System.out.println("B");
                        }
                        else{
                            System.out.println("D");
                        }
                    }
                }
            }
        }
    }
}