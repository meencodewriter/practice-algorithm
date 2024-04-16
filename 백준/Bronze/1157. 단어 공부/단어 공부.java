import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabets = new int[26];
        int max = 0;
        int idx = -1;
        String word = br.readLine();
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) > 'Z') {
                alphabets[word.charAt(i) - 97]++;
            } else {
                alphabets[word.charAt(i) - 65]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if(alphabets[i] > max) {
                max = alphabets[i];
                idx = i;
            } else if(alphabets[i] == max) idx = -1;
        }
        System.out.println(idx == -1 ? '?' : (char) (idx+65));
        br.close();
    }
}