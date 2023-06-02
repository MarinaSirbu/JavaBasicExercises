public class PrintPyramidPattern {
    public static void main(String[] args) {
//        *
//        **
//        ***
//        ****
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//           *
//          **
//         ***
//        ****
        for (int a = 1; a <= 4; a++) {
            for (int b = 3; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

//           *
//          ***
//         *****
//        *******
        for (int a = 1; a <= 4; a++) {
            for (int b = 3; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            for (int d = 2; d <= a; d++) {
                System.out.print("*");
            }

            System.out.println();
        }

//        ****
//        ***
//        **
//        *
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        ****
//         ***
//          **
//           *
        for (int a = 1; a <= 4; a++) {
            for (int c = 1; c < a; c++) {
                System.out.print(" ");
            }
            for (int b = 4; b >= a; b--) {
                System.out.print("*");
            }
            System.out.println();
        }

//        *******
//         *****
//          ***
//           *
        for (int a = 1; a <= 4; a++) {
            for (int c = 1; c < a; c++) {
                System.out.print(" ");
            }
            for (int b = 4; b >= a; b--) {
                System.out.print("*");
            }
            for (int j = 3; j >= a; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

// diamond

        for (int a = 1; a <= 4; a++) {
            for (int b = 3; b >= a; b--) {
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++) {
                System.out.print("*");
            }
            for (int d = 2; d <= a; d++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int a = 1; a <= 4; a++) {
            for (int c = 1; c < a; c++) {
                System.out.print(" ");
            }
            for (int b = 4; b >= a; b--) {
                System.out.print("*");
            }
            for (int j = 3; j >= a; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

/*    1
     212
    32123
   4321234
  543212345
  543212345
   4321234
    32123
     212
      1   */
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
