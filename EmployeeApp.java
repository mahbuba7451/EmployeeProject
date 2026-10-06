import java.util.Scanner;

public class EmployeeApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setId(input.nextInt());
        input.nextLine();

        System.out.print("Enter Employee Name: ");
        emp.setName(input.nextLine());

        System.out.print("Enter Employee Salary: ");
        emp.setSalary(input.nextDouble());

        System.out.println("\nEmployee Information:");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        input.close();
    }
}
