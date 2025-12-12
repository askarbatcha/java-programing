import java.util.Scanner;
public class q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fah = sc.nextDouble();
        double celsius = ((fah - 32) * 5/9);
        System.out.println("tempearute in Celsius: "+ celsius);
    }
}
