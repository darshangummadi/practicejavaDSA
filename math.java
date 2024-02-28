import  java.util.*;

public class math {
    static int count_digits(int n)
    {
       int x = n; int count =0;
       while( x!=0 ) 
      {
          x = x / 10;
          count++;
      }
       return count;
    }
    static int stringify(int n){
        String s = Integer.toString(n);
        int ch = s.length();
        return ch;
    }
    static int count_digits1(int n){
        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }
    static int reversify(int n){
        int original = n;
        int ld;
        int revNum = 0;
        while(n>0){
            ld = n % 10;
            revNum = (revNum * 10) + ld;
            n = n/10;
        }
        if (original == revNum)
           return 1;
           else
               return 0;
    }
    static int palindrome(int n){
        if(reversify(n) == n)
            return 1;
        else
            return 0;
    }
    static int checkForPrime(int n){
        int counter = 0;
        for (int i=1;i<=n;i++){
            if (n%i == 0){
                counter ++;
            }
    }
    return counter;
}
    static ArrayList<String> allFactors(int n){
        ArrayList<String> arrayList = new ArrayList<>();
        for  (int i=1;i<=n;i++) {
            if  (n % i==0)
            arrayList.add(i + "");
        }

        return  arrayList;
    }
    static int greatestCommonDiv(int n1,int n2){
        int k = Math.min(n1, n2);
        int gcd = 1;
        for (int i=1;i<=k;i++){
            if  ((n1 % i==0) && (n2 % i==0))
            gcd = i;
        }
        return gcd;
    }
    static int highestCommon(int n1, int n2){
        
        return 0;
    }   
    public static void main (String [] args) {
            Scanner scanner =  new Scanner(System.in);
            int N1  = scanner.nextInt();
            int N2 =  scanner.nextInt();
            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            greatestCommonDiv(N1,N2);
            scanner.close(); 
            System.out.println(greatestCommonDiv(N1, N2));     
            //System.out.println("reverse of " + N + " is " +palindrome(N));


   
    }
}