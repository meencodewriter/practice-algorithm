import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int quantity = read();
        int count = read();

        int[] basket = new int[quantity];
        for(int i = 0; i < quantity; i++) {
           basket[i] = i;
        }

        for(int i = 0; i < count; i++) {
            int a = read() - 1;
            int z = read() - 1;
            int[] empty = new int[z - a + 1];

            for(int j = 0; j < (z - a + 1); j++) {
                empty[j] = basket[a + j];
            }
            for(int j = 0; j < (z - a + 1); j++) {
                basket[z - j] = empty[j];
            }
        }

        for(int answer : basket)
            System.out.print(answer + 1 + " ");
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while((c = System.in.read()) > 32)
            n = (n << 3) + (n << 1) + (c & 15);
        return n;
    }
}