import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();

        String earlyTime = getEarlyTime(h, m);
        System.out.println(earlyTime);
    }

    private static String getEarlyTime(int h, int m) {
        int i = m - 45;
        int j = i >= 0 ? h : h - 1;
        if(j < 0) j = 23;
        return j + " " + (i >= 0 ? i : 60 + i);
    }
}