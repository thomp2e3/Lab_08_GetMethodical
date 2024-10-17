import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        int age = 0;
        double salary = 0;
        int favNum = 0;
        double contrained = 0; // must be between 100-1k

        /*
        firstName = getNonZeroLenString(in, "Enter your first name");
        System.out.println("Hello, " + firstName + "!");

        age = getInt(in, "enter your age");
        System.out.println("Your age is " + age);

        salary = getDouble(in, "Enter your salary");
        System.out.println("Your salary is: " + salary);

        favNum = getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.println("Your favorite number is " + favNum);
         */

        contrained = getRangedDouble(in, "Enter the constrained double ", 100, 10000);
        System.out.println("Constrained is: " + contrained);

    }

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retVal = "";

        do {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.isEmpty())
                System.out.println("You must enter at least one character!");

        } while (retVal.isEmpty());

        return retVal;
    }

    /**
     * gets an int value from the user at the console without no constraint
     *
     * @param pipe   a Scanner used to get the input
     * @param prompt the Prompt that tells the user what to enter
     * @return an int of any value
     */

    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number!");
            }

        } while (!done);

        return retVal;

    }

    /**
     * gets a double value from user
     *
     * @param pipe   used to get input
     * @param prompt prompt to tell user what to enter
     * @return int of any value
     */

    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double!");
            }

        } while (!done);

        return retVal;
    }

    /**
     * gets an integer from the user via a console within a specified range
     *
     * @param pipe   scanner for input
     * @param prompt prompt to tell user requirements
     * @param low    inclusive low bound
     * @param high   inclusive high bound
     * @return in within specified bounds
     */

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
                if (retVal >= low && retVal <= high) {
                    done = true;
                }
                else
                {
                    trash = pipe.nextLine();
                    System.out.println("You must enter a value within the range [" + low + " to " + high + "]!");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid value!");
            }

        } while (!done);

        return retVal;

    }

    /**
     * gets an integer from the user via console within a specified
     *
     * @param pipe
     * @param prompt
     * @return
     */

    public static int getRangedDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid number!");
            }

        } while (!done);

        return retVal;

    }
}


