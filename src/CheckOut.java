import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            double itemPrice = 0;
            String trash = "";
            boolean done = false;
            String input = "";
            boolean moreItems  = false;
            double totalCost = 0;

            do {
                itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item ", .50, 10.00);
                totalCost += itemPrice;

                moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");
                if (!moreItems) {
                    done = true;
                }
            }while (!done);

            System.out.printf("Total cost: %.2f\n", totalCost);

        }
    }