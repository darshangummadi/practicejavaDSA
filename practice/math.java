package practice;
import  java.util.*;

public class math {
    static int count_digits(int N){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in array:");      
        N = scanner.nextInt();
        scanner.close();
        int x = N;
        int counter = 0;
        while (x!=1){
            x = x/10;
            counter++;
        }
        return counter;
    }
    
    /**
     * @param args
     */
    public static void main (String [] args) {
        Scanner scanner =  new Scanner(System.in);
         int N  = scanner.nextInt();
         count_digits(N);
         scanner.close();
    }
}