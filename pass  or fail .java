import java.util.Scanner;
public class q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:");
        int marks = sc.nextInt();
        if(marks>=50){
            System.out.println(marks + " is Pass Mark.");
        }
        else{
            System.out.println("Fail.");
        }
    }
}
