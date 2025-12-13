import java.util.Scanner;
public class c2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter minutes");
    double min = sc.nextDouble();
    // System.out.println("minutes to seconds");
       double seconds =min*60;
    System.out.println(min + " minutes :"+seconds + " seconds ");
    }
}
