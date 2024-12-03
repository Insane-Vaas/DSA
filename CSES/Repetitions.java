import java.util.Scanner;

public class Repetitions {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char d = str.charAt(0);
        long count = 0, max_count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (d != str.charAt(i)) {
                d = str.charAt(i);
                count = 0;
            }
            count++;
            max_count = Math.max(max_count, count);
        }

        System.out.println(max_count);
        scan.close();
    }
}
