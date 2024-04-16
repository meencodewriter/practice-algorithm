import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();

        for (int i = 2; i >= 0; i--) {
            sba.append(a.charAt(i));
            sbb.append(b.charAt(i));
        }
        if (Integer.parseInt(sba.toString()) > Integer.parseInt(sbb.toString()))
            System.out.println(sba);
        else System.out.println(sbb);
    }
}