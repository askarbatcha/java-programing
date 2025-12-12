import java.util.Scanner;

public class TotalCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cakes made per hour: ");
        int cakesPerHour = sc.nextInt();

        System.out.print("Total working hours: ");
        int hours = sc.nextInt();

        int totalCakes = cakesPerHour * hours;

        System.out.println("Total cakes made: " + totalCakes);
    }
}
