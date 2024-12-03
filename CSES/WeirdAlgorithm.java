import java.util.*;

public class WeirdAlgorithm {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();

        while (n > 1) {
            System.out.print(n + " ");
            if (n >= 2 && n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n /= 2;
            }
        }
        System.out.println(n);
        scan.close();
    }
}
