import java.util.ArrayList;
import java.util.List;

public class Array_PrintUniqueNumbers {
    public static void main(String[] args) {

        int a[] = {4,5,5,5,4,6,6,9,4,0};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            int k = 0;

            if(!list.contains(a[i])){
                list.add(a[i]);
                k++;

                for (int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        k++;
                    }
                }
//                System.out.println(a[i]);
//                System.out.println(k);
                if(k==1){
                    System.out.println(a[i]+" is unique number");
                }
            }
        }



    }
}
