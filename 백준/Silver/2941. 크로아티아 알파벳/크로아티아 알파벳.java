import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int answer = 0;
        for (int i = 0; i < word.length(); i++) {
            answer++;
            if(i < word.length() - 1) {
                char first = word.charAt(i);
                char second = word.charAt(i+1);
                char third = i < word.length() - 2 ? word.charAt(i+2) : 0;

                i += compare(first, second, third);
            }
        }
        System.out.println(answer);
        br.close();
    }

    public static int compare(int first, int second, char third) {
        int result = 0;

        if(first == 'c') {
            if (second == '=') return 1;
            if (second == '-') return 1;
        }
        if(first == 'd') {
            if (second == '-') return 1;
            if (second == 'z' && third == '=') return 2;
        }
        if(first == 'l' && second == 'j') return 1;
        if(first == 'n' && second == 'j') return 1;
        if(first == 's' && second == '=') return 1;
        if(first == 'z' && second == '=') return 1;

        return result;
    }
}