import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabets = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabets[i] = -1;
        }

        String word = br.readLine();
        for (int i = 0; i < word.length(); i++) {
            int order = word.charAt(i) -97;
            if(alphabets[order] == -1)
                alphabets[order] = i;
        }

        for(int answer : alphabets)
            System.out.print(answer + " ");
    }
}