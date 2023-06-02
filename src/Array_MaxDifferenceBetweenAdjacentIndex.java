public class Array_MaxDifferenceBetweenAdjacentIndex {
    public static void main(String[] args) {
        int[] array = {1, 4, 8, 15, 29, 0};
        int maxDiff = maxDifferenceBetweenAdjacentIndex(array);
        System.out.println(maxDiff);
    }

    public static int maxDifferenceBetweenAdjacentIndex(int[] array){
        int diff = 0;

        for(int i = 0; i < array.length - 1; i++){
            if (array[i+1] - array[i] > diff){
                diff = array[i+1] - array[i];
            }
        }

        return diff;
    }
}
