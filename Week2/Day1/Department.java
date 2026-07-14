package Week2.Day1;

public class Department {
    private String name;
    private String departmentCode;

    public Department(String name, String departmentCode) {
        setName(name);
        setDepartmentCode(departmentCode);
    }

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Department name cannot be empty.");
        }
        this.name = name;
    }

    public String getDepartmentCode() { return departmentCode; }

    public void setDepartmentCode(String departmentCode) {
        if (departmentCode == null || departmentCode.length() < 2) {
            throw new IllegalArgumentException("Department code must be at least 2 characters.");
        }
        this.departmentCode = departmentCode.toUpperCase();
    }
}