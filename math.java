import  java.util.*;

public class math {
    static int count_digits(int N){
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        scanner.close();
        int x = N;
        int counter = 0;
        while (x!=1){
            x = x/10;
            counter++;
            System.out.println(counter);
        }
        return counter;
        
    }
        public static void main (String [] args) {
        Scanner scanner =  new Scanner(System.in);
         int N  = scanner.nextInt();
         count_digits(N);
         scanner.close();
         
    }
}