public class Employee {
    private int id;
    private int salary;
    private String name;
    private String role;

    public Employee() {

    }

    public Employee(int id, int s, String name, String role) {
        this.id = id;
        salary = s;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEmployee(int id, int salary, String name, String role) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.role = role;
    }
}
