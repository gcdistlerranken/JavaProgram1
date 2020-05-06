import java.util.Scanner;
import java.text.DecimalFormat;

public class Problem5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double price = 0.00;
        double subTotal = 0.00;
        double tax = 0.00;
        double total = 0.00;

        DecimalFormat d = new DecimalFormat("'$'0.00");

        System.out.println("Enter Prices to Compute Total." +
                            "\nTo Compute Total Enter a Negative Number.\n");

        while (price >= 0)
        {
            System.out.print("Enter Price: ");
            price = scan.nextDouble();

            if(price > 0)
            {
                subTotal += price;
            }
        }
        tax = (subTotal * 0.08);
        total = subTotal + tax;

        System.out.println("Subtotal: " + (d.format(subTotal)) +
                "\nTax(8%): " + (d.format(tax)) +
                "\nTotal: " + (d.format(total)));
    }

}
