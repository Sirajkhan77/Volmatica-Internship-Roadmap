package Week2.Day1;

public class ProceduralApp {
    public static void main(String[] args) {
        String[] names = {"Zain", "Amir", "Umer", "Saqlain"};
        String[] roles = {"Backend", "Frontend", "DevOps", "QA"};
        double[] salaries = {60000, 55000, 65000, 50000};
        salaries[0] = applyRaise(salaries[0], 10);
        printEmployee(names[0], roles[0], salaries[0]);
    }

    public static double applyRaise(double currentSalary, double percentage) {
        return currentSalary + (currentSalary * (percentage / 100));
    }

    public static void printEmployee(String name, String role, double salary) {
        System.out.println(name + " (" + role + ") - $" + salary);
    }
}
