import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String retVal = "";
        boolean done = false;

        String SSN = SafeInput.getRegExString(in, "Enter your SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + SSN);

        String MNumber = SafeInput.getRegExString(in, "Enter your UC student M number", "^(M|m)\\d{5}$");
        System.out.println("Your UC student M number is: " + MNumber);

        String menu = SafeInput.getRegExString(in, "Enter your choice", "^[OoSsVvQq]$");
        System.out.println("Your choice is: " + menu);

    }
}
