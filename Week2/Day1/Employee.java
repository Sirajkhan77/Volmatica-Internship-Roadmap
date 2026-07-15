package Week2.Day1;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private Department department;
    private Address address;

    public Employee(int id, String name, double salary, Department department, Address address) {
        setId(id);
        setName(name);
        setSalary(salary);
        setDepartment(department);
        setAddress(address);
    }
    public int getId() {return id;}
    public void setId(int id) {
        if (id<=0){
            throw new IllegalArgumentException("ID must be a positive integer");
        }
        this.id = id;
    }
    public String getName() {return name;}
    public void setName(String name) {
        if  (name.length()<3 || name.length()>100 || name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name must be between 1 and 100 characters");
        }
        this.name = name;
    }

    public double getSalary() {return salary;}
    public void setSalary(double salary) {
        if (salary<=0){
            throw new IllegalArgumentException("Salary must be a positive integer");
        }
        this.salary = salary;
    }
    public void setDepartment(Department department) {
        if (department == null) {
            throw new IllegalArgumentException("Employee must be assigned to a department.");
        }
        this.department = department;
    }

    public Address getAddress() { return address; }

    public void setAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("Employee must have an address.");
        }
        this.address = address;
    }

    public static void main(String[] args) {
        Department department1 = new Department("Java Spring Boot", "1056");
        Address address1 = new Address("Street 95","Islamabad", "44800");
        Employee emp = new Employee(12, "Siraj", 123, department1, address1);
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
        System.out.println(emp.getAddress().toString());
    }
}
