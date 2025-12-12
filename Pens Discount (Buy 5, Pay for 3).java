import java.util.Scanner;

public class PenDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of pens: ");
        int pens = sc.nextInt();

        System.out.print("Enter price per pen: ");
        int price = sc.nextInt();

        int sets = pens / 5;
        int remaining = pens % 5;

        int payablePens = sets * 3 + remaining;
        int amount = payablePens * price;

        System.out.println("Total amount to pay: " + amount);
    }
}

