public class Factorial {
    public static void main(String[] args) {
        int number = 6;
        System.out.println(calcFactorial(number));
    }

    public static int calcFactorial(int number){
        int k = 1;
        for(int i=1; i <= number; i++){
            k = k*i;
        }
        return k;
    }
}
