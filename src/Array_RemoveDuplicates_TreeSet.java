import java.util.*;

public class Array_RemoveDuplicates_TreeSet {
    public static void main(String[] args) {
        int arr[] = {10, 100, 20, 30, 30, 40, 50, 50, 100};

        Set<Integer> s = new TreeSet<>();
        for(int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }

        System.out.println(s);
    }
}
