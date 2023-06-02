public class Check_PrimeNumber {
    public static void main(String[] args) {

        int val = 17;
        boolean flag = false;

        for(int i = 2; i <= val/2; i++){
            if(val%i==0){
                flag=true;
                break;
            }
        }

        if(flag){
            System.out.println("Number is not prime");
        } else{
            System.out.println("Number is prime");
        }

    }
}
