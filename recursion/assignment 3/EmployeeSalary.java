import java.util.Scanner;

public class EmployeeSalary {
    public static double[] addTaxToSalaries(double[] salaries) {
        double[] salariesWithTax = new double[salaries.length];
        for (int i = 0; i < salaries.length; i++) {
            salariesWithTax[i] = salaries[i] * 1.1; // Add 10% tax
        }
        return salariesWithTax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int count = scanner.nextInt();

        double[] salaries = new double[count];

        System.out.println("Enter the salaries:");

        for (int i = 0; i < count; i++) {
            salaries[i] = scanner.nextDouble();
        }

        double[] salariesWithTax = addTaxToSalaries(salaries);

        System.out.println("Salaries with tax:");
        for (int i = 0; i < count; i++) {
            System.out.println(salariesWithTax[i]);
        }
        scanner.close();
    }
}
