import java.util.Scanner;

public class JavaInttoString {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String s;
        s = Integer.toString(n);
        if((s instanceof String))
        {
            System.out.println("Good job");
        }
        else
        {
            System.out.println("Wrong Answer");
        }
    }
}
