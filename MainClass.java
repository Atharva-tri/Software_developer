class Employee {

    // Encapsulated data members
    private int empId;
    private String name;
    private double salary; // monthly salary

    // Method to assign values
    public void setDetails(int id, String empName, double empSalary) {
        empId = id;
        name = empName;
        salary = empSalary;
    }

    // Method to calculate annual salary
    public double AnnualSalary() {
        return salary * 12;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + AnnualSalary());
    }
}

// Main class
public class MainClass {
    public static void main(String[] args) {

        // Creating object of Employee class
        Employee emp1 = new Employee();

        // Assigning values to object
        emp1.setDetails(101, "Joey Tribbiani", 50000);

        // Displaying employee details
        emp1.displayDetails();
    }
}
