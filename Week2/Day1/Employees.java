package Week2.Day1;

public class Employees {
    private String name;
    private String role;
    private double salary;
    public Employees(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
    public String getName() { return name; }
    public String getRole() { return role; }
    public double getSalary() { return salary;}

    public void applyRaise(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        }
    }

    public void printDetails() {
        System.out.println(this.name + " (" + this.role + ") - $" + this.salary);
    }
}