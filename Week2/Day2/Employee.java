package Week2.Day2;

abstract class Employee {
    void login() {
        System.out.println("Employee Logged In");
    }
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 50000;
    }
}
class PartTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 20000;
    }
}
