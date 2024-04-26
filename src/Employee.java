import java.util.Objects;

public class Employee {
    private static int generator = 1;

    private String name;
    private String department;
    private double salary;
    private int id;


    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = generator;
        generator++;
    }

    public String getName() {
        return name;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGenerator() {
        return generator;
    }

    public void setGenerator(int generator) {
        this.generator = generator;
    }

    @Override
    public String toString() {
        return "Id Сотрудника: " + getId() + " ФИО сотрудника - " + getName() + " отдел - " + getDepartment() + " заработная плата сотрудника - " + getSalary() + " рублей.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}