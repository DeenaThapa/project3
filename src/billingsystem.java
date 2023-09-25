import java.util.Scanner;

public class billingsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of items:");
        int count = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 1; i <= count; i++) {
            System.out.print("enter a name for the item" + i + ": ");
            String itemName = sc.nextLine();
            System.out.print("enter the quantity for" + itemName + ": ");
            int quantity = sc.nextInt();
            System.out.print("enter price for the item " + itemName + ": ");
            double price = sc.nextDouble();

            double Total = quantity * price;
            total += Total;

            sc.nextLine();
        }

        double vat = total * 0.13;
        double discount = total * 0.10;
        double finalTotalCost = total + vat - discount;

        System.out.println("-------- Bill --------");
        System.out.println("Total Cost = rupees" + total);
        System.out.println("VAT (10%) =  rupees" + vat);
        System.out.println("Discount (10%): rupees" + discount);
        System.out.println("Final Total Cost: rupees" + finalTotalCost);

        sc.close();
    }
}





