import java.util.Scanner;
public class q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A,B value:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = (a==b)?"Equal":"Not Equal";
        System.out.println("Two numbers are equal: " + result);
    }
}
