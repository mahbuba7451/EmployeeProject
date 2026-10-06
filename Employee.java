public class Employee {

    private String name;
    private int id;
    private double salary;

    // Constructor 1 - Default Constructor
    Employee() {
        name = "Unknown";
        id = 0;
        salary = 0.0;
    }

    // Constructor 2 - Parameterized Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Setter Methods
    void setName(String name) {
        this.name = name;
    }

    void setId(int id) {
        this.id = id;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter Methods
    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    double getSalary() {
        return salary;
    }

    // Display Method
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}
