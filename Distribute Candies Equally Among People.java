import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total candies: ");
        int candies = sc.nextInt();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int eachGets = candies / people;
        int remaining = candies % people;

        System.out.println("Each person gets: " + eachGets);
        System.out.println("Remaining candies: " + remaining);
    }
}
