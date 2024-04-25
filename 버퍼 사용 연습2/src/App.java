import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        StringTokenizer st = new StringTokenizer(num);

        int pw = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int cnt=0;

        for(int i=start; i<=pw; i++){
            cnt++;
        }

        bw.write(cnt +"\n");
        bw.flush();
        bw.close();
    }
}
