import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] basket = new int[scan.nextInt()];
        int tryCount = scan.nextInt();

        for(int i = 0; i < tryCount; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            int ballN = scan.nextInt();

            for(int j = s - 1; j <= e - 1; j++) {
                basket[j] = ballN;
            }
        }

        for(int answer : basket) {
            System.out.print(answer + " ");
        }
    }
}