import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Payment = scan.nextInt();
        int quantity = scan.nextInt();

        for(int i = 0; i < quantity; i++) {
            int price = scan.nextInt();
            int count = scan.nextInt();

            Payment = Payment - (price * count);
        }

        if(Payment == 0) 
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}