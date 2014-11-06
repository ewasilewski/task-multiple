/**
 * Created by ewelinawasilewski on 04.11.14.
 */

public class Vielfaches {


    public static void main(String[] args) {
        iterate(100);
    }

    public static void iterate(int number) {
        for (int i = 1; i <= number; i++) {

            if (i % 15 == 0) {
                System.out.println("gutentag");
                continue;
            }

            if (i % 5 == 0) {
                System.out.println("tag");
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("guten");
                continue;
            }

            System.out.println(i);
        }
    }
}
