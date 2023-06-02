public class Array_MaxNumbers {
    public static void main(String[] args) {
        int a[] = {9, 2, 170000, 99, 1100, 668, 6};

        int max=a[0];
        for (int i = 0; i < a.length; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
