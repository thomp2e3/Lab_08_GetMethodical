public class PrettyHeader
{
    public static void prettyHeader(String msg)
    {
        int width = 60;

        for (int i = 0; i < width; i++)
        {
            System.out.print("*");
        }

        System.out.println();

        int msgLen = msg.length();
        int space = width - msgLen - 6;
        int leftSpace = space / 2;
        int rightSpace = space - leftSpace;

        System.out.print("***");
        for (int i = 0; i < leftSpace; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightSpace; i++)
        {
            System.out.print(" ");
        }
        System.out.println("***");

        for(int i = 0; i < width; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        prettyHeader("Message Centered Here");
    }
}
