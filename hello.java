import java.util.Scanner;
import java.util.Map;
import java.util.AbstractMap;
import java.util.*;
class hello {
    static void pattern1(int N)
 {
     for (int i = 0; i < N; i++){
         for (int j = 0; j < N; j++){
            System.out.print("* ");
         }
         System.out.println();
     }
}
    static void pattern2(int N){
        for (int i = 0;i<N;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int N){
        for (int i = 1;i<=N;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int N){
        for (int i = 1;i<=N;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

public static void main(String[] args) {

         Scanner scanner =  new Scanner(System.in);
         int N  = scanner.nextInt();
         // Here, we have taken the value of N as 5.
         // We can also take input from the user.
         pattern4(N);
         scanner.close();


         Map.Entry<Integer,String> pair = new AbstractMap.SimpleEntry<>(6,"six");
         int key =  pair.getKey();
         String value = pair.getValue();
         System.out.println("The number is: "+key+" and its word form is: "+value);


         Pair<Integer, String> pair1 = new Pair<Integer,String>(1, "Hello");
         int key1 = pair1.getKey();
         String value1 = pair1.getValue();
        System.out.println(value1+":"+key1);


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("printing some element of the list: " + list.get(0));
        
        for (int num : list){
            System.out.println("Iterating the arraylist " + num +" " +list.size());
        }

        list.remove(1);
        System.out.println("\nAfter removing an element, printing the list:\n");
        for (int num : list){
            System.out.println("Iterating the arraylist after removal " + num);
        }
        System.out.println("size " + list.size());
     }
}

