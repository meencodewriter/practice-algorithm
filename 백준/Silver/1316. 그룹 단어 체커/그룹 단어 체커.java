import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            int[] alphabetList = new int[26];

            for (int j = 0; j < word.length(); j++) {
                char first = word.charAt(j);
                if(alphabetList[first - 97] != 0 && first != word.charAt(j-1))
                    break;
                else
                    alphabetList[first-97]++;

                if(j == word.length()-1)
                    result++;
            }
        }
        System.out.println(result);
        br.close();
    }
}