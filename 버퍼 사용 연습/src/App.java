import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class App{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());

        for(int TC=1; TC<=num; TC++){
            bw.write("#");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }
}
