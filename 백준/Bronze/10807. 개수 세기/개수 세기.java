import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] numberArr = new int[size];
        for(int i = 0; i < size; i++) {
            numberArr[i] = scan.nextInt();
        }
        int targetNumber = scan.nextInt();
        int answer = 0;
        for (int i = 0; i < size; i++) {
            if(numberArr[i] == targetNumber) answer++;
        }

        System.out.println(answer);
    }
}