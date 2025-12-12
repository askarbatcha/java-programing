import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA %: ");
        double hraPercent = sc.nextDouble();

        System.out.print("Enter DA %: ");
        double daPercent = sc.nextDouble();

        double hra = basic * hraPercent / 100;
        double da = basic * daPercent / 100;
        double totalSalary = basic + hra + da;

        System.out.println("Total Salary = " + totalSalary);
    }
}
