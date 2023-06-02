public class Array_BubbleSortDesc {
    //bubble sort
    public static void main(String[] args) {
        int a[] = {2,6,1,4,9};
        int temp;

        for(int i = 0; i < a.length; i++){

            for (int j = i+1; j < a.length; j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int array : a){
            System.out.print(array+" ");
        }
    }
}
