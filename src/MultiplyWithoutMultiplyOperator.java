public class MultiplyWithoutMultiplyOperator {
    public static void main(String[] args) {
        int multiplication1 = multiplyWithForLoop(6,3);
        System.out.println(multiplication1);

        int multiplication2 = multiplyWithWhileLoop(7,8);
        System.out.println(multiplication2);
    }

    public static int multiplyWithForLoop(int a, int b){
        int multiplication = 0;

        for (int i = 1; i <= b; i++ ) {
            multiplication = multiplication+a;
        }

        return multiplication;
    }

    public static int multiplyWithWhileLoop(int a, int b){
        int multiplication = 0;
        int k = 1;
        while (k<=b){
            multiplication = multiplication+a;
            k++;
        }


        return multiplication;
    }
}
