import java.util.Scanner;

public class NumberSpiral {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long n = scan.nextLong();
        StringBuilder str = new StringBuilder();

        while (n > 0) {
            long x = scan.nextLong();
            long y = scan.nextLong();

            if (x == 1 || y == 1) {
                str.append(
                    (x * x > y * y)
                        ? Long.toString(x * x) + "\n"
                        : Long.toString(y * y) + "\n"
                );
            } else {
                str.append(
                    (x * x >= y * y)
                        ? Long.toString(x * x - y + 1) + "\n"
                        : Long.toString(y * y - x + 1) + "\n"
                );
            }
            n--;
        }
        System.out.println(str);

        scan.close();
    }
}
