import java.util.Scanner;

public class FavNumbers
{
    public static void main(String [] argS)
    {
        Scanner in = new Scanner(System.in);
        int favNumber = 0;
        String favDouble = "";

        favNumber = SafeInput.getInt(in, "Enter your favorite integer");
        favDouble = String.valueOf(SafeInput.getDouble(in, "Enter your favorite double"));
        System.out.println("Your favorite integer is " + favNumber + " and your favorite double is " + favDouble);
    }
}
