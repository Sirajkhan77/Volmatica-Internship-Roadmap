package Week2.Day2;
interface Payable {
    double calculatePayment();
}
class Employee2 implements Payable {
    private String name;
    private double annualSalary;
    public Employee2(String name, double annualSalary) {
        this.name = name;
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculatePayment() {
        return annualSalary / 12.0;
    }
}
class Contractor implements Payable {
    private String name;
    private double hourlyRate;
    private double hoursWorked;
    public Contractor(String name, double hourlyRate, double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    @Override
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }
}


