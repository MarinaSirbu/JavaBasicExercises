import java.util.ArrayList;
import java.util.List;

public class Array_CompareSameIndexesAndCreateNewArray {
    public static void main(String[] args) {

        int a[] = {1, 4, 5, 7};
        int b[] = {6, 4, 3, 7};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < a.length; i++){
            if(a[i]==b[i]){
                list.add(a[i]);
            }
        }

        Object[] c = list.toArray();
        for (Object o : c){
            System.out.println(o);
        }
    }
}
