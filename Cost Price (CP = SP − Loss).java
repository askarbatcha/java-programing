import java.util.Scanner;

public class CostPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        System.out.print("Enter Loss: ");
        double loss = sc.nextDouble();

        double cp = sp - loss;

        System.out.println("Cost Price = " + cp);
    }
}
