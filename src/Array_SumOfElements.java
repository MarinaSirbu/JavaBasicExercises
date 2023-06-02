public class Array_SumOfElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        int sum = sumOfElements(array);
        System.out.println(sum);
    }

    public static int sumOfElements (int[] array){
        int sum = 0;
        for (int i=0; i< array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
