import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int time = 0;
        for(int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if(character < 'R') {
                time += (character - 65) / 3;
            } else if(character == 'Z'){
                time += (character - 67)/ 3;
            } else {
                time += (character - 66)/ 3;
            }
            time += 3;
        }
        System.out.println(time);
    }
}