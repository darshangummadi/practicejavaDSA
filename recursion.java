import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class recursion { 
    static void print(int i, int n){
        if (i>n) return;
        System.out.println("Darshan");
        print(i+1,n);
    }

    static void print1(int i, int n){
        if (i>n) return;
        System.out.println(i);
        print1(i+1,n);
    }
    static void print2(int i, int n){
        if (i<1) return;
        System.out.println(i);
        print2(i-1,n);
        
    }
    static void func(int i, int n){
        
        // Base Condition.
        if(i<1) return;
        System.out.println(i);

        // Function call to print i till i decrements to 1.
        func(i-1,n);

    }

    static void sumOfN(int i, int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        sumOfN(i-1, sum+i);
    }

    static int sumOfN1(int n){
        if(n == 0) return 0;
        return (n + sumOfN1( n-1)) ;
    }

    static void revrsearray(int arr[], int i, int n) {
        if (i >= n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1]=temp;
        revrsearray(arr,i+1 , n);
    }

    static void printArray(int ans[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(ans[i] + " ");
        }
     }
     //Function to reverse array using an auxiliary array
     static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
           ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
     }

    static private boolean isPalindrome(String s) {
    int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            //System.out.println(Character.isLetterOrDigit(l));
            if(!Character.isLetterOrDigit(l)) 
                left++;
            else if(!Character.isLetterOrDigit(r)) 
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;
            else {
                left++; 
                right--;
            }
        }
        return true;
  }

    static int f(int n){
        if (n<=1) {
            return n;
        }
        int last = f(n-1);
        int nextlast = f(n-2);
        return last + nextlast;
    }
    
    static void fibb(int n){
        if (n == 0) {
            System.out.println(0);
          } else {
            int fib[] = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
              fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println("The Fibonacci Series up to "+n+"th term:");
            for (int i = 0; i <= n; i++) {
              System.out.print(fib[i] + " ");
            }
          }
    }

    static int arrangeCoins(int n){
        int coins = n;
        for (int i=1;i<=n;i++){
            coins = coins -i;
            if (coins < 0)
               return i-1;
        }
        return 1;
    }

    public static String baseseven(int num){
        if (num==0) 
           return "0";
        StringBuilder ans = new StringBuilder();
        int x = num;
        num = Math.abs(num);
        while (num != 0) {
            ans.append(num%7);
            num = num/ 7;
        }
        if (x<0){
            ans.append("-");
        }
        return ans.reverse().toString();
    }
    
    public static int hello1(){
        return 0;
    }

    public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n];
 
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " --> " + count);
    }
}



    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printFirstNPrimes(int n) {
        int[] primes = new int[n];
        int num = 2;
        int index = 0;

        while (index < n) {
            if (isPrime(num)) {
                primes[index] = num;
                index++;
            }
            num++;
        }

        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }

    static void selection_sort(int arr[], int n){
        for (int i =0;i < n-1;i++){
            int mini = i;
            for (int j = i+1 ; j < n; j ++){
                if (arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After Selection Sort: ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        //System.out.println();
    }

    static void bubble_sort(int arr[], int n){
        for (int i = n-1;i>=0;i--){
            for (int j = 0;j<i-1;j++){
                if  (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertion_sort(int arr[], int n){
        for (int i = 0; i <= n-1; i++ ){
            int j = i;
            while (j > 0 && (arr[j-1] > arr[j])){
                int tmp = arr[j-1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
                j--;
            }
        }
        for  (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static long sumOrProduct(int n, int q) {
		long ans = 1; // Initialize ans variable with 1 for product calculation
        long modulo = (long) Math.pow(10, 9) + 7; // Define modulo value
		if (q == 1) {
            // Calculate sum of integers from 1 to n
            ans = (long) n * (n + 1) / 2;
        } else if (q == 2) {
            // Calculate product of integers from 1 to n
            for (int i = 2; i <= n; i++) {
                ans = (ans * i) % modulo; // Apply modulo operation to avoid overflow
                System.out.print(ans);
                System.out.println();
            }
        }
		return ans % modulo;
	}

    public static void merge(int[] arr, int low, int mid, int  high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left<= mid && right <= high){
            if (arr[left]< arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while (right <= high){
            temp.add(arr[right]);
            right++;
        }
        for (int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }

    public static void mergesort(int[]arr, int low, int high){
        if (low>=high) return;
        int mid = (low + high)/2;
        mergesort(arr, low , mid);
        mergesort(arr,mid+1, high);
        merge(arr, low, mid, high);
    }

    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here.
        qs(arr, 0, arr.size() - 1);
        return arr;
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int n = candles.size();
        long max = Integer.MIN_VALUE; // Initialize max height to the minimum possible value
        int count = 0;
        System.out.print(max);
        // Find the maximum height of candles
        for (int i = 0; i < n; i++) {
            int height = candles.get(i);
            if (height > max) {
                max = height;
                count = 1; // Reset count if we find a taller candle
            } else if (height == max) {
                count++; // Increment count if we find a candle of the same height as the tallest candle
            }
        }
        return count;
    }

    public static String timeConversion(String s) {
        String[] timeSplit = s.split(":");
      
        int hour = Integer.parseInt(timeSplit[0]);
   
        String minute = timeSplit[1];
       
        String second = timeSplit[2].substring(0,2);
       
        if(s.contains("PM")&& hour!=12){
            hour+=12;
        }
        else if (s.contains("AM")&& hour == 12){
            hour = 0;
        }
        String hourStr = String.format("%02d",hour);
        String milataryTime = hourStr + ":" + minute +":"+ second;
        return milataryTime;
    }

    public static boolean isValidSudoku(char[][] board){
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i<9;i++){
            for(int j=0;j<9;j++){
                char currentVal = board[i][j];
                if (currentVal != '.'){
                    if (!seen.add(currentVal+"k"+i)||
                        !seen.add(currentVal+"l"+j)||
                        !seen.add(currentVal+"m"+i/3+"-"+j/3))
                        return false;
                    System.out.print(seen.add(currentVal+"k"+i));
                    System.out.println();
                }

                
            }
        }
        return true;
    }
    
    public static String reverseString(String str){
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
       /*Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = {9,4,7,6,3,1,5};
        System.out.println("Before Sorting the array: ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        recursion.mergesort(arr, 0, n-1);
        System.out.println("After sorting the Array: ");
        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        List<Integer> arr = new ArrayList<>();
        arr = Arrays.asList(new Integer[] {4, 6, 2, 5, 7, 9, 1, 3});
        int n = arr.size();
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        arr = recursion.quickSort(arr);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        List<Integer> candles = List.of(4, 4, 1, 3, 4);
        System.out.println(birthdayCakeCandles(candles));

        String time1 = "07:05:45PM";
        String time2 = "12:01:00AM";

        System.out.println(recursion.timeConversion(time1));
        System.out.println(); // Output: 19:05:45
        System.out.println(recursion.timeConversion(time2));

        try{
            DocumentBuilderFactory factory = new DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = new factory.newDocumentBuilder();
            Document document = new builder.parse("example.xml");
            Element root = document.getDocumentElement();
            NodeList nodeList = root.getChildNodes();
        }
        catch{Exception e}


        char[][] board1 = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Is board1 valid? " + recursion.isValidSudoku(board1));

        char[][] board2 = {
            {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("Is board2 valid? " + recursion.isValidSudoku(board2));
*/
        String original = "Hello, world!";
        String reversed = reverseString(original);
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
      }

}

