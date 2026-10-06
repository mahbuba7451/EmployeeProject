public class EmployeeApp {

    public static void main(String[] args) {

        // Using Constructor 1
        Employee emp1 = new Employee();
        emp1.setName("Rahim");
        emp1.setId(101);
        emp1.setSalary(25000);

        System.out.println("Employee 1:");
        emp1.display();

        // Using Constructor 2
        Employee emp2 = new Employee("Karim", 102, 30000);

        System.out.println("\nEmployee 2:");
        emp2.display();

        // Using Getter Methods
        System.out.println("\nUsing Getter Methods:");
        System.out.println(emp2.getName());
        System.out.println(emp2.getId());
        System.out.println(emp2.getSalary());
    }
}
