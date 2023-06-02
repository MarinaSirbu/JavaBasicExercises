public class Fibonacci_Number {
    public static void main(String[] args) {
        //0, 1, 1, 2, 3, 5, 8, 13, 21
        int number = 9;

        int a = 0;
        int b = 1;

        int sum = 0;

        if(number<=2){
            sum = number-1;
        } else {
            for(int i = 1; i <= number-2; i++){
                sum=a+b; //0+1=1; 1+1=2; 1+2=3; 2+3=5

                a=b; //1; 1; 2; 3
                b=sum; //1; 2; 3; 5
            }
        }

        System.out.println(sum);
    }
}
