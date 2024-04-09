import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        int reward;
        if(i == j && i == k) {
            reward = 10000 + (i * 1000);
        } else if (i == j) {
            reward = 1000 + (i * 100);
        } else if (j == k) {
            reward = 1000 + (j * 100);
        } else if (i == k) {
            reward = 1000 + (i * 100);
        } else {
            int max = Math.max(i, Math.max(j, k));
            reward = max * 100;
        }
        System.out.println(reward);
    }
}