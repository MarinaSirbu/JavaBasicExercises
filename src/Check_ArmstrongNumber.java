public class Check_ArmstrongNumber {
    public static void main(String[] args) {
        //sum of individual digits^3 = number (ex.: 153)

        int number = 150;

        int c = 0;
        int a;
        int temp;

        temp=number;

        while (temp>0)
        {
            a=temp%10;
            temp=temp/10;
            c=c+(a*a*a);
        }

        if(number==c){
            System.out.println(number+" is Armstrong Number");
        } else {
            System.out.println(number+" is NOT Armstrong Number");
        }
    }
}
