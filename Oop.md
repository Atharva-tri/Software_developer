class Employee {
    private int empId;
    private String name;
    private double monthlySalary;

    public void setEmployeeDetails(int id, String empName, double salary) {
        empId = id;
        name = empName;
        monthlySalary = salary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeDetails(101, "Aachal Ghuge", 25000);
        emp1.displayEmployeeDetails();
    }
}
