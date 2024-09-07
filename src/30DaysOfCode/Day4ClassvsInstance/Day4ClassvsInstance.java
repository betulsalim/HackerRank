import java.util.Scanner;

public class Day4ClassvsInstance{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++)
        {
            int initialAge = scanner.nextInt();
            Person objPerson = new Person(initialAge);
            objPerson.amIOld();

            for (int j = 0; j < 3; j++)
            {
                objPerson.yearsPassed();
            }
            objPerson.amIOld();
            System.out.println();
        }
        scanner.close();
    }
}
class Person
{
    private int age;
    public Person(int initialAge)
    {
        if (initialAge < 0)
        {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        }
        else
        {
            this.age = initialAge;
        }
    }

    public void yearsPassed()
    {
        this.age++;
    }
    public void amIOld() {
        if (age < 13) {
            System.out.println("You are young.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

