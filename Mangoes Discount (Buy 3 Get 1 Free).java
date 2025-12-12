import java.util.Scanner;

public class MangoDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of mangoes: ");
        int n = sc.nextInt();

        System.out.print("Enter price per mango: ");
        int price = sc.nextInt();

        int free = n / 4;
        int payable = n - free;

        int amount = payable * price;

        System.out.println("Free mangoes: " + free);
        System.out.println("Total amount to pay: " + amount);
    }
}
