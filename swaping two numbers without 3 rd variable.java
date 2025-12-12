import java.util.Scanner;
public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value:");
        int a = sc.nextInt();
        System.out.println("Enter B value:");
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swaping: ");
        System.out.println("A:" + a);
        System.out.println("B:" + b);
    }
}
