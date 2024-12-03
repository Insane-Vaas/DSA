import java.util.Scanner;

public class Permutations {

    static int m = 1000000007;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder str = new StringBuilder();

        long n = scan.nextLong();
        if (n > 3 || n == 1) {
            if (n % 2 == 0) {
                long e = n;
                n = n - 1;

                while (n > 0) {
                    str.append(n + " ");
                    n -= 2;
                }

                while (e > 0) {
                    str.append(e + " ");
                    e -= 2;
                }
            } else {
                long o = n;
                n = n - 1;

                while (o > 0) {
                    str.append(o + " ");
                    o -= 2;
                }

                while (n > 0) {
                    str.append(n + " ");
                    n -= 2;
                }
            }
        } else {
            System.out.print("NO SOLUTION");
        }

        System.out.print(str);

        scan.close();
    }
}
