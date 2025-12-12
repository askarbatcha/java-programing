import java.util.Scanner;
public class q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        int side = sc.nextInt();
        int area = (side * side);
        System.out.println("Area of Square is: " + area);
    }
}
