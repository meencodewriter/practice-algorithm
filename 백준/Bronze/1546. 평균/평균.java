import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int highScore = 0;
        double totalScore = 0.0;

        for(int i = 0; i < n; i++) {
            int score = Integer.parseInt(st.nextToken());
            if(highScore < score)
                highScore = score;
            totalScore += score;
        }
        System.out.println(((totalScore/highScore) * 100) / n);
    }
}