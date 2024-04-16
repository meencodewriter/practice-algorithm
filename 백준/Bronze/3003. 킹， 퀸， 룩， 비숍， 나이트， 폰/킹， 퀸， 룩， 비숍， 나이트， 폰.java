import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] pieces = br.readLine().split(" ");
        System.out.print(1 - Integer.parseInt(pieces[0]) + " ");
        System.out.print(1 - Integer.parseInt(pieces[1]) + " ");
        System.out.print(2 - Integer.parseInt(pieces[2]) + " ");
        System.out.print(2 - Integer.parseInt(pieces[3]) + " ");
        System.out.print(2 - Integer.parseInt(pieces[4]) + " ");
        System.out.print(8 - Integer.parseInt(pieces[5]));
    }
}