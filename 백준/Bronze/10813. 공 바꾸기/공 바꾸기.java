import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] basket = new int[scan.nextInt()];
        int tryCount = scan.nextInt();

        for(int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for(int i = 0; i < tryCount; i++) {
            int s = scan.nextInt() - 1;
            int e = scan.nextInt() - 1;

            int tmp = basket[s];
            basket[s] = basket[e];
            basket[e] = tmp;
        }

        for(int answer : basket) {
            System.out.print(answer + " ");
        }
    }
}