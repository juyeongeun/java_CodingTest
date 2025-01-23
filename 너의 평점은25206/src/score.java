import java.util.Scanner;
public class score {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
       String[] subject= new String[20];
       float[] time = new float[20];
       String[] mrank = new String[20];
       float sum=0, sumt=0;

       for (int i=0; i<20; i++){
            subject[i]=s.next();
            time[i]=s.nextFloat();
            mrank[i]=s.next();
       }
       
       for (int i=0; i<20; i++){
            switch (mrank[i]) {
                case "A+":
                    sum+=time[i]*4.5;
                    sumt+=time[i];
                    break;
                case "A0":
                    sum+=time[i]*4.0;
                    sumt+=time[i];
                    break;
                case "B+":
                    sum+=time[i]*3.5;
                    sumt+=time[i];
                    break;
                case "B0":
                    sum+=time[i]*3.0;
                    sumt+=time[i];
                    break;
                case "C+":
                    sum+=time[i]*2.5;
                    sumt+=time[i];
                    break;
                 case "C0":
                    sum+=time[i]*2.0;
                    sumt+=time[i];
                    break;
                case "D+":
                    sum+=time[i]*1.5;
                    sumt+=time[i];
                    break;
                case "D0":
                    sum+=time[i]*1.0;
                    sumt+=time[i];
                    break;
                case "F":
                    sum+=time[i]*0.0;
                    sumt+=time[i];
                    break;
                default:
                    break;
            }
       }
       System.out.println(sum/sumt);
       s.close();
    }
}
