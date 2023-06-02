import java.util.ArrayList;
import java.util.List;

public class Array_RemoveDuplicates_ArrayList {
    public static void main(String[] args) {

        int a[] = {4,5,5,5,4,6,6,9,4};

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
        }
        Object[] newArray = list.toArray();
        for(Object o : newArray){
            System.out.print(o+" ");
        }
    }
}
