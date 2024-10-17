import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        double salary = 0;
        /*
        firstName = getNonZeroLenString(in, "Enter your first name");
        System.out.println("Hello, " + firstName + "!");

        age = getInt(in, "enter your age");
        System.out.println("Your age is " + age);
        */
        salary = getDouble(in, "Enter your salary");
        System.out.println("Your salary is: " + salary);

    }

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if(retVal.isEmpty())
                System.out.println("You must enter at least one character!");

        }while(retVal.isEmpty());

        return retVal;
    }

    /**
     * gets an int value from the user at the console without no constraint
     *
     * @param pipe a Scanner used to get the input
     * @param prompt the Prompt that tells the user what to enter
     * @return an int of any value
     */

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number!");
            }

        }while(!done);

        return retVal;

    }

    /**
     *gets a double value from user
     *
     * @param pipe
     * @param prompt
     * @return
     */

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double!");
            }

        } while (!done);

        return retVal;
    }
}