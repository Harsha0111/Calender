public class Encapsulation {
    private int id;
    private int salary;
    private String name;

    private String role;

    public Encapsulation() {

    }

    public Encapsulation(int id, int salary, String name, String role) {
        this.id = id;
        this.salary = salary;
        this.role = role;
        this.name = name;
    }

    public void empData(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getEmployeeWithSalary() {
        return name + " = " + salary;
    }

    // another method
    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

