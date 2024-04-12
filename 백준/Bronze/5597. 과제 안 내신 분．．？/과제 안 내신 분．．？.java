import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import  java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> attendance = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            attendance.add(i+1);
        }

        for (int i = 0; i < 28; i++) {
            attendance.remove(Integer.valueOf(Integer.parseInt(br.readLine())));
        }

        for(int answer : attendance) {
            bw.write(answer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}