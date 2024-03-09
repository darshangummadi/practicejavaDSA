import java.util.*;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        //pre computing
        int[] hash = new int[256];
        for (int i = 0; i < s.length() ; i++) {
            hash[s.charAt(i)]++;
        }

        int q = sc.nextInt();
        while (q-->0){
            char c = sc.next().charAt(0);
            System.out.println(hash[c]);
        }

        sc.close();
      }

}

