import java.util.Scanner;
public class q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        double b = a*a;
        double c = a*a*a;
        System.out.println("Square root of " + a + " is: " + b);
        System.out.println("Cubic root of " + a + " is: " + c);

    }
}
