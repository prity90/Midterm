package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        *

        */

        int r = 6, a = 0;

        for(int i = 1; i <= r; i++, a = 0) {
            for(int s = 1; s <= r - i; ++s) {
                System.out.print("  ");
            }

            while(a != 2 * i - 1) {
                System.out.print("* ");
                ++a;
            }
            System.out.println();
        }
    }
  }
