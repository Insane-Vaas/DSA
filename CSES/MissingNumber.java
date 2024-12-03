import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long sum = (n * (n + 1)) / 2;
        for (int i = 0; i < n - 1; i++) {
            long d = scan.nextLong();
            sum -= d;
        }
        System.out.println(sum);
        scan.close();
    }
}
