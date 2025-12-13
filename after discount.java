import java.util.Scanner;
public class c1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original price :");
        // int a = sc.nextInt();
        double price = sc.nextDouble();
        System.out.println("enter the discount price : ");
        double dp = sc.nextDouble();
         dp = (price * dp / 100);
         price = (price - dp);
         System.out.println("discount price :" +price);
    }
}
      
