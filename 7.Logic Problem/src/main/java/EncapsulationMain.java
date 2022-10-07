public class EncapsulationMain {
    public static void main(String[] args) {
//        Encapsulation encapsulation = new Encapsulation(1, 4000, "Harsha", "Dancoin");
//        encapsulation.empData(1, "Harsha", 6500);
//        encapsulation.setRole("Sleeping");

//        Encapsulation encapsulationTwo = new Encapsulation();
//        encapsulationTwo.empData(2, "Devi", 6100);

//        System.out.println(encapsulation.getEmployeeWithSalary() + encapsulation.getRole());
//        System.out.println(encapsulationTwo.getName() + " = " + encapsulationTwo.getSalary());


        Employee employeeOne = new Employee(1, 2378, "harsh", "Employee");
        Employee employeeTwo = new Employee();
        employeeTwo.setId(1);
        employeeTwo.setName("Mano");
        employeeTwo.setRole("Employee");
        employeeTwo.setSalary(4555);
        Employee employeeThree = new Employee();
        employeeThree.setEmployee(1, 2378, "Ha", "Employee");

        System.out.println(employeeOne.getId() + employeeOne.getSalary() + employeeOne.getName() + employeeOne.getRole());
        System.out.println(employeeTwo.getId() + " " + employeeTwo.getSalary() + " " + employeeTwo.getRole() + " " + employeeTwo.getName());
        System.out.println(employeeThree.getId() + " " + employeeThree.getSalary() + " " + employeeThree.getRole() + " " + employeeThree.getName());
    }
}
