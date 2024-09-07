import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,i;
        double b,d;
        String u,s;
        i = 4;
        d = 4.0f;
        s = "HackerRank ";

        try{
            a = scanner.nextInt();
            b = scanner.nextDouble();

            scanner.nextLine();
            u = scanner.nextLine();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: Invalid input type. Please enter a valid double, int, and string.");
            return;
        }
        System.out.println(i + a);
        System.out.println(d + b);
        System.out.println(s + u);

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}