public class BeerBottleSong {

    public static void main(String[] args) {
        int bottlesnum = 10;
        String word = "Bottles";

        while (bottlesnum > 0) {
            System.out.println(
                bottlesnum + " green " + word + ", hanging on the wall."
            );
            System.out.println(
                bottlesnum + " green " + word + ", hanging on the wall."
            );

            System.out.println("And if one bottle should accidentally fall,");
            bottlesnum -= 1;
            if (bottlesnum == 1) {
                word = "Bottle";
            }

            if (bottlesnum > 0) {
                System.out.println(
                    "There'll be " +
                    bottlesnum +
                    " green " +
                    word +
                    ", hanging from the wall."
                );
            } else {
                System.out.println(
                    "There'll be no green bottles, hanging on the wall."
                );
            }
        }
    }
}
