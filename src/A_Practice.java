import java.util.*;
import java.util.stream.Collectors;

public class A_Practice {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,9,10,35};
        int array2[] = {7,9,13,4,9,10,30,35};
        int array0[] = {7, 9, 13, 4, 9, 10, 30, 35, 40, 20, 50, 40, 1};

        System.out.println(sumArray(array)); //29

        multiplyTable(5);

        System.out.println(multiply(5,9));

        System.out.println(maxDiff(array));

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<array.length; i++){
            for (int j=0; j<array2.length; j++){
                if(array[i]==array2[j]){
                    list.add(array[i]);
                }
            }
        }
        Object[] array3 = list.toArray();
        for(Object element: array3){
            System.out.print(element+" ");
        }

        System.out.println();
        System.out.println("*****************");

        for (int elem : sortAsc(array0)) {
            System.out.print(elem + " ");
        }
        System.out.println();

        int arrayCollection[] = {7, 9, 13, 4, 9, 10, 30, 35, 40, 20, 50, 40, 1};
        List<Integer> listCollection = new ArrayList<>();
        for(int i=0; i<arrayCollection.length;i++){
            listCollection.add(arrayCollection[i]);
        }
        Collections.sort(listCollection, Collections.reverseOrder());
        Object[] objects = listCollection.toArray();
        Arrays.stream(objects).forEach(x -> System.out.print(x+" "));
        System.out.println();
        listCollection.stream().forEach(x -> System.out.print(x+" "));

        System.out.println();
        System.out.println("*****************");

        rightAngledTriangleAsc(10);

        leftAngledTriangleDesc(10);

        printFibonacciSeries(10);

        System.out.println("\n"+fibonacciNumber(9));

        System.out.println(isPrime(19));

        int arrayM[][] = {{0,1,2},{-4,0,3},{5},{7,-1}};
        System.out.println(minNumber(arrayM));

        System.out.println(reverseString("String"));

        System.out.println(reverseStringBuilder("String"));

        System.out.println(isPalindromeString("Madam"));

        System.out.println(isPalindromeStringBuilder("Madame"));

        System.out.println(countCharacterOccurrence("AaaaOoUUe",'p'));

        System.out.println(countWords("What a wonderful day"));

        System.out.println(countWordOccurrence("Very very good", "very"));

        System.out.println(reverseNumber(12));

        System.out.println();
        System.out.println("*****************");

        int[] a = {1,2,2,2,3,4,5,5};
        List<Integer> originalValues = new ArrayList<>();
        for(int elem : a){
            originalValues.add(elem);
        }

        Set<Integer> setWithoutDuplicates = new TreeSet<>(originalValues);

        for(int elem:setWithoutDuplicates){
                System.out.println(elem+" - frequency: "+Collections.frequency(originalValues,elem));
        }

        List<Integer> duplicatesList = originalValues.stream()
                .filter(element -> Collections.frequency(originalValues,element)>1)
                        .collect(Collectors.toList());

        Set<Integer> duplicates = new TreeSet<>(duplicatesList);

        Set<Integer> unique = new TreeSet<>(setWithoutDuplicates);
        unique.removeAll(duplicates);

        System.out.println(originalValues);
        System.out.println(setWithoutDuplicates);
        System.out.println(duplicatesList);
        System.out.println(duplicates);
        System.out.println(unique);

        System.out.println("*****************");

        System.out.println(factorial(0));

        evenNum(a);

        int[][] multArray = {{-30,-12,-20},{-20,-20,-15},{-25,-28,-30}};
        System.out.println("\n"+maxIndex(multArray));

        System.out.println(isArmstrong(1635));

        int arr[]={0,-1,-5,-6,-7};
        System.out.println(isDifferent(arr));

        System.out.println(onePositive(arr));

        System.out.println(checkIfDivides(2,4,6));

        char[][] chars1 = {{'w','w','w','w'},
                {'b','b','b','b'},
                {'w','w','w','w'},
                {'y','y','y','y'}};
        char[][] chars2 = {{'b','b','b','b'},
                {'b','w','w','b'},
                {'b','w','w','b'},
                {'b','b','b','b'}};
        System.out.println(checkNo2x2Matrix(chars2));

        System.out.println(Arrays.deepToString(chars1));

        int n=6;
        int[][] m = new int[n][n];
        for(int i=0; i<m.length; i++){
            for(int j=0; j<m[i].length; j++){
                m[i][j]=Math.abs(j-i);
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("***********");

        int[][] m2 = new int[n][n];
        for(int i=0; i<m2.length; i++){
            for(int j=0; j<m2[i].length; j++){
                m2[i][j]=Math.abs(j-(m2.length-1)+i);
                System.out.print(m2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("*************");

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Cherry");
        map.put(3,"Blueberry");
        System.out.println(map.get(1));

        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Apple", 1);
        map2.put("Cherry", 2);
        map2.put("Blueberry", 3);

        System.out.println(getKey(map2,2));
        System.out.println(getKey(map,"Cherry"));

        List<String> stringList = new ArrayList<>();
        stringList.add("it");
        stringList.add("finance");
        stringList.add("hr");
        stringList.add("marketing");
        System.out.println(stringList);

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            if(element.length()<3){
                iterator.remove();
            }
        }
        System.out.println(stringList);


        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        integerList.stream().map(x -> x * x).toList().forEach(x->System.out.print(x+" "));
        System.out.println();

        pow2(integerList).forEach(x->System.out.print(x+" "));

    }

    public static Collection<Integer> pow2(Collection<Integer> collection){
        return collection.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public static <T,U> String getKey(Map<T, U> map, U value){
        String key=null;
        for(Map.Entry<T, U> entry : map.entrySet()){
            if(entry.getValue()==value){
                key=entry.getKey().toString();
                break;
            }
        }
        return key;
    }
    public static int sumArray (int[] array){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void multiplyTable(int number){
        int sum = 0;
        for(int i = 0; i<=10; i++){
            if(i==0){
                System.out.println(i+"*"+number+"="+i);
            } else {
                sum+=number;
                System.out.println(i+"*"+number+"="+sum);
            }
        }
    }

    public static int multiply(int a, int b){
        int result = 0;
        for(int i = 1; i <= a; i++){
            if(a==0 || b==0){result=0;
            } else {
                result+=b;
            }
        }
        return result;
    }

    public static int maxDiff(int[] array){
        int maxDiff = array[1]-array[0];
        for(int i = 0; i < array.length-1; i++){
            if(array[i+1]-array[i]>maxDiff){
                maxDiff=array[i+1]-array[i];
            }
        }
        return maxDiff;
    }

    public static int[] sortAsc(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void rightAngledTriangleAsc(int num){
        for (int i=1; i<=num; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void leftAngledTriangleDesc(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void printFibonacciSeries(int n) {
        int a = 0;
        int b = 1;
        int sum;
        if (n == 1) {
            System.out.print(a + " ");
        } else {
            System.out.print(a + " " + b + " ");
            if(n>2) {
                for (int i = 1; i <= n - 2; i++) {
                    sum = a + b;
                    System.out.print(sum + " ");
                    a = b;
                    b = sum;
                }
            }
        }
    }

    public static int fibonacciNumber(int n) {
        int a = 0;
        int b = 1;
        int sum=0;
        if (n <= 2) {
            sum = n - 1;
        } else {
            for (int i = 1; i <= n - 2; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int minNumber(int[][] array) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public static String reverseString(String string){
        String reversed="";
        for(int i=string.length()-1; i>=0; i--){
            reversed=reversed+string.charAt(i);
        }
        return reversed;
    }

    public static String reverseStringBuilder(String string){
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        return String.valueOf(stringBuilder);
    }

    public static boolean isPalindromeString(String string){
        boolean isPalindrome=false;
        String reversed="";
        for(int i=string.length()-1; i>=0; i--){
            reversed=reversed+string.charAt(i);
        }
        if(string.equalsIgnoreCase(reversed)){
            isPalindrome = true;
        }
        return isPalindrome;
    }

    public static boolean isPalindromeStringBuilder(String string) {
        StringBuilder stringBuilder = new StringBuilder(string).reverse();
        if (string.equalsIgnoreCase(String.valueOf(stringBuilder))) {
            return true;
        } else {
            return false;
        }
    }

    public static int countCharacterOccurrence(String string, Character character){
        int count=0;
        for(int i=0; i<string.length(); i++){
            if(String.valueOf(string.charAt(i)).equalsIgnoreCase(String.valueOf(character))){
                count++;
            }
        }
        return count;
    }

    public static int countWords(String string){
        String[] array = string.split(" ");
        return array.length;
    }

    public static int countWordOccurrence(String string, String word){
        int count=0;
        String[] array = string.split(" ");
        for(int i=0; i<array.length; i++){
            if(word.equalsIgnoreCase(array[i])){
                count++;
            }
        }
        return count;
    }

    public static int reverseNumber(int n){
        int reversed = n%10;
        int mod;
        while(n>10){
            n=n/10;
            mod=n%10;
            reversed=reversed*10+mod;
        }
        return reversed;
    }

    public static long factorial(int n){
        long result=1;
        if(n>0){
            while(n>=1){
                result=result*n;
                n--;
            }
        }
        return result;
    }

    public static void evenNum(int[] arr){
        for(int elem : arr){
            if(elem%2!=0){
                continue;
            }
            System.out.print(elem+" ");
        }
    }

    public static int maxIndex(int[][]arr){
        int max=Integer.MIN_VALUE;
        int sum=0;
        int index=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
            if(max<sum){
                max=sum;
                index=i;
            }
            sum=0;
        }
        return index;
    }

    public static boolean isArmstrong(int n){
        int countDigits=0;
        int tempN1=n;
        int tempN2=n;
        int k;
        int sum=0;

        while(tempN1!=0){
            tempN1/=10;
            countDigits++;
        }

        while(tempN2!=0){
            k= (int) Math.pow(tempN2%10,countDigits);
            sum=sum+k;
            tempN2/=10;
        }

        if(n==sum){
            return true;
        } else {
            return false;
        }
    }


    public static boolean isDifferent(int[] arr) {
        boolean condition = true;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    condition = false;
                    break;
                }
            }
        }
        return condition;
    }

    public static boolean onePositive(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]>0){
                count++;
            }
        }
        if(count==1){
            return true;
        } else{
            return false;
        }
    }

    public static String checkIfDivides(int n, int m, int k){
        String result;
        if((n+m)>=k && (k%n==0 || k%m==0)){
            result="YES";
        } else {
            result="NO";
        }
        return result;
    }

    public static String checkNo2x2Matrix(char[][] arr){
        String condition="YES";
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr[i].length-1; j++){
                if(arr[i][j]==arr[i+1][j] && arr[i][j+1]==arr[i+1][j+1]){
                    condition="NO";
                    break;
                }
            }
        }
        return condition;
    }
}
