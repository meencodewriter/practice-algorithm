import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] scoreArr = new int[Integer.parseInt(br.readLine())];
        String[] a = br.readLine().split(" ");
        int highScore = 0;
        double totalScore = 0;

        for (int i = 0; i < scoreArr.length; i++) {
            int score = Integer.parseInt(a[i]);
            scoreArr[i] = score;
            if(highScore < score) highScore = score;
        }

        for (int score : scoreArr) 
            totalScore = totalScore + getDeceptionScore(score, highScore);

        System.out.println((double) totalScore / scoreArr.length);
    }

    public static double getDeceptionScore(int score, int highScore) {
        return score * ((double) 100 / highScore);
    }
}