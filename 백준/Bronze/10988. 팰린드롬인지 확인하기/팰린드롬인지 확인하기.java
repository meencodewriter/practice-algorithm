import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder(br.readLine());

        String a = word.toString();
        String b = word.reverse().toString();
        if (a.equals(b)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}