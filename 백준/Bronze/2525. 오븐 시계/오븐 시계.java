import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();
        int addT = scan.nextInt();

        String completionTime = getCompTime(h, m, addT);
        System.out.println(completionTime);
    }

    private static String getCompTime(int h, int m, int addT) {
        int sumMin = m + addT;
        h = (int) (h + Math.floor((double) sumMin / 60));
        m = sumMin % 60;

        if(h >= 24) {
            h = h - 24;
        }
        return h + " " + m ;
    }
}