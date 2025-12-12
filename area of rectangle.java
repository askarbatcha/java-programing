import java.util.Scanner;
public class q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length and width:");
        int length = sc.nextInt();
        int width = sc.nextInt();
        int area = (length * width);
        System.out.println("Area of rectangle is " + area);
    }
}
